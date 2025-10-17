#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>

#define MAX_PROCESSES 10

typedef struct {
    int id;
    int arrival_time;
    int burst_time;
    int remaining_time;
    int waiting_time;
    int turnaround_time;
} Process;

void generate_random_burst(Process *p) {
    p->burst_time = rand() % 10 + 1;
    p->remaining_time = p->burst_time; 
}

void calculate_times(Process processes[], int n, int quantum) {
    int current_time = 0;
    int completed = 0;
    int total_waiting_time = 0;
    int total_turnaround_time = 0;

    while (completed < n) {
        bool found = false;

        for (int i = 0; i < n; i++) {
            if (processes[i].arrival_time <= current_time && processes[i].remaining_time > 0) {
                found = true;
                if (processes[i].remaining_time > quantum) {
                    current_time += quantum;
                    processes[i].remaining_time -= quantum;
                } else {
                    current_time += processes[i].remaining_time + 2; 
                    processes[i].waiting_time = current_time - processes[i].arrival_time - processes[i].burst_time;
                    processes[i].turnaround_time = current_time - processes[i].arrival_time;
                    total_waiting_time += processes[i].waiting_time;
                    total_turnaround_time += processes[i].turnaround_time;
                    processes[i].remaining_time = 0;
                    completed++;
                }
            }
        }

        if (!found) {
            current_time++;
        }
    }

    printf("Average Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
}

void print_gantt_chart(Process processes[], int n, int quantum) {
    int current_time = 0;
    printf("Gantt Chart:\n");
    printf("Time 0 ");
    
    while (true) {
        bool all_done = true;
        for (int i = 0; i < n; i++) {
            if (processes[i].arrival_time <= current_time && processes[i].remaining_time > 0) {
                all_done = false;
                if (processes[i].remaining_time > quantum) {
                    printf("| P%d ", processes[i].id);
                    current_time += quantum;
                    processes[i].remaining_time -= quantum;
                } else {
                    printf("| P%d ", processes[i].id);
                    current_time += processes[i].remaining_time + 2; 
                    processes[i].waiting_time = current_time - processes[i].arrival_time - processes[i].burst_time;
                    processes[i].turnaround_time = current_time - processes[i].arrival_time;
                    processes[i].remaining_time = 0;
                }
            }
        }
        if (all_done) break;
    }
    printf("| %d\n", current_time);
}

void print_process_times(Process processes[], int n) {
    printf("\nProcess | Arrival Time | Burst Time | Waiting Time | Turnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("   P%d   |      %d      |     %d     |      %d      |        %d\n",
               processes[i].id, processes[i].arrival_time,
               processes[i].burst_time, processes[i].waiting_time,
               processes[i].turnaround_time);
    }
}

int main() {
    srand(time(0));
    Process processes[MAX_PROCESSES];
    int n, quantum;

    printf("Enter number of processes (max %d): ", MAX_PROCESSES);
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        processes[i].id = i + 1;
        printf("Enter arrival time for process P%d: ", processes[i].id);
        scanf("%d", &processes[i].arrival_time);
        generate_random_burst(&processes[i]); 
    }

    printf("Enter time quantum: ");
    scanf("%d", &quantum);

    calculate_times(processes, n, quantum);
    print_gantt_chart(processes, n, quantum);
    print_process_times(processes, n);

    return 0;
}
1 