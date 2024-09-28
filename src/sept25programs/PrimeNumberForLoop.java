package sept25programs;

import java.util.Scanner;

public class PrimeNumberForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int number = s.nextInt();//100
        int x, y, flag;
        System.out.println("All the prime from 1 to " + number + " are: ");
        for (x = 1; x <= number; x++) {
            if (x == 1 || x == 0)
                continue;
                flag = 1;
                for (y = 2; y <= x / 2; y++) {
                    if (x % y == 0) {
                        flag = 0;
                        break;
                    }
                }

                if (flag == 1)
                    System.out.println(x + " ");
            }

        }
    }












