package methods;

import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int totalHandshakes = calculateHandshakes(numberOfStudents);

        System.out.printf("The maximum number of handshakes among %d students is: %d%n", numberOfStudents, totalHandshakes);

        scanner.close();
    }
}
