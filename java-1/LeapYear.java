import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean isLeapYear = false;

        if(year % 4 == 0 ){
            if (year % 100 != 0 || year % 400 == 0 ){
                isLeapYear = true;
                System.out.println("is leapyear");

            }
            else {
                isLeapYear = false;
                System.out.println("is not leapyear");
            }

        }
    }
    
}
