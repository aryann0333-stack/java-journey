
import java.util.ArrayList;
import java.util.Collection;

public class arrayList {
    public static void main(String[] args) {

        /*
         * angular bracket are used as wrapper class to mention type to avoid run time
         * error
         * and it will give compile time error
         * easy in debugging
         */
        /*
         * we can work while declaring both collection if we just need to perform
         * operation like fetch and add use list if you need to work with index value 
         */
        Collection<Integer> nums = new ArrayList<>();
        // list<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(7);
        nums.add(9);
        nums.add(6);

        // System.out.println(nums.get(2));
        for (int n : nums) {
            System.out.println(n);
        }
        /* we dont need for loop to print list its inbuilt */
        System.out.println(nums);
    }
}
