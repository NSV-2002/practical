import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        String sourceFile = "source.txt";   // Input file
        String destFile = "destination.txt"; // Output file

        try (
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toUpperCase()); // Convert to uppercase
                bw.newLine();
            }
            System.out.println("File copied successfully in uppercase!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
