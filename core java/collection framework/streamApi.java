import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* Stream is an interface helps to operate on data when we want source data is not affected it provides the pipeline of getting data operating on it and then collecting or consuming
note -> Streams cannot be reused if once used  */
public class streamApi {
    public static void main(String[] args) {

        // data stored in list
        List<Integer> nums = Arrays.asList(5, 3, 6, 7, 8, 3, 2);
        List<Integer> num = Arrays.asList(5, 3, 6, 7, 8, 3, 2);

        /*
         * in pipeline where we need to perform required operation.
         * Streams have multiple methods on which we can work
         * calling .stream() instantiates an unexecuted execution pipeline .it binds a
         * spilterator to the source collection and initializes stream flags like sorted
         * orderd to keep track of how data will be processed
         */
        Stream<Integer> s1 = nums.stream();

        // s1 is used now so we will create s2 stream for operation
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

        // now s3 stream for producing meaningful data from filter
        Stream<Integer> s3 = s2.map(n -> n * 2);

        int result = s3.reduce(0, (c, e) -> c + e);

        // collecting or consuming the data the last terminal step
        // s1.forEach(n -> System.out.println(n));
        System.out.println(result);

        /* all this can be written in differnt syntax to increase readibility */
        int result2 = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n + 2)
                .reduce(0, (c, e) -> c + e);

        System.out.println(result2);
    }
}
