import Series.SquareSeries;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Create object of SquareSeries from Series package
        SquareSeries series = new SquareSeries();
        series.printSeries(n);

        sc.close();
    }
}
