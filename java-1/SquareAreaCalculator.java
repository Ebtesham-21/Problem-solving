import java.util.Scanner;

public class SquareAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the area of the square
        double area = calculateSquareArea(sideLength);

        // Display the result
        System.out.println("The area of the square with side length " + sideLength + " is: " + area);
    }

    // Function to calculate the area of a square
    private static double calculateSquareArea(double sideLength) {
        // Area of a square formula: A = sideLength^2
        return Math.pow(sideLength, 2);
    }
}

