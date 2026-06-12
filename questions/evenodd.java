// to check wheather a number is even or odd

import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if ((num & 1) == 0) {
                System.out.println("Enterd number is Even");
            } else {
                System.out.println("Enterd number is Odd");

            }
        }
    }

}