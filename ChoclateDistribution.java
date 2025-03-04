import java.util.Scanner;

public class ChoclateDistribution {

    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; // Calculate chocolates per child
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Calculate remaining chocolates
        return new int[]{chocolatesPerChild, remainingChocolates}; // Return both as an array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the number of children is zero to avoid division by zero error
        if (numberOfChildren == 0) {
            System.out.println("Error: The number of children cannot be zero.");
        } else {
            // Find the number of chocolates each child gets and the remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output the results
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
