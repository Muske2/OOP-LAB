
import java.util.*;
public class Sumseries {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
       int n,s=0,i;
       System.out.println("Enter number of terms: ");
       n=sc.nextInt();
       for(i=0;i<n;i++)
       {
        s++;
       }
       System.out.println("Sum= "+s);
    }
}
