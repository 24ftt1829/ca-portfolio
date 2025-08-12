import java.util.Scanner;

public class ConvertBytesIntoBits {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter the number of byte(s) to be converted");
        int bytes= scanner.nextInt();

        int bits= bytes *8;
        System.out.println(bytes + " byte(s) is "+ bits + " bits");
    }
}
