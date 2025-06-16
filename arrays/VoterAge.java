package arrays;

import java.util.Scanner;

public class VoterAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the age of voter " + (i + 1) + ":");
            age[i] = sc.nextInt();

        }
        for (int i = 0; i < age.length; i++) {
            if (age[i] >= 18) {
                System.out.println("Voter " + (i + 1) + " is eligible to vote");

            } else if (age[i] < 0) {
                System.out.println("Voter " + (i + 1) + " not a valid age");
            } else {
                System.out.println("Voter " + (i + 1) + " is not eligible to vote");

            }
        }

    }

}
