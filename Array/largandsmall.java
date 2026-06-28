
// a program to Find largest and smallest element
import java.util.Scanner;

public class largandsmall {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // declaring size of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // input of array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            int largest = arr[0];
            // for largest element
            for (int i = 1; i < size; i++) {
                if (largest < arr[i]) {
                    largest = arr[i];
                }
            }
            System.out.println("Largest element: " + largest);

            // for smallest element
            int smallest = arr[0];
            for (int i = 1; i < size; i++) {
                if (smallest > arr[i]) {
                    smallest = arr[i];
                }
            }
            System.out.println("Smallest element: " + smallest);
        }

    }
}