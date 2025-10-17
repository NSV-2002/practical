/*
Q. 1 Creating a child process using the command exec(). Note down process ids of the parent
and the child processes, check whether the control is given back to the parent after the child
process terminates.*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    pid_t pid = fork();

    if (pid < 0) {
        perror("Fork failed");
        exit(1);
    }
    else if (pid == 0) {
        // Child process
        printf("Child process (PID: %d)\n", getpid());
        
        // Replace child with "ls" command
        execlp("ls", "ls", NULL);
        
        // If execlp fails, this line will run
        perror("execlp failed");
        exit(1);
    }
    else {
        // Parent process
        printf("Parent process (PID: %d)\n", getpid());
        wait(NULL);
        printf("Child process terminated, control returned to parent.\n");
    }

    return 0;
}
