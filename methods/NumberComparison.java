package methods;

import java.util.Scanner;

public class NumberComparison {

    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int[] result = new int[2];
        result[0] = Math.min(Math.min(num1, num2), num3); // Smallest
        result[1] = Math.max(Math.max(num1, num2), num3); // Largest
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int[] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        scanner.close();
    }
}

