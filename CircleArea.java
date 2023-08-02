import java.util.*;  
public class CircleArea {
    public static void main(String args[])
    {
       int r;
       double a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter radius= ");
       r= sc.nextInt();
       a=3.14*r*r;
       System.out.println("Area= "+a);
    }
}
