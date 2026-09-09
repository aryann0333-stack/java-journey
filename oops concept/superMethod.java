/*this will execute the class or subclass constructor while super execute the super class depending parametrized or not  */
// NOTE : every class extends object class eg ) class A extends Object

class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("int A int");
    }
}

class B extends A {
    public B() {
        this(10);
        System.out.println("in B");
    }

    public B(int n) {
        super(4);
        System.out.println("in B int");
    }
}

public class superMethod {
    public static void main(String[] args) {
        B obj = new B();
    }
}
