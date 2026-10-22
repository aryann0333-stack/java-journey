import java.util.Arrays;
import java.util.List;

/* 
*stream api is used to perform operation on any set of data *without affecting original data 
*stream creats the pipeline for data flow
*/
public class stream {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 6, 2, 7, 8, 9);

        /* traditonal way to iterate */

        // for (int i =0;i<nums.size();i++){
        // System.out.println(i);
        // }

        /* Enhanced for loop for iteration in filter */

        // int sum = 0;
        // for (int n : nums) {
        // if (n % 2 == 0) {
        // n *= 2;
        // sum += n;
        // }
        // }
        // System.err.println(sum);

        nums.forEach(n -> System.out.println(n)); // for each method
    }
}
