package Sept24programs;

import java.util.Scanner;

public class CovertSwitch23Sept {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Please select the option ");
        System.out.println("Option 1: Enter 1 To convert kilometer into miles ");
        System.out.println("Option 2: Enter 2 To convert Celsium to Fahrenheit ");
        int convert=s.nextInt();

        switch (convert){
            case 1:{
                System.out.println("Please enter the kilometer to be converted into miles");
//                Scanner s=new Scanner(System.in);
                int km=s.nextInt();
                double miles=km*0.621371;
                System.out.println(miles+ " miles");
                break;
            }
            case 2:{
                System.out.println("Please enter the celsius to be converted into Fahrenheit");
//                Scanner s=new Scanner(System.in);
                int celsius=s.nextInt();
                double farh=(celsius*9/5) + 32;
                System.out.println(farh+" F");
                break;

            }
            default:{
                System.out.println("Invalid option");
            }

        }




    }
}
