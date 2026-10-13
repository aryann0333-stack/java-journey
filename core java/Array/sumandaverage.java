
//  program to Find sum and average of array
import java.util.Scanner;

public class sumandaverage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // size declarration
            System.out.print("Enter size of Array: ");
            int term = sc.nextInt();

            int[] arr = new int[term];

            // input array
            for (int i = 0; i < term; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // sum of array
            int sum = 0;
            for (int i = 0; i < term; i++) {
                sum += arr[i];
            }

            // average of array
            double avg = (double) sum / term;

            // printing values
            System.out.println("sum of array: " + sum);
            System.out.printf("Average of array: %.2f%n", avg);

        }

    }
}
