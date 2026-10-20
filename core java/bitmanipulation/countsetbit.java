
//  program to Count set bits in a number.

import java.util.Scanner;

public class countsetbit {
        public static void main(String[] args) {
                try (Scanner sc = new Scanner(System.in)) {

                        System.out.print("Enter a number: ");
                        int num = sc.nextInt();
                        int count = 0;

                        while (num > 0) {
                                count += (num & 1);
                                num = num >> 1;
                        }
                        System.out.println("Number of set  bits are : " + count);
                }
        }
}