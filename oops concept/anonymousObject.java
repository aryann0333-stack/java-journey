/* Anonymous Object cann be used only once and because it does not  has refence variable while refernced object has both */

class A {
    public A() {
        System.out.println("Object created");
    }

    public void show() {
        System.out.println("In A show");
    }
}

public class anonymousObject {
    public static void main(String[] args) {

        A obj; // refernce creation
        obj = new A(); // object creation
       

        new A().show(); // anonymous object
    }
}
