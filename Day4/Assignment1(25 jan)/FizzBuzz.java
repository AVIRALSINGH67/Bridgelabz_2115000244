 import java.util.Scanner;
 
public class FizzBuzz {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
    	System.out.println("Enter a number for FizzBuzz:");
    	int num = sc.nextInt();
    	String[] fizzBuzzArray = new String[num + 1];
 
    	for (int i = 0; i <= num; i++) {
        	if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i] = "FizzBuzz";
        	} else if (i % 3 == 0) {
                fizzBuzzArray[i] = "Fizz";
        	} else if (i % 5 == 0) {
                fizzBuzzArray[i] = "Buzz";
        	} else {
                fizzBuzzArray[i] = String.valueOf(i);
        	}
    	}
 
    	for (int i = 0; i <= num; i++) {
        	System.out.println("Position " + i + " = " + fizzBuzzArray[i]);
    	}
    	sc.close();
	}
}

