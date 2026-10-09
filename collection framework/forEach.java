import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* forEach() is used to perform an operation on every element of a collection 
consumer represents the operation we want to perform on each element  */
public class forEach {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 5, 2, 7, 8, 2);

        // Consumer<Integer> conn = n -> System.out.println(n);

        nums.forEach(n -> System.out.println(n)); // what we write

        /* what java sees behind the scene */
        /*
         * Consumer ->we can give it differnt behaviours like print double
         * check something or save somewhere
         */
        nums.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {

                System.out.println(t);
            }

        });
    }
}
