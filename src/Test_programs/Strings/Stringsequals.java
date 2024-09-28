//What is the difference between str1 == str2 and str1.equals(str2)?
//Essentially, equals() is a method, while == is an operator.
//The == operator can be used for comparing references (addresses) and
// the .equals() method can be used to compare content.
// To put it simply, == checks if the objects point to the same memory location,
// whereas .equals() compares the values of the objects.
package Test_programs.Strings;

import java.util.Scanner;

public class Stringsequals {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String str1=s.nextLine();
        String str2=s.nextLine();


        System.out.println("Using str1 == str2 ");
        System.out.println(str1 == str2);

        System.out.println("Using str1.equals(str2)");
        System.out.println(str1.equals(str2));


    }
}



//If str1 and str2 are compared using the == operator, then the result will be false, because both have different addresses in the memory. Both must have the same address in the memory for the result to be true.
//If you use the equals method, the result is true since it's only comparing the values given to str1 and str2, even though they are different objects