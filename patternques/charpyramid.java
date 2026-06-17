// to print half pyramid using characters

import java.util.Scanner;

public class charpyramid {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter length of character pyramid: ");
            int leng = sc.nextInt();

            // number of rows
            for (int i = 1; i <= leng; i++) {

                // for characters
                for (int j = 1; j <= i; j++) {
                    // assume A=97
                    // since j=1 so for 97 j=1+96
                    // therefore A-1=96
                    int a = j;
                    int b = 'A' - 1;
                    int result = a + b;
                    char finalans = (char) result;
                    System.out.print(finalans + " ");

                }
                System.out.println();
            }
        }
    }
}
