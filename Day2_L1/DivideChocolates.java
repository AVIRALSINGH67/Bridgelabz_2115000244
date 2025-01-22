import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();
        
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.println("number of chocolates each child gets is " + chocolatesPerChild + " the number of remaining chocolates are " + remainingChocolates);
    sc.close();
}
}