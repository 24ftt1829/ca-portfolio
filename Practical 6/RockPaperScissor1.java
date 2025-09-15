import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         Random rand = new Random(); 
        int comp = rand.nextInt(1000) % 3; 
        //to generate a random large number and use modulus 3 to get either 0,1 or 2

        System.out.print("Enter rock (0), paper (1), scissor (2): ");
        int number = input.nextInt();

           String solid = "";
        if(number==0){
           solid = "rock";
        }
        if (number==1) {
            solid = "paper";
        }
        if (number==2) {
           solid = "scissor";
        }
          if(comp==0){
            solid = "rock";
        }
        if (comp==1) {
             solid = "paper";
        }
        if (comp==2) {
            solid = "scissor";
        }

        
         String result="";
        if(((number==0)&&(comp==0))||((number==1)&&(comp==1))||((number==2)&&(comp==2))) {
           result=" .It is a draw";
        }
        if((number==0)&&(comp==1)){
          result =" .You lose";
        }
        if ((number==0)&&(comp==2)) {
            result = " .You win";
        }
        if( (number==1)&&(comp==2)) {
           result = " .You win";
        }
        if ((number==2)&&(comp==0)) {
           result = " .You lose";
        }

       System.out.println("The computer is "+ solid +" .You are "+ solid+ ""+ result);

       


    }
}
