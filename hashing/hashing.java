
// hashmap creation and other important operations
import java.util.*;

public class hashing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // creating hashmap
            HashMap<String, Integer> map = new HashMap<>();

            // insertion
            map.put("India", 130);
            map.put("China", 150);
            map.put("US", 30);

            System.out.println(map);

            /*
             * when we use operation map.put()
             * case 1 = if value exist then it will update
             * case 2 = if value does not exist then new pair will be inserted
             */

            // updation
            map.put("India", 140);
            System.out.println(map);

            // searching particular key
            System.out.print("Enter country to search: ");
            String country = sc.nextLine();

            if (map.containsKey(country)) {
                System.out.println("Key is present in the map");
            } else {
                System.out.println("key is not present in the map");
            }

            /*
             * when we use operation map.get()
             * case 1 = if value exist then it will return
             * case 2 = if value does not exist then it will return null
             */

            System.out.print("Enter key to access with value: ");
            String keyvalue = sc.nextLine();

            // to access particular key with value
            System.out.println("the value of key is: " + map.get(keyvalue));

            // iteration in hashmap
            // for(int variable : array name)
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                System.out.println(e.getKey());
                System.out.println(e.getValue());
                System.out.println(e);
            }

            // for removing
            map.remove("China");
            System.out.println(map);
        }
    }
}
