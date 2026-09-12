/*when a object shows multiple behaviour during run time or compile time like method overriding and method overloading is called polymorpism */

class A {
    public void show() {
        System.out.println("A's Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("B's Show");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
