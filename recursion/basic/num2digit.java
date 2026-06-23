
// to print num to digit 
// eg 4-four 3-three 2-two
import java.util.Scanner;

public class num2digit {
    public static void saydigit(int num, String[] arr) {

        // base condition
        if (num == 0) {
            return;
        }
        // processing
        int digit = num % 10;
        num = num / 10;

        // recursive call
        saydigit(num, arr);

        // print affter recursiion call(tail recursion)
        System.out.print(arr[digit] + " ");
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
            if (num == 0) {
                System.out.println("zero");
            } else {
                saydigit(num, arr);
            }
        }
    }
}