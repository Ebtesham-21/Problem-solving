import java.util.Scanner;

public class Average3{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the three numbers
        System.out.print("Enter number A: ");
        double A = scanner.nextDouble();

        System.out.print("Enter number B: ");
        double B = scanner.nextDouble();

        System.out.print("Enter number C: ");
        double C = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the average
        double average = calculateAverage(A, B, C);

        // Display the result
        System.out.println("The average of the three numbers is: " + average);
    }

    // Function to calculate the average of three numbers
    private static double calculateAverage(double A, double B, double C) {
        return (A + B + C) / 3;
    }
}