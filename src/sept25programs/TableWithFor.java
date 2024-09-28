//Table of number n = 10, print table with For or while.

package sept25programs;

import java.util.Scanner;

public class TableWithFor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please eneter the number: ");
        int number=s.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(number*i);
        }



    }
}
