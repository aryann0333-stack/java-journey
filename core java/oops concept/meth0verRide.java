class A {
    public void show() {
        System.out.println("In Class A show");
    }

    public void config() {
        System.out.println("In class A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("In class B show after overriding");
    }

    public void config() {
        System.out.println("In class B config after override");
    }
}

public class meth0verRide {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
