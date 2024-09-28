package sept20programs;
import java.util.Scanner;

public class GradeTernary {
    public static void main(String[] args) {
        // Input → int score = 85
        // String grade →
        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C


        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the marks");
        int marks=s.nextInt();
        char grade=(marks>=80)?(marks>=90?'A':'B'):(marks>80?'B':'C');
        System.out.println(grade);




    }
}
