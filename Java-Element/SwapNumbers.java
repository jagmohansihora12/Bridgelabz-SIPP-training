import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
