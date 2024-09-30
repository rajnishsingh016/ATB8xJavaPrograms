package sept30programs;

import java.util.Scanner;

public class PrimeNumwithFor {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Please enter the maximum value");
       int n=15;
        int j=n-1;

        for (int i=1;i<=n;i++){
            if(i==1||i==0)
                continue;
           for(int x=2;x<=n/2;x++){
               if(i%x==0){
                   break;

               }
           }System.out.println(i);
            }
        }
    }

