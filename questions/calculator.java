// to make simple calculator using switch statement

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number : ");
            int num1 = sc.nextInt();

            System.out.print("Enter operation: ");
            char op = sc.next().charAt(0);

            System.out.print("Enter a number : ");
            int num2 = sc.nextInt();

            switch (op) {

                case '+' -> System.out.println(num1 + num2);

                case '-' -> System.out.println("num1-num2");

                case '*' -> System.out.println("num1*num2");

                case '/' -> {
                    if (num2 == 0)
                        System.out.println("undefined");
                    else {
                        System.out.println(num1 / num2);
                    }
                }

                case '%' -> {
                    if (num2 == 0)
                        System.out.println("undefined");
                    else {
                        System.out.println(num1 % num2);
                    }
                }

                default -> System.out.println("Dude learn some basic mathematics then try !!");
            }
        }
    }
}
