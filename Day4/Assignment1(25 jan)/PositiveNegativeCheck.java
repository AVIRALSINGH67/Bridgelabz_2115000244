 
import java.util.Scanner;
 
public class PositiveNegativeCheck {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] numbers = new int[5];
 
    	System.out.println("Enter 5 numbers:");
    	for (int i = 0; i < 5; i++) {
        	numbers[i] = sc.nextInt();
    	}
 
    	for (int num : numbers) {
        	if (num > 0) {
                System.out.println(num + " is positive " + (num % 2 == 0 ? "and even" : "and odd"));
        	} else if (num < 0) {
                System.out.println(num + " is negative");
        	} else {
                System.out.println("Zero");
        	}
    	}
 
    	if (numbers[0] == numbers[4]) {
        	System.out.println("First and last elements are equal.");
    	} else if (numbers[0] > numbers[4]) {
        	System.out.println("First element is greater than the last.");
    	} else {
        	System.out.println("First element is less than the last.");
    	}
    	sc.close();
	}
}

