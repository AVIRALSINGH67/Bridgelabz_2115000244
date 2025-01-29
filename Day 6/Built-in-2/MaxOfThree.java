import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Maximum: " + findMax(a, b, c));
        scanner.close();
    }

    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
