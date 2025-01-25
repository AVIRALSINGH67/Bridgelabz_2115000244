
 
import java.util.Scanner;
 
public class Result {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 
    	System.out.println("Enter the number of students:");
    	int numStudents = sc.nextInt();
 
    	double[] physics = new double[numStudents];
    	double[] chemistry = new double[numStudents];
    	double[] maths = new double[numStudents];
    	double[] percentage = new double[numStudents];
    	String[] grade = new String[numStudents];
 
    	// Input marks for each student
    	for (int i = 0; i < numStudents; i++) {
        	System.out.println("Enter marks for Student " + (i + 1) + ":");
 
        	System.out.print("Physics: ");
        	physics[i] = sc.nextDouble();
 
        	System.out.print("Chemistry: ");
        	chemistry[i] = sc.nextDouble();
 
        	System.out.print("Maths: ");
        	maths[i] = sc.nextDouble();
 
        	// Validate marks
        	if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Please re-enter for Student " + (i + 1));
                i--; // Re-enter for the same student
                continue;
        	}
 
        	// Calculate percentage
        	percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;
 
        	// Assign grade
        	if (percentage[i] >= 80) {
                grade[i] = "A";
        	} else if (percentage[i] >= 70) {
                grade[i] = "B";
        	} else if (percentage[i] >= 60) {
                grade[i] = "C";
        	} else if (percentage[i] >= 50) {
                grade[i] = "D";
        	} else if (percentage[i] >= 40) {
                grade[i] = "E";
        	} else {
                grade[i] = "R";
        	}
    	}
 
    	// Display results
    	System.out.println("\nStudent Results:");
    	for (int i = 0; i < numStudents; i++) {
        	System.out.println("Student " + (i + 1) + " - Physics: " + physics[i] +
                           	", Chemistry: " + chemistry[i] +
                           	", Maths: " + maths[i] +
                           	", Percentage: " + percentage[i] +
                           	", Grade: " + grade[i]);
    	}
	sc.close();
	}
}
