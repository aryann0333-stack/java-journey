import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int age;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class constructorRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Harsh", "John", "Aryan");

        /* traditional way to create obj for every name */

        // for(String name :names){
        // students.add(new Student(name));
        // }
        // System.out.println(students);

        /* using stream and constructor refernce */
        List<Student> students = names.stream()
                // .map(name -> new Student(name))
                .map(Student::new) // constructor refernce
                .toList();
        System.out.println(students);

    }
}
