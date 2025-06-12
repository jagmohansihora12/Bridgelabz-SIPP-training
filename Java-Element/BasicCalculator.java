import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + num1 + " and " + num2 + " is " + sum + ", " + difference + ", " + product + ", and " + quotient);
    }
}
