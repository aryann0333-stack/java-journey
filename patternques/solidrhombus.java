
// to print solid rhombus
import java.util.Scanner;

public class solidrhombus {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of rhhombus: ");
            int leng = sc.nextInt();

            for (int i = 1; i <= leng; i++) {
                // for spaces
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }
                // for stars
                for (int j = 1; j <= leng; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}