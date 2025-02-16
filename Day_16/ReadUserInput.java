import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUserInput {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("Text1.txt")) {

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}