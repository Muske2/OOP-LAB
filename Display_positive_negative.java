import java.util.*;
public class Display_positive_negative {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int i,p=0,n=0,z=0,a;
       System.out.println("Enter 10 numbers: ");
       for(i=0;i<10;i++)
       {
         a=sc.nextInt();
         if(a<0)
         {
            n=n+1;
         }
         if(a>0)
         {
            p=p+1;
         }
         if(a==0)
         {
            z=z+1;
         }
       }
       System.out.println("Number of positive numbers entered= "+p);
       System.out.println("Number of negative numbers entered= "+n);
       System.out.println("Number of zeroes entered= "+z);

    }
}
