/* what matter is the  object of which class we are creating the  bheaviour depends on that in multi level inheritance case which mean we can refer to super or parent class then create differnt object which is defined as RUN TIME POLYMORPHISM */

class A {
    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C Show");
    }
}

public class runTimeMorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
