


abstract class AbsClass{

    int no_of_tyre;
    abstract void Engine();

}

class Car extends AbsClass{
   int no_of_tyre=4;

    @Override
    void Engine() {
        System.out.println("Car starts with Key");
    }
}

class Bike extends AbsClass{
   int no_of_tyre=2;
    void Engine(){
        System.out.println("Bike Starts with Kick");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();
        System.out.println(c.no_of_tyre);
        c.Engine();
        System.out.println(b.no_of_tyre);
        b.Engine();
    }


}
