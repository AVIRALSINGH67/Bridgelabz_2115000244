import java.util.Scanner;
public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        sc.close();
    }
}