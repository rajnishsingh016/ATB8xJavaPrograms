package polymorphism;

class Math{
    String add(String a, String b){
        return a+b;
    }
    int add(int a, int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    void add(){
        System.out.println("This is adding function");
    }
}


public class MethodOverloading {
    public static void main(String[] args) {
        Math m=new Math();
        System.out.println(m.add(6,5));
        System.out.println(m.add(6.3F,5.2F));
        System.out.println(m.add("Rajnish","Singh"));
        m.add();


    }
}
