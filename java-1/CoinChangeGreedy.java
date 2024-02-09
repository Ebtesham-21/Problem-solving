import java.util.*;

public class CoinChangeGreedy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of coins: ");
        int numCoins = scanner.nextInt();

        int[] coins = new int[numCoins];

        System.out.println("Enter the coin values: ");
        for (int i = 0; i < numCoins; i++) {
            coins[i] = scanner.nextInt();
        }

        Arrays.sort(coins);
        reverse(coins);

        System.out.print("Enter the change amount: ");
        int changeAmount = scanner.nextInt();


        int[] coinCount = new int[numCoins];
        for (int i = 0; i < numCoins; i++) {
            coinCount[i] = changeAmount / coins[i];
            changeAmount %= coins[i];
        }


        System.out.println("Coins Needed:");
        for (int i = 0; i < numCoins; i++) {
            if (coinCount[i] > 0) {
                System.out.println(coins[i] + " coin " + coinCount[i] + " times");
            }
        }

        scanner.close();
    }

  
    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


