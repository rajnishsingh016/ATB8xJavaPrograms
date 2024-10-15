package Test_programs;

class StaticFunction {

    void display() {
        System.out.println("This is normal function");
    }

    static void Display() {
        System.out.println("This is static function");
    }

}

public class StaticFunctionMAIN {
    public static void main(String[] args) {
        StaticFunction sf=new StaticFunction();
        sf.display();
        StaticFunction.Display();
    }
}
