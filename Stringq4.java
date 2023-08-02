import java.util.*;
import java.lang.*;
class Stringq4 {
    static void convert(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='A' && c<='Z')
            {
                c+=32;
            }
            else if(c>='a' && c<='z')
            {
                c-=32;
            }
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        String s1;
        String s2;
        System.out.println("Enter string 1: ");
        s1=sc.nextLine();
        System.out.println("Enter string 2: ");
        s2=sc.nextLine();
        convert(s1);
        System.out.println(s1);
    }
}
