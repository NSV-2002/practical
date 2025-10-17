/*Q.1 Write a program that demonstrates the use of nice() system call. After a child process is started
using fork(), assign higher priority to the child using nice() system call.
*/
#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>
#include<errno.h>

int main(){
    pid_t pid = fork();

    if(pid < 0){
        perror("fork failed");
        return 1;
    }
    else if(pid == 0){
        int ret = nice(5);
        if(ret == -1 && errno != 0){
            perror("Nice failed");
        }

        printf("child process : PID = %d, new nice value : %d\n",getpid(),ret);
        for(int i = 0 ; i < 5 ; i++){
            printf("child process is running in iteration:%d\n",i+1);
            sleep(1);
        }
    }else {
        printf("parent process : PID = %d\n",getpid());
        for(int i = 0; i < 5; i++){
            printf("parent process is running in iteration:  %d\n",i+1);
            sleep(1);
        }
        wait(NULL);
        printf("child process finished\n");
    }
}