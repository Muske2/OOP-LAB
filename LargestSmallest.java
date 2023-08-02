import java.util.*;
public class LargestSmallest {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=c<((a<b)?a:b)?c:((a<b)?a:b);
        int y=c>((a>b)?a:b)?c:((a>b)?a:b);
        System.out.println(x+ " is the smallest.");
        System.out.println(y+ " is the largest.");
        
    }
}
