public class throwKeyword {
    public static void main(String[] args) {
        int i = 20; // normal statement
        int j ;
        try {
            j = 18 / i; // critical statement due to zero
            if (j == 0) {
                throw new ArithmeticException("failed");
            }
            System.out.println(j);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Exception handeld !!");

    }
}