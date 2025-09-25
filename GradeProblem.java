
import java.util.Scanner;

public class GradeProblem {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in); 
        
        System.out.print("Enter your mark: ");
        float marks = no.nextInt();

        if (marks< 100 && marks >= 90) {
            System.out.println("Grade A");
        }if (marks < 90 && marks >= 80) {
            System.out.println("Grade B");
        }if (marks < 80 && marks >= 60) {
            System.out.println("Grade C");
        }if (marks < 60 && marks >= 40) {
            System.out.println("Grade D");
        }if (marks < 40 && marks >= 0) {
            System.out.println("Grade D");
        }
    }
}
