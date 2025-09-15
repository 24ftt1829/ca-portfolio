import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         String username = "Ahmad Ali";
        String password = "12345";

        System.out.print("Please enter your username: ");
        String usernameEntered = input.nextLine();
        System.out.print("Please enter the password: ");
        String passwordEntered = input.nextLine();

       if (username.equalsIgnoreCase(usernameEntered)&&(password.equalsIgnoreCase(passwordEntered))) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String time = sdf.format(new Date());
            System.out.println("Welcome "+ username + " !The time now is "+ time);
      }
    else if (!username.equalsIgnoreCase(usernameEntered)){
        System.out.println("invalid username");
       }
       else{
        System.out.println("Password does not match");
       }
      
   
       
    }
}
