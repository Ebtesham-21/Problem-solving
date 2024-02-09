import java.util.*;
public class Radious {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float valueofR = sc.nextInt();
        double radious =  valueofR * 3.14;
        int radiousFinal = (int) radious;
        System.out.println(radiousFinal);
        sc.close();
    }
    
}
