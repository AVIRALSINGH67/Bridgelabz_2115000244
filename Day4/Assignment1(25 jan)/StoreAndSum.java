
import java.util.Scanner;
 
public class StoreAndSum {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double[] numbers = new double[10];
    	double total = 0.0;
    	int index = 0;
 
    	System.out.println("Enter numbers (stop with 0 or negative):");
    	while (index < 10) {
        	double input = sc.nextDouble();
        	if (input <= 0) break;
        	numbers[index++] = input;
    	}
 
    	for (int i = 0; i < index; i++) {
        	total += numbers[i];
        	System.out.println("Number[" + i + "] = " + numbers[i]);
    	}
    	System.out.println("Total = " + total);
    	sc.close();
	}
}

