import java.util.Scanner;

public class TrianglePark {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds needed to complete 5 km
    public static double calculateRounds(double perimeter) {
        double distanceToRun = 5000; // 5 km in meters
        return distanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sides of the triangle
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculating the perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Calculating the number of rounds needed
        double rounds = calculateRounds(perimeter);

        // Outputting the result
        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km in the triangular park.%n", rounds);

        // Close the scanner
        scanner.close();
    }
}
