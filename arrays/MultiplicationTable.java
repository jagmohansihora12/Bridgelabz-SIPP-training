package arrays;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationTable = new int[10];
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.printf("%d * %d = %d%n", number, i + 1, multiplicationTable[i]);
        }
    }
}
