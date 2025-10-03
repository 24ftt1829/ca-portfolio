import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largestNum = Integer.MIN_VALUE;
        int count =0;
        int num;

        System.out.println("Enter numbers, the input ends with 0 entered: ");
        while (true) {
            num = input.nextInt();

            if (num==0) {
                break;}

            if (num==largestNum)
            count++;
            
            else if (num>largestNum) {
                largestNum=num;
                count =1;
            }

        }
        if (largestNum==Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");}
            else{
                System.out.println("The largest number is "+ largestNum);
                System.out.println("The occurrence count of the largest number is "+count);
            }
        }
    }

