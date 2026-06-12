
// Input three numbers and print the largest.
import java.util.Scanner;

public class largest3num {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number : ");
            int num2 = sc.nextInt();
            System.out.print("Enter third number : ");
            int num3 = sc.nextInt();

            if (num1 > num2 && num1 > num3)
                System.out.println("first number is greatest: " + num1);
            else if (num2 > num3 && num2 > num1)
                System.out.println("Second number is greatest " + num2);
            else
                System.out.println("Third number is greatest " + num3);
        }

    }
}
