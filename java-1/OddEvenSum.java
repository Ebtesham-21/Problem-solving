import java.util.*;

public class OddEvenSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;
        int evenSum = 0;
        int oddSum = 0;
        
        System.out.print("Enter number: ");
        number = sc.nextInt();
        if( number % 2 == 0) {
            evenSum += number;
        } else {
            oddSum += number;
        }

        System.out.println("Sum of even: " + evenSum);
        System.out.println("Sum of odd: " + oddSum);
        sc.close();

    }
    
}
