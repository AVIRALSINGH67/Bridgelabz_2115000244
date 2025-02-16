import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareMethods {
    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        countWordsInLargeFile("Text1.txt");
    }

    public static void compareStringBuilderAndBuffer() {
        long startTime, endTime;
        int iterations = 1000000;

        // StringBuilder
        startTime = System.nanoTime();
        StringBuilder sbBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbBuilder.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder: " + (endTime - startTime) + " ns");

        // StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbBuffer.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer: " + (endTime - startTime) + " ns");
    }

    public static void countWordsInLargeFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int wordCount = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Word count in file: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}