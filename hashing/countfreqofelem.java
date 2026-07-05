
// couunting frequency of elements in array
import java.util.*;

public class countfreqofelem {
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

            // pre compute frequencies and mapping them
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            System.out.println(map);

            // number of queries
            System.out.print("Enter number of queries: ");
            int queries = sc.nextInt();

            // answer to each query
            while (queries > 0) {

                System.out.print("Enter element to find frequencies: ");
                int query = sc.nextInt();

                System.out.println(map.getOrDefault(query, 0));
                queries--;
            }
        }
    }
}
