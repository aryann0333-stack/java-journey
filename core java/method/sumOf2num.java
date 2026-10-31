// METHOD TO FIND SUM OF TWO NUMBERS

import java.util.Scanner;

public class sumOf2num {

  public static int sumOf2Num(int num1, int num2) {
    return num1 + num2;
  }

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter a number: ");
      int num1 = sc.nextInt();
      System.out.print("Enter a number: ");
      int num2 = sc.nextInt();

      System.out.println("Sum of two numbers is " + sumOf2Num(num1, num2));
    }
  }
}
