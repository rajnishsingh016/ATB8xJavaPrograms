package sept20programs;
import java.util.Scanner;

public class TringleClassifier {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter all 3 sides of Tringle");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();

        if(num1==num2 && num2==num3){
            System.out.println("Entered sides are of equilateral tringle");
        }else if (num1==num2 || num1==num3 || num2==num3) {
            System.out.println("Entered sides are of isosceles tringle");
        }else{
            System.out.println("Entered sides are of scalene tringle");
        }


    }
}
