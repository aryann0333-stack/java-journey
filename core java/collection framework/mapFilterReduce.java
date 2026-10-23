import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mapFilterReduce {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8, 9, 2);

        int result2 = nums.stream()

                /*
                 * the logic written below is of filter which can be reduced to
                 * (Predicate<Integer> p = n->n%2==0)
                 * using lambda expresion since predicate <integer> is generic we can remove
                 * that also
                 */

                // Predicate<Integer> p= new Predicate<Integer>(){
                // public boolean test(Integer n) {
                // if (n % 2 == 0) {
                // return true;
                // } else {
                // return false;
                // }
                // }
                // }; */
                .filter(n -> n % 2 == 0)

                /*
                 * the working of map function can be reduced to
                 * Function<Integer,Integer> fun = n -> n*2;
                 * the whole logic is below
                 */

                // Function<Integer,Integer> fun =new Function<Integer,Integer>(){
                // public Integer apply(Integer n){
                // return n*2;
                // }
                // };
                .map(n -> n * 2)

                .reduce(0, (c, e) -> c + e);

        System.out.println(result2);

        /* Another example of streams */
        Stream<Integer> sortedvalues = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();

        sortedvalues.forEach(n -> System.out.println(n));
    }
}
