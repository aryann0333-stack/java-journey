
// Check whether a number is divisible by both 5 and 11
import java.util.Scanner;

public class divisibility {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 5 == 0 && num % 11 == 0) {
                System.out.println("Enterd number is divisible by 5 and 11 ");
            } else {
                System.out.println("Enterd number is not divisible by 5 and 11 ");

            }
        }
    }

}
