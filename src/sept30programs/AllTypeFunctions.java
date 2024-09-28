package sept30programs;

public class AllTypeFunctions {
    public static void main(String[] args) {
        WRWAFunctions();
        String name=WRFunctions();
        System.out.println(name);
        WPFunctions(10,20);
        String fullname=WPRFunctions("Rajnish","Singh");
        System.out.println(fullname);
    }
//type 1: Without return and without argument
    public static void WRWAFunctions(){

        System.out.println("This function is without return and without argument");
    }

//type 2: with return and without argument
    public static String WRFunctions(){

        System.out.println("This function return value but without argument");
        return "Rajnish";
    }

    //Type 3 - With parameter(argument) and without return
    public static void WPFunctions(int a,int b){
            int c=a+b;
        System.out.println(c);
    }
    //Type 4 with parameter and with return
    public static String WPRFunctions(String a,String b){
        String name=a+b;
        return name;

    }

}


