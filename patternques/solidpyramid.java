// to  print solid pyramid

import java.util.Scanner;

public class solidpyramid {
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
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
