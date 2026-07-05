
// we will find maximum and minimumfrequency using hashmap concept
import java.util.*;

public class maxminfrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // input size
            System.out.print("Ebter array size: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // input for array
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // create hashmap
            HashMap<Integer, Integer> map = new HashMap<>();

            // count frequency
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // variable for highest and lowest frequency
            int maxfrequency = 0;
            int minimumfrequency = Integer.MAX_VALUE;

            int maxelement = 0;
            int minelement = 0;

            // transverse hashmap
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int element = entry.getKey();
                int freq = entry.getValue();

                // highest frequency
                if (freq > maxfrequency) {
                    maxfrequency = freq;
                    maxelement = element;
                }

                // lowest frequency
                if (freq < minimumfrequency) {
                    minimumfrequency = freq;
                    minelement = element;
                }
            }

            // output
            System.out.println("Highest frequency element: " + maxelement);
            System.out.println("Highest frequency: " + maxfrequency);

            System.out.println("lowest frequency element: " + minelement);
            System.out.println("lowest frequency: " + minimumfrequency);
        }
    }
}
