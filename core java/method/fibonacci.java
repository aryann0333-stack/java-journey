
// function to print fibonacci series

import java.util.Scanner;

public class fibonacci {

    public static void fibonnaciSeries(int num) {

        if (num == 0) {
            System.out.println("0");
        } else {

            int firsterm = 0;
            int secondterm = 1;

            System.out.print("Fibonacci series: ");
            for (int i = 1; i <= num; i++) {

                System.out.print(firsterm + " ");

                int series = firsterm + secondterm;
                firsterm = secondterm;
                secondterm = series;

            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of terms: ");
            int num = sc.nextInt();

            fibonnaciSeries(num);
        }
    }
}