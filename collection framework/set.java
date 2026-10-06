
import java.util.*;

public class set {
    public static void main(String[] args) {

        /* set contain no duplicate value and does not return sorted value */
        Set<Integer> nums = new HashSet<>();

        /*
         * tree set return values in sorted order it does not allow null element while
         * hashset allow one
         */
        Set<Integer> num = new TreeSet<>();

        nums.add(74);
        nums.add(35);
        nums.add(72);
        nums.add(98);
        nums.add(67);
        num.add(70);
        num.add(3);
        num.add(7);
        num.add(9);
        num.add(6);

        /*
         * iterator is also used it is the upper most interface in hieracy 
         * modern for each loop is converted into iterator by compiler
         * it has three main method 1.hashnext() 2.next() 3.remove()
         */
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.err.println(values.next());
        }
        System.out.println(nums);
        System.out.println(num);

    }
}
