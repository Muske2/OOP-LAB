import java.util.*;
public class TypeCasting {
    public static void main(String args[])
    {
        int x;
        double y;
        char z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer= ");
        x=sc.nextInt();
        System.out.println("Enter double= ");
        y=sc.nextDouble();
        System.out.println("Enter char= ");
        z=sc.next().charAt(0);
        byte a=(byte)x;
        System.out.println("Int to Byte= "+a);
        int b=z;
        System.out.println("Char to int= "+b);
        byte c=(byte)y;
        System.out.println("Double to Byte= "+c);
        int d=(int)y;
        System.out.println("Double to Int= "+d);
        int m=1,n=2;
        m=++n;
        System.out.println(m);
        m=n++;
        System.out.println(m);
    }
}
