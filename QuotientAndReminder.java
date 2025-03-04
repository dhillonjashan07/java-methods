import java.util.Scanner;

public class QuotientAndReminder {

    // Method to find the quotient and remainder of two numbers
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Calculate quotient
        int remainder = number % divisor; // Calculate remainder
        return new int[]{quotient, remainder}; // Return both as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two numbers
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if divisor is zero to avoid division by zero error
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            // Find the quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Output the results
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
