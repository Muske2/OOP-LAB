import java.lang.Math;
import java.util.*;
public class Sinx {
   public static int fact(int n){
    int f=1,i;
    for(i=1;i<=n;i++)
    {
        f=f*i;
    }
    return f;
   }
    public static void main(String args[])
    {
        int n,x,i;
        double s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        n=sc.nextInt();
        System.out.println("Enter value of x: ");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            s= s+ ((Math.pow(-1,i)*Math.pow(x,(2*i)+1))/fact((2*i)+1));
        }
        System.out.println(s);

    }
    
}
