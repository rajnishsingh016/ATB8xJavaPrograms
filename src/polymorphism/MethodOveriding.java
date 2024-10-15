package polymorphism;

//Method overridding means simply it will find the method in child class and in case if it is unavailable, it will get the method from base class
//It means method name and arguments should be the same in base and child class
//Inheritance should be there

class Father{
String home="2BHK";
}

class Son extends Father{
   // String home="3BHK";
}


public class MethodOveriding {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.home);
    }

}

//In above example, system will get the home value from son class and if there is no function, it will get the value from parent class
//Method overriding allow same method with same parameter in different class.