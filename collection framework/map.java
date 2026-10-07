import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        /*
         * we also have hashTable which is synchronized if we want to work with multiple
         * threads we can use hashmap also but use synchronized externally
         */

        students.put("navin", 56);
        students.put("aryan", 67);
        students.put("palak", 89);
        students.put("verma", 69);

        System.out.println(students);

        System.out.println(students.get("palak"));

        System.out.println(students.keySet());

        for (String key : students.keySet())
            System.out.println(key + " : " + students.get(key));
    }
}
