package Test_programs.Strings;

public class StringFunctions {
    public static void main(String[] args) {
        //Java String charAt() Method
//        String  name="Rajnish 1234";
//        char position=name.charAt(0);
//        System.out.println(position);

        //Java String codePointAt() Method - Return the Unicode of the first character in a string (the Unicode value of "H" is 72):
//        int result=name.codePointAt(1);
//        System.out.println(result);


//Java String codePointCount() Method
//        result = name.codePointCount(0, 12);
//        System.out.println(result);

//Java String compareTo() Method: Compare two strings
//        String name1="Rajnish";
//        String name2="Rajnish";
//        int name=name1.compareTo(name2);
//        System.out.println(name); //0 means they are matching


        //Java String compareToIgnoreCase() Method
//        String name1="Rajnish";
//        String name2="rajnish";
//        int name=name1.compareToIgnoreCase(name2);
//        System.out.println(name); //0 means they are matching


        //Java String concat() Method
//        String name1="Rajnish";
//        String name2="Singh";
//        System.out.println(name1.concat(name2));

        //Java String contains() Method
        int vowels=0,constant=0;
        String name="Rajnish Singh";
        if(name.contains("a")||name.contains("e")||name.contains("i")||name.contains("o")||name.contains("u")){
            vowels++;
        }else {
            constant++;
        }
        System.out.println(vowels);
        System.out.println(constant);




    }
}
