package inheritance;

//Single Inheritance- IN SH, child class inherit the property of parents class. Child object can access behaviour and attributes of the parent class

class Father{
    String lname="Singh";
    int fproperty=50000;

}

class Son1 extends Father{
    String fname="Rajnish";
    int lproperty =30000;
}

public class SingleInheritance {
    public static void main(String[] args) {
        Son1 s1= new Son1();
        String name=s1.fname+" "+s1.lname;
        int property=s1.fproperty+s1.lproperty;
        System.out.println(name);
        System.out.println(property);
    }
}
