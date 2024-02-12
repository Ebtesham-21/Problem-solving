import java.util.*;
public class Marks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result =  (number >= 33) ? "pass" : "fail";
        System.out.println(result);
        sc.close();
    }
}
