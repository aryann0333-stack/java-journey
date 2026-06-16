
import java.util.Scanner;

public class factorial {
    public static int factoriall(int num) {

        // base case
        if (num == 0) {
            return 1;
        }

        // recursive relation
        // f(num)=n*f(num-1)
        int smallproblem = factoriall(num - 1);
        int bigproblem = num * smallproblem;
        return bigproblem;

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.print("Factorial = " + factoriall(num));

        }
    }
}