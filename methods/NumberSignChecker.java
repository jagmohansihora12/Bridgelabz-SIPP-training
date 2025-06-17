package methods;

import java.util.Scanner;

public class NumberSignChecker {

    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1;  // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0;  // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int result = checkNumberSign(number);

        if (result == 1) {
            System.out.println(number + " is positive.");
        } else if (result == -1) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }

        scanner.close();
    }
}
