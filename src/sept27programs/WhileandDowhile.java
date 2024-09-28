package sept27programs;


import java.sql.SQLOutput;

public class WhileandDowhile{
    public static void main(String[] args) {

        int x=1,num=11;

        System.out.println("Printing 1 to 10 ");
        System.out.println("Using While loop: ");
        while(num>=x){
            System.out.println(" "+num );
            num--;
        }

        System.out.println("While using Do-While loop");
        System.out.println("Number current value: "+num+" is already failing in the condition still it will execute");
        do{
            System.out.println(num);
            num--;
        }while (num>=x);



    }



}
