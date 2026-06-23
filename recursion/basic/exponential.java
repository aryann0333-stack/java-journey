// to find pow(2,power) using recursive function

import java.util.Scanner;

public class exponential {
    public static int power(int pow) {

        // base case
        if (pow == 0) {
            return 1;
        }

        // recursive relation
        // f(2(pow))=2*pow(n-1)
        return 2 * power(pow - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter power raise to 2: ");
            int pow = sc.nextInt();

            System.out.println("Answer: " + power(pow));
        }
    }
}