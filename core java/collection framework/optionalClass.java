import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("navin", "Aryan", "lakhsmi", "john", "kishor");

        /*
         * optional is a class which is used to avoid the nullPoint error during
         * execution we also have alternate ways like .orElse()
         */
        Optional<String> name = names.stream()
                .filter(str -> str.contains("y"))
                .findFirst();
        // .orElse("not found");

        System.out.println(name.orElse("not found"));
    }
}
