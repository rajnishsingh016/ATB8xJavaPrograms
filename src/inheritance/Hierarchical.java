package inheritance;
//HI Two or more different child class inherit the property of parent class

class Engine{
    String engine = "1100CC";
}

class Nexon extends Engine{
    String nexonEngine=engine;
}
class Baleno extends Engine{
    String BalenoEngine=engine;
}




public class Hierarchical {
    public static void main(String[] args) {
        Nexon e = new Nexon();
        System.out.println("Nexon engine is "+e.nexonEngine);

        Baleno b= new Baleno();
        System.out.println("Baleno engine is "+b.BalenoEngine);

    }
}
