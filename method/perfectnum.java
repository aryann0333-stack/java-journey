// function to print perfect number

import java.util.Scanner;

public class perfectnum {

    public static void perfectNum(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("Enterd number is perfect number");

        } else {
            System.out.println("Enterd number is not a perfect number");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            perfectNum(num);
        }
    }
}