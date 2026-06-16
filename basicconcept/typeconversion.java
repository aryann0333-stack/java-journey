public class typeconversion {
    public static void main(String[] args) {

        int a = 345;
        byte b;
        int c;

        /*
         * b = a not possible since int is higher data type in type casting losses may
         * occur if value is out of the range then :
         * (value%complete range of byte )
         */

        b = (byte) a; // type casting

        c = b; // type conversion done by compiler itself when small data type converted in
               // greater one

        float f = 5.6f;
        int x = (int) f; // type casting of float to int losses may occur decimal value will lost

        System.out.println(" float to int after type casting " + x);
        System.out.println(" byte to int after type casting " + b);
        System.out.println(" byte to int after type conversion " + c);

    }

}
