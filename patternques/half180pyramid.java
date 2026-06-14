// inverted pyramid also rotated by 180 degree

import java.util.Scanner;

public class invertpyramid2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pyramid: ");
            int l = sc.nextInt();

            // outerloop for rows

            for (int i = 1; i <= l; i++) {
                // innerloop for space

                for (int j = 1; j <= l - i; j++) {
                    System.out.print(" ");
                }
                // innerloop for star

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}