import java.util.Scanner;
 
public class MeanHeight {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double[] heights = new double[11];
    	double sum = 0.0;
 
    	System.out.println("Enter heights of 11 players:");
    	for (int i = 0; i < 11; i++) {
        	heights[i] = sc.nextDouble();
        	sum += heights[i];
    	}
 
    	System.out.println("Mean height = " + (sum / 11));
    	sc.close();
	}
}

