
// we have to make given position bit to 1
// operator = 0r(|)

import java.util.Scanner;

public class setbit {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            System.out.print("Enter a position to set: ");
            int pos = sc.nextInt();

            if (pos < 0) {
                System.out.println("Don't have civic sense  you dumb !! ");
            } else {
                int bitmask = 1 << pos;

                int newnum = bitmask | num;
                System.out.println("after setting new number is : " + newnum);
            }
        }
    }
}
