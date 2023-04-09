import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter name department"+"1:");
        String s1=s.next();
        System.out.print("Enter name department"+"2:");
        String s2=s.next();
        System.out.print("Enter name department"+"3:");
        String s3=s.next();




        Derar derar1=new Derar(s1);
        Derar derar2=new Derar(s2);
        Derar derar3=new Derar(s3);
        ArrayList<Derar>derars=new ArrayList<>();
        derars.add(derar1);
        derars.add(derar2);
        derars.add(derar3);
        System.out.println(derars.toString());






    }
}