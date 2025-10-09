// File: Series/SquareSeries.java
package Series;

public class SquareSeries {
    // Method to print square series
    public void printSeries(int n) {
        System.out.println("Square series of " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}
