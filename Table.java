import java.util.*;
public class Table {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number= ");
        int n=sc.nextInt();
        int i;
        for(i=1;i<11;i++)
        {
          System.out.println(n+"x"+i+"="+(n*i));
        }
    }
}
