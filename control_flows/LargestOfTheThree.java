package control_flows;

import java.util.Scanner;

public class LargestOfTheThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();

        boolean number1IsLagest = number1 >= number2 && number1 >= number3;
        boolean number2IsLagest = number2 >= number1 && number2 >= number3;
        boolean number3IsLagest = number3 >= number1 && number3 >= number2;

        System.out.println("is number1 largest:" + (number1IsLagest ? "Yes" : "No"));
        System.out.println("is number2 largest:" + (number2IsLagest ? "Yes" : "No"));
        System.out.println("is number3 largest:" + (number3IsLagest ? "Yes" : "No"));
    }

}