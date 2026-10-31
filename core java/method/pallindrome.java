//  function for checking number is pallindrome or not

import java.util.Scanner;

public class pallindrome {

    public static boolean pallindromeCheck(int num) {

        int newnum2 = num;
        int newnum = 0;

        if (num < 0) {
            System.out.println("where is civic sense??");
            return false;
        }

        while (num > 0) {
            int rem = num % 10;
            newnum = newnum * 10 + rem;
            num /= 10;
        }

        if (newnum == newnum2) {
            System.out.println("Enterd number is pallindrome");
            return true;

        } else {

            System.out.println("Enterd number is not pallindrome");
            return false;
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            pallindromeCheck(num);
        }
    }
}
