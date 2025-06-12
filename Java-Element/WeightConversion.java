import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();
        double weightInKg = weightInPounds * 0.453592;
        System.out.println(weightInPounds + " pounds is equal to " + weightInKg + " kilograms.");
    }
}
