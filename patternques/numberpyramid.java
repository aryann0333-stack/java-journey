// to  print number triangle

import java.util.Scanner;

public class numberpyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of number pyramid: ");
            int leng = sc.nextInt();

            for (int i = 1; i <= leng; i++) {
                // for spaces loop
                for (int j = 1; j <= leng - i; j++) {
                    System.out.print(" ");
                }
                // for stars loop
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
