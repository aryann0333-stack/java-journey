// to  print solid pyramid

import java.util.Scanner;

public class hollowpyramid {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of solid pyramid: ");
            int leng = sc.nextInt();

            for (int i = 1; i <= leng; i++) {

                // for stars loop
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i || i == leng) {
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
