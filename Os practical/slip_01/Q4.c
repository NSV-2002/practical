/*1 Write a program to illustrate the concept of orphan process ( Using fork() and sleep())*/
#include <stdio.h>      // For printf(), perror()
#include <stdlib.h>     // For exit()
#include <unistd.h>     // For fork(), getpid(), sleep()
#include <sys/types.h>  // For pid_t
#include <sys/wait.h>   // For wait()

int main() {
    pid_t pid;
    pid = fork();

    if (pid < 0) {
        perror("fork failed");
        exit(1);
    }
    else if (pid == 0) {
        // Child process
        printf("Child Process (PID: %d) is sleeping for 5 seconds...\n", getpid());
        sleep(5);
        printf("Child Process (PID: %d) is now awake!\n", getpid());
        printf("Child Process (PID: %d) is still running after Parent terminated.\n", getpid());
    }
    else {
        // Parent process
        printf("Parent Process (PID: %d) will terminate now.\n", getpid());
        exit(0); // Parent exits before child finishes
    }

    return 0;
}
