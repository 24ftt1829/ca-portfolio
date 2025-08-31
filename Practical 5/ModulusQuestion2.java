import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ModulusQuestion2 {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();

        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(99)+1;

        String Question = num1 + "%" + num2 + "=?";
        new File("Practical 5");

        FileWriter writer1 = new FileWriter("Practical 5/Modulus Questions.txt", true);
        
        writer1.write(Question + "\r\n");

        System.out.println("A new question added");
    }
}
