import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.next();
        System.out.println(str + " is " + (isPalindrome(str) ? "a palindrome" : "not a palindrome"));
        scanner.close();
    }

    static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
