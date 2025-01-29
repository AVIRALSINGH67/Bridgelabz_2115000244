import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println(num + " is " + (isPrime(num) ? "a prime number" : "not a prime number"));
        scanner.close();
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) if (num % i == 0) return false;
        return true;
    }
}
