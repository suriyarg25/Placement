import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter arrays: ");
            int val = input.nextInt();
            arr[i] = val;
        }
        for (int i = 0; i < 10; i++) {
            
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i +" - "+arr[i]);
        }
    }
}
