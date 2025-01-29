import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int terms = scanner.nextInt();
        generateFibonacci(terms);
        scanner.close();
    }

    static void generateFibonacci(int terms) {
        int a = 0, b = 1, c;
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
