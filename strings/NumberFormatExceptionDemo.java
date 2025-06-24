package strings;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Number: " + num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        generateException(input);
        handleException(input);
    }
}
