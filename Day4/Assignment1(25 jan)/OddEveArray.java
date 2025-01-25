
import java.util.Scanner;
 
public class OddEveArray {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
    	System.out.println("Enter a number:");
    	int num = sc.nextInt();
 
    	if (num < 1) {
        	System.out.println("Invalid input. Must be a natural number.");
        	return;
    	}
 
    	int[] odd = new int[num / 2 + 1];
    	int[] even = new int[num / 2 + 1];
    	int oddIndex = 0, evenIndex = 0;
 
    	for (int i = 1; i <= num; i++) {
        	if (i % 2 == 0) {
                even[evenIndex++] = i;
        	} else {
                odd[oddIndex++] = i;
        	}
    	}
 
    	System.out.println("Odd numbers:");
    	for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");
 
    	System.out.println("\nEven numbers:");
    	for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
 
    	sc.close();
	}
}
