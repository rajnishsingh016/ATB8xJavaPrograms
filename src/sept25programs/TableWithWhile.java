// Table of number n = 10, print table with For or while.

package sept25programs;

import java.util.Scanner;

public class TableWithWhile {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int i=1;
        while(i<=10 ){
            System.out.println(i*number);
            i++;
        }
    }
}
