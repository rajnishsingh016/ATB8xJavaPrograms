package sept20programs;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the year");
        int year=s.nextInt();

        if ((year%4 ==0 && year%100 !=0) || year%400==0){
            System.out.println(year + " is a leap year and has 366 days");
        }else {
            System.out.println(year + " is not a leap year and has 365 days");
        }


    }
}
