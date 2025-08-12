import java.util.Scanner;

public class Savings {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month1 = 30;
        System.out.println("What is your target amount?");
        double amount= input.nextDouble();
        System.out.println(" How many month(s) to reach your goal?");
        double amount2 = input.nextDouble();
        double amountSaved= (amount2*month1);
        double amountSaved2= (amount/amountSaved);
            System.out.printf("The amount you need to save per day is $%.2f\n",amountSaved2 );
     }
}
