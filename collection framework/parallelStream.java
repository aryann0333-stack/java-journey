import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class parallelStream {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3, 4, 5, 6, 7, 78, 9);
        List<Integer> num = Arrays.asList(3, 4, 5, 6, 7, 78, 9);

        /*
         * Using parallel stream with a list
         * parallel stream use work-stealing in the fork/join framework which distribute
         * these task amoung worker threads
         */
        Stream<Integer> _ = nums.stream();
        nums.parallelStream()
                .forEach(n -> System.out.println(n + "-" + Thread.currentThread().getName()));

        /*
         * using .parallel() ona stream it just mean to createpipeline then allows to
         * multiple threads
         */

        num.stream()
                .parallel()
                .forEach(System.out::println);

    }
}
