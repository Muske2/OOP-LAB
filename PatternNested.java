import java.util.*;
public class PatternNested {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,j,m=1;
        System.out.println("Enter number of rows: ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
        
    }
}
