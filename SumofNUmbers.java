import java.util.Scanner;

public class SumofNUmbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = inp.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of n numbers is: "+sum);
    }
}
