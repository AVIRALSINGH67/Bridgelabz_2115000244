import java.util.*;
public class ReverseString {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc.nextLine()));
    }
}