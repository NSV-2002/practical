import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        String fileName = "abc.txt"; // File to read

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println("Contents of the file in uppercase:");
            while ((line = br.readLine()) != null) {
                // Convert line to uppercase and print
                System.out.println(line.toUpperCase());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
