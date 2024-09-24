package testprograms;
import java.util.Scanner;

public class CalculatorSwitch23Sept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1=sc.nextInt();
        System.out.println("Enter the number2");
        int num2=sc.nextInt();
        System.out.println("Please enter the opertion as below: add,subtract,multiply,devide");
         String action=sc.next();

        switch(action){
            case "add":{
                   int sum= num1+num2;
                System.out.println("Addition of inputs: "+ sum);
                break;

            }
            case "subtract":{
                int subtract=num2-num1;
                System.out.println("subtract of inputs: "+ subtract);
                break;
            }
            case "multiply": {
                int multiply=num1*num2;
                System.out.println("multiply of inputs: "+ multiply);
                break;
            }
            case "devide": {
                int devide=num2/num1;
                System.out.println("devide of inputs: "+ devide);
                break;

            }
            default:{
                System.out.println("We dont recongnize the input");

            }
        }





    }
}
