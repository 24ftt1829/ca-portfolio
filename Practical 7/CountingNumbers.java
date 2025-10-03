import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int totalNum =0;
        int pNum = 0;
        int nNum =0;
        int numCount = 0;
        double average=0;

        System.out.println("Enter an integer, the input ends if it is 0: ");
        while (true) {
            num = input.nextInt();
        
        if (num==0) {
            break;
        }
        if (num>0) {
            pNum++;
        }
        else{
            nNum++;
        }
        totalNum += num;
        numCount++;
    }
    if (numCount==0) {
        System.out.println("No number is entered except for 0 to end the program.");
    }
    else{
         average=(double) totalNum/numCount;
    }
    System.out.println("The number of positives is "+pNum);
    System.out.println("The number of negatives is "+nNum);
    System.out.println("The total is "+totalNum);
    System.out.printf("The average is %.2f\n",average);








    }
}
