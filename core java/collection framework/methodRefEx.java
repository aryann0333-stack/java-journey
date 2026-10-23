import java.util.Arrays;
import java.util.List;

public class methodRefEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin", "Harsh", "John");
        List<String> students = names.stream()

                /*
                 * this is called method referencing we dont need round bracket just colons to
                 * refer
                 */
                .map(String::toUpperCase)
                .toList();
        /*
         * method refernce used as a cleaner alternative to a lambda when lambda does
         * nothing more than just passing argument
         * Lambda approach ) str-> System.out.println(str)
         */
        students.forEach(System.out::println); // method refernce approach

        
    }
}
