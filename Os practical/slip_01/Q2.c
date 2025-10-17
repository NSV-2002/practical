/*Q.1 Create a child process using fork(), display parent and child process id. Child process will
display the message “Hello World” and the parent process should display “Hi”.
[10 marks]
*/
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>

int main() {
   pid_t pid;
   pid = fork();
   if (pid < 0) {
       perror("fork");
       exit(1);
   } else if (pid == 0) {
       printf("Child Process (PID: %d): Hello World\n", getpid());
   } else{
     printf("Parent Process (PID: %d): Hi\n", getpid());
   }
return 0;
}