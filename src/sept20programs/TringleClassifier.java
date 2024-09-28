package sept20programs;
import java.util.Scanner;

public class TringleClassifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->


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
