
//  function to find factorial
import java.util.Scanner;

public class factorial {

    public static int fact(int num) {
        long fact = 1;
        if (num < 1) {
            System.out.println("hey try using brain");
            return 0;
        }
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of a number is: " + fact);
        return 1;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            fact(num);
        }
    }
}
