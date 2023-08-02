import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
        int pal,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        a=n;
        pal=0;
        while(n>0)
        {
            pal=(pal*10)+(n%10);
            n=n/10;
        }
        if(pal==a)
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
       
    }
}
