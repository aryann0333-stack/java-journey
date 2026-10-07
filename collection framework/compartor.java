import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* we  ca use comparator and comparable both comparable and be implemented in class and comparator as anonymous class comparale has a method compareTo and mainly if we have sort naturally like by id roll no we use comparable if want to use our own logic then*/

class student implements Comparable<student> {
    int age;
    String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "students [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;

    }

}

public class compartor {
    public static void main(String[] args) {

        /*
         * comparator is the interface by using it we can make our own logic for sorting
         */
        Comparator<Integer> com = (i, j) -> {
            return i % 10 > j % 10 ? 1 : -1;
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(65);
        nums.add(5765);
        nums.add(52);
        nums.add(90);

        Collections.sort(nums, com);

        System.out.println(nums);

        Collections.sort(nums, com); // com.compare(s1, s2);

        List<student> studs = new ArrayList<>();
        studs.add(new student(21, "Navin"));
        studs.add(new student(45, "aryan"));
        studs.add(new student(34, "patel"));
        studs.add(new student(13, "verma"));

        System.out.println(studs);

        Comparator<student> compare = (i, j) -> i.age > j.age ? 1 : -1;

        Collections.sort(studs); // s1.compareTo(s2);
        for (student s : studs) {
            System.out.println(s);
        }

    }
}
