import java.util.Scanner;
public class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formulaSum = (n * (n + 1)) / 2;
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            System.out.println("Formula Sum: " + formulaSum + ", Loop Sum: " + loopSum);
        } else {
            System.out.println("Not a valid natural number");
        }
sc.close();
    }
}