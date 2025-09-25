
import java.util.Scanner;

public class forloop{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter no of iterations: ");
        int range = inp.nextInt();

       
        for (int i = 0; i < range; i++) {
            System.out.println("i = "+i);
        }
    }
}