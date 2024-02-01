import java.util.Scanner;
public class CircleAreaCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radious of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();
        double area = calculateCircleArea(radius);
        System.out.println(area);


    }
    private static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }
}