import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double bonus = input.nextDouble();
        double totalIncome = salary + bonus;
        System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
