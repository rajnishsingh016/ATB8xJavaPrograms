package sept30programs;

import java.util.Scanner;

public class FactorialwithFor {
    public static void main(String[] args) {

        int a,fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the value to get the Factorial");
        int sum=s.nextByte();

        for(a=1;a<=sum;a++)
        {
            fact=fact*a;

        }
        System.out.println(fact);
    }
}
