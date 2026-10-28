import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            // declaration of array
            System.out.print("Enter a string: ");
            String str = sc.next();

            // since there are 256 charcter
            int[] hash = new int[256];

            // pre computing frequency
            for (int i = 0; i < str.length(); i++) {
                hash[str.charAt(i)]++;
            }

            System.out.print("Enter character to find frequency: ");
            char ch = sc.next().charAt(0);
            System.out.println("Frequency = " + hash[ch]);
        }

    }
}
