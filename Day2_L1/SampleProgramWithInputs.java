import java.util.Scanner;

public class SampleProgramWithInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String fromCity = sc.nextLine();
        String viaCity = sc.nextLine();
        String toCity = sc.nextLine();

        int fromToVia = sc.nextInt();
        int viaToFinalCity = sc.nextInt();

        double time = sc.nextDouble();

        double totalTime = time + (fromToVia / 60.0) + (viaToFinalCity / 60.0);

        System.out.println("\nThe results of the journey are as follows:");
        System.out.println("Name: " + name);
        System.out.println("From: " + fromCity + " to " + viaCity + " and then to " + toCity);
        System.out.println("Total time spent: " + totalTime + " hours");
        System.out.println("Time breakdown - From " + fromCity + " to " + viaCity + ": " + fromToVia + " minutes");
        System.out.println("Time from " + viaCity + " to " + toCity + ": " + viaToFinalCity + " minutes");
        System.out.println("Additional time spent on the journey: " + time + " hours");

        sc.close();
    }
}
