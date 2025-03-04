import java.util.Scanner;

public class Simpleintrest {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculating simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Outputting the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n", 
                          simpleInterest, principal, rate, time);

        // Closing the scanner
        scanner.close();
    }
}
