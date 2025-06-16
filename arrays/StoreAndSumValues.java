package arrays;

import java.util.Scanner;

public class StoreAndSumValues {
    public static void main(String[] args) {
        double[] elements = new double[10];
        double sum = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the element(zero and negative number to stop)");
            double input = sc.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array is full");
                break;
            }
            elements[index] = input;
            index++;
        }
        for (int i = 0; i < index; i++) {
            sum += elements[i];
        }
        System.out.println("display all numbers");
        for (int i = 0; i < index; i++) {
            System.out.println(elements[i]);
        }
        System.out.println("Sum of all numbers is " + sum);
    }
}
