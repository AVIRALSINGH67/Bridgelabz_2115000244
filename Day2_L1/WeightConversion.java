import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double weightPounds = sc.nextDouble();
        double weightKg = weightPounds * 2.2;
        
        System.out.println("Weight in pound is " + weightPounds + "in kg " + weightKg);
    sc.close();
}
}
