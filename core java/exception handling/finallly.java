
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class finallly {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num=0;

        // BufferedReader br = null;

        /* this syntax writing after try help to avoid finally block as it autocloses all resources */
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // br = new BufferedReader(new InputStreamReader(System.in)); // perfect
            // representation of wrapping concept
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        /*
         * finally block is executed wheather exception occur or not mainly preferred
         * where we need to close the resource networking database any xyz resource
         * later on updated we can even avoid finally also
         * finally is recommended as we are aware which resouce we are closing
         */
        // finally {
        //     br.close();
        //     System.out.println("will be executed irrespective of exception..");
        // }
    }
}

