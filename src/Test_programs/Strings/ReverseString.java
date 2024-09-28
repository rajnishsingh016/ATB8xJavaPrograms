//program to reverse the strings

package Test_programs.Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Please enter the string");
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();

        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }
        System.out.println("String before: "+word);
        System.out.println("Reverse String: "+reverse);

    }
}
