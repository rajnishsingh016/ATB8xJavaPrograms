package oct01programs;

public class ClassandObjects {


       // System.out.println("List of Bikes");
        String b1="Apache";
        String b2="KTM";
        String b3="Bullet";
        public void BikePrice(String name){
            if(name==b1){
                System.out.println("1,00,000");
                return;
            }else if (name==b2){
                System.out.println("2,00,000");
                return;
            }
            else{
                System.out.println("2,50,000");
                return;
            }
        }

    public static void main(String[] args) {
        ClassandObjects s2=new ClassandObjects();
        s2.BikePrice("Bullet");

    }

}