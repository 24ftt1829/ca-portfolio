public class LoopsLoopsLoops1 {
    public static void main(String[] args) {
        int numWhile = 1;
        int numDoWhile = 50;
        char C;

        System.out.println("Below is generated using while loop: ");
        while (numWhile<=20) {
             System.out.println(numWhile+" ");
            numWhile++;
        }

         System.out.println("\n");

        System.out.println("Below is generated using dowhile loop: ");
        do {
             System.out.println(numDoWhile+"");
            numDoWhile--;
        } while (numDoWhile>=35);
        
        System.out.println("\n");

        System.out.println("Below is generated using for loop: ");
        for (C = 'a'; C < 'z'; C++) {
            System.out.println(C+"");
        }
    }
}
