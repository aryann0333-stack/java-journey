
//using array hashing to find frequency of element  
import java.util.Scanner;

public class IntHashing {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // declaration of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // input of array
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // assuming maximum element is <=100
            int[] hash = new int[101];
            // precomputing for arrrayhashing
            for (int i = 0; i < arr.length; i++) {
                hash[arr[i]]++;
            }

            // number of queries
            System.out.print("Enter number of queries: ");
            int query = sc.nextInt();

            // answer to every query
            while (query > 0) {
                System.out.print("Enter element to find frequency: ");
                int queries = sc.nextInt();
                System.out.println("Frequency of element is " + hash[queries]);
                query--;
            }

        }
    }
}
