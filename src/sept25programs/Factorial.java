package sept25programs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the number to check the factorial no");
        int number=s.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=i*fact;

        }
        System.out.println(fact);
    }
}
