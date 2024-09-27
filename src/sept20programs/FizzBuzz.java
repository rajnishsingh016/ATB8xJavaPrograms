package sept20programs;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num=s.nextInt();

        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizz Buzz");

            }else if (i%5==0){
                System.out.println("Buzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }

        }






    }


}
