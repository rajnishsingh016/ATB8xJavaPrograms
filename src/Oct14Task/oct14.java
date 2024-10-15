package Oct14Task;

 class PrintMyBook extends Book {



     PrintMyBook(String name,String author,int price){
        this.name=name;
         this.author=author;
         this.price=price;
     }

 void getDetails(){

     System.out.println(name+" "+author+" "+price);


 }


}

public class oct14{
    public static void main(String[] args) {
        PrintMyBook p = new PrintMyBook("Harry Potter","J.k. Rowling",120);
        p.getDetails();

    }
}