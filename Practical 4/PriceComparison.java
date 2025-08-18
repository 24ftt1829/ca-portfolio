import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price of the 1st package:$");
        double price1 = input.nextDouble();
        System.out.println("Enter the weight of the 1st package in gram:");
        double weight1 = input.nextDouble();
        System.out.println("Enter the price of the 2nd package:$");
        double price2 = input.nextDouble();
        System.out.println("Enter the weight of the 2nd package in gram:");
        double weight2 = input.nextDouble();

        double amount1= weight1/price1;
        double amount2= weight2/price2;
        
        String result = (amount1 > amount2)? "1st package" : "2nd package";
        System.out.println("It is worth more to buy the " + result);
    }
}
