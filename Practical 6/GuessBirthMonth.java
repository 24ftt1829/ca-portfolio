import java.util.Scanner;

public class GuessBirthMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = 0;

        System.out.println("Is your birthmonth in Set 1?");
        System.out.println("1 3 5 7 9 11");
        System.out.print("Enter 0 for No and 1 for Yes");
        int answer1 = input.nextInt();
        if (answer1==1) month +=1;

        System.out.println("Is your birthmonth in Set 2?");
        System.out.println("2 3 6 7 10 11");
        System.out.print("Enter 0 for No and 1 for Yes");
        int answer2 = input.nextInt();
        if (answer2==1) month +=2; {
            
        }

        System.out.println("Is your birthmonth in Set 3?");
        System.out.println("4 5 6 7 12");
        System.out.print("Enter 0 for No and 1 for Yes");
        int answer3 = input.nextInt();
        if (answer3==1) month +=4;

        System.out.println("Is your birthmonth in Set 4?");
        System.out.println("8 9 10 11 12");
        System.out.print("Enter 0 for No and 1 for Yes");
        int answer4 = input.nextInt();
        if (answer4==1) month +=8;

        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        
            default: monthName = "Unknown"; break;
              
        }
         System.out.println("You are born in "+ monthName);
         
    }
}
