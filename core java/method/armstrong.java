
//  function to check number is pallindrome or not
import java.util.Scanner;

public class armstrong {

    public static int armstrongCheck(int num) {

        int originalNum = num;
        int count = 0;
        int sum = 0;

        while (num > 0) { // counting digits
            num /= 10;
            count++;
        }
        num = originalNum;

        while (num > 0) { // logic for finding sum
            int rem = num % 10;
            sum = sum + (int) Math.pow(rem, count);
            num /= 10;
        }

        if (originalNum == sum) {
            System.out.println("Enterd number is Armstrong");
            return 1;
        } else {

            System.out.println("Enterd number is not an Armstrong number");
            return 0;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            armstrongCheck(num);
        }
    }
}
