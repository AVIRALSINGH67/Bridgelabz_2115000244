import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String feedback;

        while (true) {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (higher/lower/correct)");
            feedback = scanner.next().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it!");
                break;
            } else if (feedback.equals("higher")) low = guess + 1;
            else if (feedback.equals("lower")) high = guess - 1;
        }
        scanner.close();
    }
}
