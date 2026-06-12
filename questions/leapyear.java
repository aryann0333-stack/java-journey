
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Year: ");
            int year = sc.nextInt();

            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Enterd year is leap year you fool !!");
            } else {
                System.out.println("Dude common sense It's not a leap year");
            }
        }
    }
}