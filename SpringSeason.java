public class SpringSeason {

    // Method to check if the date is in Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for Spring season dates
        if (month == 3 && day >= 20) {
            return true; // From March 20 onwards
        } else if (month == 4) {
            return true; // All of April
        } else if (month == 5) {
            return true; // All of May
        } else if (month == 6 && day <= 20) {
            return true; // Up to June 20
        }
        return false; // Not in Spring season
    }

    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse the month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if it's Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}

