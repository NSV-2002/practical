#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
    pid_t pid;
    pid = fork();

    if (pid < 0) {
        perror("fork");
        exit(1);
    } 
    else if (pid == 0) {
        // Child process
        printf("Child Process (PID: %d) will execute 'ls' command...\n", getpid());
        
        // Execute the 'ls' command (list directory contents)
        execl("/bin/ls", "ls", NULL);

        // If execl() fails, this line will run
        perror("execl failed");
        exit(1);
    } 
    else {
        // Parent process
        printf("Parent Process (PID: %d) is going to sleep for 5 seconds...\n", getpid());
        sleep(5);
        printf("Parent Process (PID: %d) is awake now!\n", getpid());
    }

    return 0;
}
