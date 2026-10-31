// function to find maximum number 

import java.util.Scanner;

public class largestnum {

    public static int maximum(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter 1st number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter 3rd number: ");
            int num3 = sc.nextInt();

            System.out.println("MAXIMUM NUMBER IS: " + maximum(num1, num2, num3));
        }
    }
}
