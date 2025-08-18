import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random()*101); // to include 100
        int num2 = (int) (Math.random()*101);

           
        System.out.println("What is " +num1 + " + " +num2+ "?");
        int userSum = input.nextInt(); 
        int sum = num1 + num2;
        System.out.println(num1 + "%" + num2+ "=" + userSum + "is" + (userSum==sum)); 
        //modulus
       // System.out.println("What is"+ num1 + "%" + num2 + "?" );
        int userMod = input.nextInt();
        int mod = num1%num2;
        System.out.println(num1 + " % " + num2 + " is " + (userMod==mod));
    }
}
