import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        String fileName = "input.txt"; // Change this to your file name

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++; // Count lines
                charCount += line.length(); // Count characters (excluding newline)
                
                // Count words
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() != 0) { // Check for empty line
                    wordCount += words.length;
                }
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
