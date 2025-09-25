
import java.util.Scanner;

public class Operators{
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = no.nextInt();

        System.out.print("Enter b: ");
        int b = no.nextInt();

        System.out.println("Addition: " + a+b);
        System.out.println("Addition: " + (a-b));
        System.out.println("Addition: " + a*b);
        System.out.println("Addition: " + a/b);

        no.close();
    }
}