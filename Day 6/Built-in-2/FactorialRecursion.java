import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println("Factorial: " + factorial(num));
        scanner.close();
    }

    static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
