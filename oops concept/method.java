import java.util.Scanner;

class computer {

    public void playmusic() {
        System.out.println("music playing..");

    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "pen";
        else
            return "yeh jo gareeb hove na apni adat se garib hove!!";
    }

}

// method overloading concept

class calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

public class method {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            computer com = new computer();
            com.playmusic();

            System.out.print("Enter cost: ");
            int cost = sc.nextInt();

            String str = com.getMeAPen(cost);
            System.out.println(str);

            // method overloading oncept

            calculator calc = new calculator();
            int result = calc.add(2, 16, 6);
            System.out.println(result);
        }

    }
}
