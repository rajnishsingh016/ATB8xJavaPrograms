package oct04programs;

public class ConstructorCalling {
    public static void main(String[] args) {
        String name;
        int age;
        //default constructor
      //  ConstructorExample cs=new ConstructorExample();
        //parametrized constructor
        ConstructorExample raj=new ConstructorExample("Rajnish",32);

        System.out.println(raj.name + raj.age);
        ConstructorExample vijay=new ConstructorExample("Vijay",30);
        System.out.println(vijay.name + vijay.age);

    }
}
