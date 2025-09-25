import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Size: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        int sum = 0, EC=0, OC =0;;
        int max = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for the index, arr["+ i+"]: ");
            int val = input.nextInt();
 
            arr[i] = val;
            sum = sum+val;
            if(val > max){
                max = val;
            }

            if (arr[i] % 2== 0) {
                EC++;
            }
            else if(arr[i] != 0){
                OC++;
            }

        }
        

        System.out.println("The sum is: "+sum);
        System.out.println("The max is: "+max);

        for (int j = size-1; j >= 0; j--) {
            System.out.print(arr[j]+", ");
        }
        System.out.println("");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j]+", ");
        }
        System.out.println("Odd: "+OC);
        System.out.println("Even: "+EC);

        System.out.print("Enter a key: ");
        int key = input.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("The key is in the position: "+ i);
                break;
            }
            else{
                System.out.println("Not found in: ");
                continue;
            }
        }
    }
}
