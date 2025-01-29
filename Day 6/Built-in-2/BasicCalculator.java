import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Choose operation (+, -, *, /):");
        char op = scanner.next().charAt(0);
        System.out.println("Result: " + calculate(a, b, op));
        scanner.close();
    }

    static double calculate(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (b != 0) ? a / b : Double.NaN;
            default -> Double.NaN;
        };
    }
}
