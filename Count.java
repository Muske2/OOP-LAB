import java.util.*;
 class Count {
     static void cnt(String s)
    {
        char c[]=s.toCharArray();
         int i,w=1,l=1,v=0;
        for(i=0;i<s.length();i++)
        {
           switch(c[i])
           {
            case '\n':
            l++;
            case ' ':
            w++;
            break;
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            v++;
            break;
           }
        }
        System.out.println("Number of characters= "+s.length());
            System.out.println("Number of words= "+w);
            System.out.println("Number of lines= "+l);
            System.out.println("Number of vowels= "+v);
    }
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=new String();
        String str=new String();
        System.out.println("Enter String: ");
        s=sc.nextLine();
        while(true)
        {
            str=sc.nextLine();
            if(str.length()==0)
            {
                break;
            }
            s=s.concat("\n");
            s=s.concat(str);
        }
        cnt(s);
       sc.close();
    }
}
