
/*we have to change the bit from 1 to zero at required pos 
operator used : NOT with  AND  */

import java.util.Scanner;

public class clearbit {
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
                int notbitmask = ~(bitmask);

                int newnum = notbitmask & num;
                System.out.println("After setting new number is : " + newnum);
            }
        }
    }
}
