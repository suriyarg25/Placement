
import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = no.nextInt();

        System.out.print("Enter b: ");
        int b = no.nextInt();


        if(a==b){
            System.out.println("Hello World");
        }
        if(a>b){
            System.out.println("a is greater than b");
        }
        if(a<b){
            System.out.println("b is greater than a");
        }
    }
}
