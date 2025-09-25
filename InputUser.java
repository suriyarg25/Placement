import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Please Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.println("Your name is: " + name);
            System.out.println("Your age is: " + age);
        }
    }
}