import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch= input.next().charAt(0);
        int unicodeValue= ch;
        System.out.println("The Unicode for character "+ ch +" is "+ unicodeValue);
        
    }
}
