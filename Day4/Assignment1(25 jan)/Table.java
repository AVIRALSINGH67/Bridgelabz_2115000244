
 
import java.util.Scanner;
 
public class Table {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
    	System.out.println("Enter a number for table from 6 to 9:");
    	int num = sc.nextInt();
 
    	for (int i = 6; i <= 9; i++) {
        	System.out.println(num + " * " + i + " = " + (num * i));
    	}
    	sc.close();
	}
}

