
import java.io.FileReader;
import java.io.IOException;

class A {
    static void test() throws IOException {
        FileReader f = new FileReader("data.text");
        System.out.println("file opened");
    }

}

public class throwsKeyword {
    /*
     * we have two ways to handel it either write clause with main function which is
     * avoided because jvm calls main then throw out of program if exception comes
     * recommended to write in try catch block
     */
    public static void main(String[] args) {

        try {
            A.test();
        } catch (IOException e) {
            /* printStackTree not recommended in production level code */
            e.printStackTrace();
        }
    }
}
