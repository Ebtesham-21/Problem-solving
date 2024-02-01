import java.util.Scanner;

public class GreatestNumberFinder {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();
        double greatestNumber = findGratestNumber(num1, num2);
        System.out.println("The greatest number is: " + greatestNumber);
    }
    private static double findGratestNumber(double num1, double num2){
        return Math.max(num1, num2);
    } 
}
