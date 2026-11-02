// final - variable ,method,class

class Calc { // we can use here final to avoid inheritance

    public void show() { // we can use here final to avoid this methods overriding in extended class

        System.out.println("in calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class AdvCalc extends Calc {

}

public class finalKeyword {
    public static void main(String[] args) {

        // final variable
        final int num = 8; // varibles value cannot be changed
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(5, 4);
    }
}
