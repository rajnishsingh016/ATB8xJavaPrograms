package inheritance;

//In MH, child class inherit the property of parent which is child of another parent class.

class GrandFather{
    String lname="Singh";
}

class Father1 extends GrandFather{
   String mname="kumar";
}
class Son extends Father1{
    String fname="Vijay";
}


public class Multilevel {
    public static void main(String[] args) {
        Son s=new Son();
        String fullname=s.fname+" "+s.mname+" "+s.lname;
        System.out.println(fullname);
    }
}
