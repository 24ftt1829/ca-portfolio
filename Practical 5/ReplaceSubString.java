import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = input.nextLine();

        System.out.println("Enter the substring to replace:");
        String message1 = input.nextLine();

        System.out.println("Enter the replacement string:");
        String message2 = input.nextLine();

        String newMessage = message.replace(message1, message2);
        System.out.println("The updated message is:");
        System.out.println(""+newMessage);
    }
}
