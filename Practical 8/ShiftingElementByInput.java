import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers are there?");
        int number1 = input.nextInt();
        
        int[]numbers= new int[number1];
        System.out.println("Enter the " + number1 + " numbers");
          for (int i = 0; i < number1; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("Enter number of left shift");
        int shift = input.nextInt();

         for (int s = 0; s < shift; s++) {
            int first = numbers[0];
            for (int i = 0; i < number1 - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
          System.out.println("\nThe shifted arrangement is:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
}