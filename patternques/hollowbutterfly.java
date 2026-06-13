
// to print  hollow butterfly using star

import java.util.Scanner;

public class hollowbutterfly {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of pyramid: ");
            int leng = sc.nextInt();

            // outerloop for upper half

            for (int i = 1; i <= leng; i++) {

                // left wing
                for (int j = 1; j <= i; j++) {

                    if (j == 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // middle spaces
                for (int j = 1; j <= 2 * (leng - i); j++) {
                    System.out.print(" ");
                }
                // right wing
                for (int j = 1; j <= i; j++) {

                    if (j == 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

            // outerloop for lower half

            for (int i = leng; i >= 1; i--) {

                // left wing
                for (int j = 1; j <= i; j++) {

                    if (j == 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // middle spaces
                for (int j = 1; j <= 2 * (leng - i); j++) {
                    System.out.print(" ");
                }
                // right wing
                for (int j = 1; j <= i; j++) {

                    if (j == 1 || i == j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
