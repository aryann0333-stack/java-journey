
// to find second largest element in an array
import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // declaration of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];
            int largest = Integer.MIN_VALUE;
            int secondLarg = Integer.MIN_VALUE;

            // input of array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // logic for second largest
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLarg = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLarg && arr[i] != largest) {
                    secondLarg=arr[i];
                }
            }
               System.out.println("Second largest: " + secondLarg);
        }
    }
}