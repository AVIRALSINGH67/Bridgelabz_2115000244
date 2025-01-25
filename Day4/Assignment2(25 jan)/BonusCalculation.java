import java.util.Scanner;
public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            double salary = sc.nextDouble();
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
                continue;
            }
            data[i][0] = salary;
            data[i][1] = years;
            totalOldSalary += salary;
        }
        for (int i = 0; i < 10; i++) {
            bonus[i] = data[i][1] > 5 ? 0.05 * data[i][0] : 0.02 * data[i][0];
            newSalary[i] = data[i][0] + bonus[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
   sc.close(); }
}