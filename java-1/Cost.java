import java.util.*;
public class Cost {
    public static void main(String args[]){
        Scanner item1 = new Scanner(System.in);
        int input1 = item1.nextInt();
        Scanner item2 = new Scanner(System.in);
        int input2 = item2.nextInt();
        Scanner item3 = new Scanner(System.in);
        int input3 = item3.nextInt();
        int total = input1 + input2 + input3;
        double gst = total * .18;
        double totalWithTax = gst + total;
        System.out.println(totalWithTax);
        item1.close();
        item2.close();
        item3.close();

    }
    
}
