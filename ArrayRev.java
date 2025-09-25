import java.util.Scanner;

public class ArrayRev {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for the index, arr["+ i+"]: ");
            int val = input.nextInt();
        }

    }
}
