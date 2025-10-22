import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array 0–9 and shuffle once
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
        shuffleArray(numbers);

        int chances = 10;
        boolean won = false;

        while (chances > 0) {
            System.out.print("Guess 4 numbers (no duplicates): ");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                won = true;
                break;
            } else {
                chances--;
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.\n");
            }
        }

        if (!won) {
            System.out.print("The actual number is: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println("\nYou Lose.");
        }
    }

    private static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int j = rand.nextInt(array.length);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
