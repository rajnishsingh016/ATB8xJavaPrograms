//Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
//        Input  - 12
//        Out - Dec


package Sept23programs;
import java.util.Scanner;

public class MonthSwitch23Sept {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println(" Please enter the month");
        int month = s.nextInt();

        switch (month){
            case 1:{
                System.out.println("January");
            }
             case 2:{
                System.out.println("Februry");
            }
            case 3:{
                System.out.println("March");
                break;
            }
            case 4:{
                System.out.println("April");
            }
            case 5:{
                System.out.println("May");
                break;
            }
            case 6:{
                System.out.println("June");
                break;
            }
            case 7:{
                System.out.println("July");
                break;
            }
            case 8:{
                System.out.println("August");
                break;
            }
            case 9:{
                System.out.println("September");
                break;
            }
            case 10:{
                System.out.println("October");
                break;
            }
            case 11:{
                System.out.println("November");
                break;
            }
                case 12:{
                System.out.println("Decembder");
                break;
            }
            default:{
                System.out.println("Invalid input");
            }
        }


    }

}
