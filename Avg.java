
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        float a,b,c;
        Scanner nos = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = nos.nextFloat();

        System.out.print("Enter b: ");
        b = nos.nextFloat();

        System.out.print("Enter c: ");
        c = nos.nextFloat();

        float avg = (a+b+c)/3;

        System.out.println("The Average is: "+ avg);
    }
}
