import java.util.*;
public class Week {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day) {
            case 1:
            System.out.println("Friday");
            break;
            case 2:
            System.out.println("Saturday");
            break;
            case 3:
            System.out.println("Sunday");
            break;
            case 4:
            System.out.println("Monday");
            break;
            default:
            System.out.println("Day Invalid");
            sc.close();
            

        }
    }
    
}
