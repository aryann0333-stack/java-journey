/* there are two type of excepption checked and unchecked checked like IOExcdeption SQLException are  compulsury to be handeld while uncheck which are run time exception like arthematic and index out of bond are basically considerd as logical errors and standard way is to be solved by programm not try and catch method  */

public class multipleCatch {
    public static void main(String[] args) {
        int i = 0; // normal statement
        int j = 0;

        int num[] = new int[5];
        String str = null;
        try {
            j = 18 / 0; // critical statement due to zero
            System.out.println(j);
            System.out.println(num[1]);
            System.out.println(num[5]); // critical statement due to array out of bond index
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero  " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of limit  " + e);
        }

        /*
         * seprate try catch block if we want every critical statement runs and record
         * its error
         */

        // first statement
        try {
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of limit  " + e);
        }

        // second statement will execute regradless what happend above
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("String is null  " + e);
        }

        /* try and catch with loops */
        String[] stringsToProcess = { null, "hello", "world" };
        for (String s : stringsToProcess) {
            try {
                System.out.println(s.length());
            } catch (Exception e) {
                System.out.println("Skipped a null string, moving to next..");
            }
        }
    }
}
