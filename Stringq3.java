import java.util.*;
import java.lang.*;
class Stringq3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        String s;
        System.out.println("Enter String: ");
        s=sc.nextLine();
        StringBuffer str=new StringBuffer(s);
        str.reverse();
        String s2=new String(str.toString());
        System.out.println("FOLLOWING CAN BE DONE ON THE STRING: ");
        System.out.println("1. Check whether a string is palindrome or not");
        System.out.println("2. Write the string in an alphabetical order");
        System.out.println("3. Reverse the string");
        System.out.println("4. Concatenate the original string and the reversed string");
        while(true)
        {
            System.out.println("ENTER CHOICE: ");
            n=sc.nextInt();
            switch(n)
            {
                case 1:
                if(s.equals(s2))
                {
                    System.out.println("It is a Palindrome.");
                }
                else 
                {
                    System.out.println("It is not a Palindrome.");
                }
                break;
                case 2:
                char c[]=s.toCharArray();
                Arrays.sort(c);
                System.out.println(new String(c));
                break;
                case 3:
                System.out.println("Reverse: "+s2);
                break;
                case 4:
                System.out.println(s.concat(s2));
                break;
                default:
                System.out.println("INVALID CHOICE");
                return;
            }
        }
    }
}
