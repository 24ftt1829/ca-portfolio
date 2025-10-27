import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 900) + 100; // random 3-digit number
        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = input.nextInt();

        // Ensure input is 3-digit
        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = input.nextInt();
        }

        int reversed = reverse(number);
        boolean isPalin = isPalindrome(userInput, reversed);

        System.out.println("The digit " + userInput + " is palindrome of " + number + " is " + isPalin + ".");
    }

    // Method to reverse the number
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Method to check if user input is the palindrome of the generated number
    public static boolean isPalindrome(int userInput, int reversed) {
        return userInput == reversed;
    }
}

