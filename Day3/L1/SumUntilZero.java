import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double number;
        while (true) {
            number = sc.nextDouble();
            if (number == 0) {
                break;
            }
            total += number;
        }
        System.out.println("Total: " + total);
 sc.close();
   }
}