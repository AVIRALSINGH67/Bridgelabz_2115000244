import java.util.Scanner;
public class Leapif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
sc.close();
    }
}