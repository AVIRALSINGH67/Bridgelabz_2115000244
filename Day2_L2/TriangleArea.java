import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;
        System.out.println("Area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters");
        sc.close();
    }
}
