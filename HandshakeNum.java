import java.util.Scanner;

public class HandshakeNum {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Output the result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

        // Close the scanner
        scanner.close();
    }
}
