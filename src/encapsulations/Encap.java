package encapsulations;

public class Encap {
    public static void main(String[] args) {
        ICICIBank amit=new ICICIBank("Amit","10000");
        System.out.println(amit.getBalance());
        boolean isAdmin=true;
        amit.setBalance("20000",isAdmin);
        System.out.println(amit.getBalance());
    }
}


//Encapsulation is a programming concept that involves bundling data and methods into a
// single unit, and limiting direct access to some of that data
//Encapsulated data should be private so outside the class can not be access the objects
//Encapsulated data can be access or change by using getter and setter (read and write function)

