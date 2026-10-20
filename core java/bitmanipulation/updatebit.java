
// we have to change 1 to 0 and 0 to 1 

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            System.out.print("Enter a position to set: ");
            int pos = sc.nextInt();

            System.out.print("Enter operation 0 or 1: ");
            int oper = sc.nextInt();

            // oper=1 means set and oper =0 means clear
            int bitmask = 1 << pos;

            if (pos < 0) {
                System.out.println("Don't have civic sense  you dumb !! ");
            } else if (oper == 1) {

                int newnum = bitmask | num;
                System.out.println("after setting new number is : " + newnum);
            } else if (oper == 0) {
                int newbitmask = ~(bitmask);
                int newnum = newbitmask & num;
                System.out.println("after clearing new number is : " + newnum);
            }
        }
    }
}
