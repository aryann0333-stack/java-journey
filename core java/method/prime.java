
//  function to check prime number 
import java.util.Scanner;

public class prime {

    public static int primeNum(int num) {

        if (num == 0 || num == 1) {
            System.out.println("Seriously have you completed schooling??");
            return 0;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int result = primeNum(num);

            if (result == 1) {
                System.out.println("Congratulations number is prime");
            } else {
                System.out.println("Better luck next time");
            }
        }
    }
}
