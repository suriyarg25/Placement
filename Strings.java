
import java.util.Scanner;

public class Strings{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String str1 = input.nextLine();

        System.out.println("Hello, "+str1);
        int strlen = str1.length();
        System.out.println("The length of your name is: "+strlen);
        
    }
}
