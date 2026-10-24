
/* buffer reader is the old technique to accept input till java 1.5 later scanner is introduced */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bufferReaderin {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number ");

        /* convert bytes to char & system.in says give me raw data */
        InputStreamReader in = new InputStreamReader(System.in);

        /*
         * buffer reader can take input from anywhere not limited to console or user
         * like from any file also
         * buffer reader act as a wrapper 
         */
        BufferedReader bf = new BufferedReader(in); // says give me a line and convert to character
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);

       

        System.out.println("Enter second number ");
        Scanner sc = new Scanner(System.in);
        int num2=sc.nextInt();
        System.out.println(num2);
        /*
         * in built to read a value but returns ASCII value and read one bit at a time
         */
        // int num = System.in.read();

         /* good pratice to close because bufferd reader can input from anywhere */
        bf.close();
        sc.close();
    }
}
