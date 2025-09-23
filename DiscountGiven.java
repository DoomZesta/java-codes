/*
EMMANUEL MWAMI
K63-10965-2024
 */
import java.util.Scanner;

class DiscountGiven {
    public static void main(String[] args) {
        double Discount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item you want to buy");
        int Price = input.nextInt();
        input.nextLine();
        if (Price >5000) {
            Discount = Price * 0.1;
        } else if (Price >1000 && Price <=5000){
            Discount = Price * 0.05;
        } else {
            Discount = 0;
        }
        System.out.println("The total discount for you is:" + Discount);
        input.close();
}
}