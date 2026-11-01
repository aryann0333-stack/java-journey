// create a class for basic example
class human {
    private int age;
    private String name;

    // create the method to acess private variable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        human obj = new human();
        obj.setAge(20);
        obj.setName("Aryan");

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}