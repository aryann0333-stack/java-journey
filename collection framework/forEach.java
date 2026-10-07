import java.util.Arrays;
import java.util.List;

/* forEach() is used to perform an operation on every element of a collection 
consumer represents the operation we want to perform on each element  */
public class forEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 5, 2, 7, 8, 2);

        // Consumer<Integer> conn = n -> System.out.println(n);

        nums.forEach(n -> System.out.println(n));
    }
}
