// Input age and print whether the person can vote.

import java.util.Scanner;

public class voteligibility {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter the Age:");
            int age = sc.nextInt();

            if (age >= 18) {
                System.out.println("Eligible for voting");
            } else
                System.out.println("Not Eligible for voting");
        }
    }

}
