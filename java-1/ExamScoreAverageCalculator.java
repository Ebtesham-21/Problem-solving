import java.util.Scanner;

public class ExamScoreAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] examScores = new double[25];

        for(int i = 0; i < 25; i++) {
            System.out.print("exam score "+(i + 1));
            examScores[i] = scanner.nextDouble();
        }
        scanner.close();
        double average = calculateAverage(examScores);
        System.out.println("The average exam score is: " + average);
    }
    private static double calculateAverage(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
