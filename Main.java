import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String password(int length){
        String characters = "QWERTYUIOPASDFGHJKLMNBVCXZqazxswedcvfrtgbnhyujmkilop1234567890!@#$%^&*()";
        Random random = new Random();
        StringBuilder pswrd = new StringBuilder();

        for(int i=0 ; i<length; i++){
            int index = random.nextInt(characters.length());
            pswrd.append(characters.charAt(index));
        }
        return pswrd.toString();
    }

    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the password: ");
        int length = input.nextInt();
        System.out.println(password(length));

    }
}
