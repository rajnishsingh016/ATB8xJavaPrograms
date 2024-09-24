package sept20programs;

import java.util.Scanner;

public class MaxUsingTerenary {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Please enter three input to check the max number");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int num3=s.nextInt();

        int num4 =(num1>num2)?num1:num2;
        int max = (num3>num4)?num3:num4;
        System.out.println("Max number is "+max);


    }
}
