import java.util.Scanner;
public class SumOfNaturalNumbersFor {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n > 0) {
        int formulaSum = (n * (n + 1)) / 2;
        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }
        System.out.println("Formula Sum: " + formulaSum + ", Loop Sum: " + loopSum);
    } else {
        System.out.println("Not a valid natural number");
sc.close();
    }
}
}