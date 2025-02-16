import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrences {
    public static int countWord(String filename, String targetWord) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {
        int occurrences = countWord("Text1.txt", "Line");
        System.out.println("Occurrences of 'example': " + occurrences);
    }
}