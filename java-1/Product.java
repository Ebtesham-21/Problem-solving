import java.util.Scanner;

public class Product {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double input1 = sc.nextDouble();
        double input2 = sc.nextDouble();
        double product = input1 * input2;
        System.out.println(product);
        sc.close();
    }
    
}
