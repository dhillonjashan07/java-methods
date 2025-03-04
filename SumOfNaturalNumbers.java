import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each natural number to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of natural numbers
            int sum = sumOfNaturalNumbers(n);

            // Output the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}
