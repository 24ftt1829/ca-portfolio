import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 100 and 999:");
        int num = input.nextInt();

        int last = num % 10;
        int middle = (num/10) % 10;
        int first = num / 100;

        System.out.println("The reverse of "+ num + " is " + last + middle + first);
    }
}
