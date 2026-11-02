
/*java does not support multiple inheritance means if both parent class have same method then its not able to decide which to  choose and this is called ambiguity but allows multi level inheritance */
class Calc {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}

public class inheritance {
    public static void main(String[] args) {
        scienCalc Calc = new scienCalc();
        int r1 = Calc.add(5, 4); // from calc
        int r2 = Calc.sub(5, 4); // from calc

        int r3 = Calc.multi(5, 4); // adv calc

        double r4 = Calc.power(2, 4); // from scieCalc

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
