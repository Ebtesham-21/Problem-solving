import java.util.*;
public class Ascending {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        for(int number:numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (int number:numbers){
            System.out.print(" ");
        }

        scanner.close();
    }
    
}
