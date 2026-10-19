import java.util.ArrayList;

public class varr {

    // var num =10; can be used for local varible not instance
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int a = 9;
        /*
         * compiler will convert behind the scene in int string or anything so it will
         * be called statically typed not dynamically typed language
         */
        var b = 8;

        // var c ; error compulsory to initiliaze the value

        /*
         * we know obj is the type of array list which will contain integers so in java
         * "var" was introduced
         */
        ArrayList<Integer> obj = new ArrayList<>();

        /*
         * it can be reduced to following expression for programmer readibility but
         * compiler do change in original form behind the scene
         */
        var obj2 = new ArrayList<Integer>();

        var nums = new int[10];
    }
}
