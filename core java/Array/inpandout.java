import java.util.Scanner;

public class inpandout {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            // Input
            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // display
            System.out.print("Enterd values are: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
