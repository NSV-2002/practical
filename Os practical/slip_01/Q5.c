/*1 Write a program to illustrate the concept of orphan process ( Using fork() and sleep())*/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    clock_t start_time = clock();  // Record start time
    long sum = 0;

    // Calculate sum of first 100 million numbers
    for (long i = 1; i <= 100000000; i++) {
        sum += i;
    }

    clock_t end_time = clock();  // Record end time

    // Calculate total time in seconds
    double time_taken = (double)(end_time - start_time) / CLOCKS_PER_SEC;

    printf("Sum: %ld\n", sum);
    printf("Time taken for execution: %f seconds\n", time_taken);

    return 0;
}
