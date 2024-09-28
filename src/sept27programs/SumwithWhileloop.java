package sept27programs;

import java.util.Scanner;

public class SumwithWhileloop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the number");
        int x=0,num= s.nextInt();
        int sum=0;
        while(x<=num){
            sum=sum+x;
            x++;
        }
        System.out.println(sum);
    }
}
