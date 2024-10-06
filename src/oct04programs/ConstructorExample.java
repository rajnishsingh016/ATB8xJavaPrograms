package oct04programs;

public class ConstructorExample {

    String name;
    int age;
    ConstructorExample() {
        System.out.println("My name is Rajnish");
    }

    ConstructorExample(String name, int age) {
      this.name = name;
      this.age = age;

       // System.out.println("My name is " + name);
       // System.out.println("My age is " + age);
    }


}