import java.util.Random;
import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numb1 = rand.nextInt(100);
        int numb2 = rand.nextInt(100);
        int numb3 = rand.nextInt(100);
        int numb4 = rand.nextInt(100);

        int sum = numb1 + numb2 + numb3 + numb4;

        System.out.println("What is " + numb1 +"+" + numb2 +"+"+ numb3 +"+"+ numb4);
        int answer = input.nextInt();

        if (answer==sum) {
            System.out.println("Well down, you are correct!");
        }
        else{
            System.out.println("Nice try, the sum should be "+ sum);
        }
    }
}
