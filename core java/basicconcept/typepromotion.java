public class typepromotion {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 30;

        int result = a * b;
        /*
         * here even we use lower range data type but while applying arthematic
         * operation and we assign in higher rannge of data type like int then it get
         * promoted and no loss of value we see
         */

        System.out.println(result);

    }

}
