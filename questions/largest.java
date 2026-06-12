
// Input two numbers and print the larger one.
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number:");
            int num1 = sc.nextInt();

            System.out.print("Enter second number:");
            int num2 = sc.nextInt();

            if (num1 > num2) {
                System.out.println("First number is greatest:" + num1);
            } else
                System.out.println("second number is greatest:" + num2);
        }

    }

}
