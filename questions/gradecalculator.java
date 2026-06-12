
/*     Input marks. 
90-100 -> A 
80-89  -> B 
70-79  -> C 
60-69  -> D 
Below 60 -> F  */
import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the marks: ");
            int marks = sc.nextInt();

            if (marks > 100) {

                System.out.println("Have your father scored that much ??");
            } else if (marks >= 90) {

                System.out.println("congratulations champ you got grade: 'A'");
            } else if (marks >= 80) {

                System.out.println("still better you got grade: 'B'");
            } else if (marks >= 70) {

                System.out.println("keep trying dude you got grade: 'C'");
            } else if (marks >= 60) {

                System.out.println("not expected you got grade: 'D'");
            } else {

                System.out.println("Belt treatment required you got: 'f'");
            }
        }
    }
}