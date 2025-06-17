package methods;

import java.util.Scanner;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double[] results = new double[3];
        results[0] = Math.sin(radians); // Sine
        results[1] = Math.cos(radians); // Cosine
        results[2] = Math.tan(radians); // Tangent
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);

        System.out.printf("For %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", trigValues[0]);
        System.out.printf("Cosine: %.4f%n", trigValues[1]);
        System.out.printf("Tangent: %.4f%n", trigValues[2]);

        scanner.close();
    }
}

