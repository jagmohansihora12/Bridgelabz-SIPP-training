package methods;


public class SpringSeason {

    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide both month and day as command-line arguments.");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("Invalid date input.");
                return;
            }

            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers for month and day.");
        }
    }
}
