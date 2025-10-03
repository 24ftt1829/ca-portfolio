import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Please enter the term: ");
        int term = input.nextInt();

        int f0=0, f1 =1, fn=0;
        
        if (term == 0) {
            fn=f0;
        }
        else if (term ==1) {
            fn = f1;
        }
        else{
            for (int i = 2; i <= term; i++) {
                fn = f0+f1;
                f0=f1;
                f1=fn;
            }
        }
        System.out.println("At term "+ term+ "the number is "+ fn);
    }
}
