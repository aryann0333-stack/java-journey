
// this is used to check at required position wheather bit is 0 or 1

import java.util.Scanner;

public class getbit {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            System.out.print("Enter a position : ");
            int pos = sc.nextInt();

            if (pos < num) {
                System.out.println("Don't have civic sense  you dumb !! ");
            } else {
                int bitmask = 1 << pos;

                if ((bitmask & num) == 0) {
                    System.out.println("Bit was zero ");
                } else {
                    System.out.println("Bit was one");
                }
            }
        }
    }
}
