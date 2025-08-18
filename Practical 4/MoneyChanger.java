import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to convert bnd to rm and 2 vise versa:");
        int number = input.nextInt();
        System.out.println("Enter the amount to be converted:");
        double number2 = input.nextDouble();
        double result = (number==1)? (number2*3) : (number2/3);
        System.out.printf("The change is $%.2f", result);
    }
}
