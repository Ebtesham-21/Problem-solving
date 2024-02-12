import java.util.*;
public class SumIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter integers: ");
        String input = sc.nextLine();
        String[] numbersAsString = input.split(" ");
        int[] numbers = new int[numbersAsString.length];

        for(int i = 0; i < numbersAsString.length; i++){
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int sumEven = 0;
        int sumOdd = 0;

        for (int number : numbers) {
            if(number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        System.out.println ("Sum of even integers: " + sumEven);
        System.out.println ("Sum of even integers: " + sumOdd);

        sc.close();

    }
    
}
