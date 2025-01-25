
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        for (int i = 0; number != 0; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        System.out.print("Reversed number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
 sc.close();   }
}


