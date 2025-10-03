import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int rounds = 0;
        int score = 0;
        int Compscore = 0;
        int choice;
        int CompChoice;

        String playAgain;

        do {
            System.out.println("Enter rock (0), paper(1), scissor(2): ");
            choice = input.nextInt();

            CompChoice = rand.nextInt(3);

            String[] choices = {"rock", "paper","scissor"};
            System.out.println("The computer is "+ choices[CompChoice]+ ".You are "+ choices[choice]+ ".");

            if (choice == CompChoice) {
                System.out.println("It is a draw.");
            }
            else if ((choice ==0 && CompChoice==2)||(choice==1 && CompChoice==0)||(choice==2 && CompChoice ==1))
            System.out.println("You win.");
            score++;

            else{
                System.out.println("You lose.");
                Compscore++;
            }    
            rounds++;

            System.out.println("\nEnter y to play again: ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("\nIn the total of "+ rounds + "round(s),You scored "+ score+",Computer scored"+ Compscore);

    
    }
}

