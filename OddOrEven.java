
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = no.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        }if (number % 2 != 0) {
            System.out.println(number + " is an Odd number.");
        }
    }
}
