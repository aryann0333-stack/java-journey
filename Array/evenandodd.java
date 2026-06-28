
//  a program to Count even and odd elements 
import java.util.Scanner;

public class evenandodd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // declaration of array
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            int even = 0;
            int odd = 0;

            // input of array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter elements " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            // logic for even odd count
            for (int i = 0; i < size; i++) {

                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("Even elements = " + even);
            System.out.println("Odd elements = " + odd);
        }

    }

}
