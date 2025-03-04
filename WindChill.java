import java.util.Scanner;

public class WindChill
 {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula
        return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WindChill calculator = new WindChill();

        // Taking user input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();

        // Calculate wind chill
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        // Output the result
        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);

        // Close the scanner
        scanner.close();
    }
}
