
// literals are in action when we have to play with binary hexadecimal or any other kindof number system 

public class literals {
    public static void main(String[] args) {

        int num1 = 0b101; // binary to decimal in output
        System.out.println(num1);

        int num2 = 0x7E; // hexadecimnal to decimal in output
        System.out.println(num2);

        int num3 = 10_00_00_0000; // helpful to count zero while coading
        System.out.println(num3);

        double num4 = 112e10; // way to store larger number
        System.out.println(num4);

        char c = 'A'; // string literal
        c++;
        System.err.println(c);

    }

}
