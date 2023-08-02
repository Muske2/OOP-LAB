import java.util.*;
public class Searchforeach {
    public static void main(String args[])
    {
        int n,flag=0,j=0;
        int a[]={1,2,3,1,2,1,5,6,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:  a[]={1,2,3,1,2,1,5,6,7}");
        System.out.println("Search value= ");
        n=sc.nextInt();
        System.out.println("The value is found at locations: ");
        for(int i:a)
        {
            if(i==n)
            {
                flag=1;
                System.out.print("a["+j+"]  ");
               
            }
            j=j+1;
        }
        if(flag==0)
        {
            System.out.println("nil");
        }
    }
}
