import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteStream {
    public static void readFile(String filename, String charset) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), charset))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile("Text1.txt", "UTF-8");
    }
}