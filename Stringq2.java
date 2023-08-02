import java.util.*;
import java.lang.*;
 class Stringq2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
int i,j,flag=0;
char x='0';
System.out.println("Enter word: ");
        String str= sc.nextLine();
        char s[]=str.toCharArray();
     label:  for(i=0;i<str.length()-1;i++)
       {
         char c=s[i];
         for(j=i+1;j<str.length();j++)
{
if(c==s[j])
{
flag=1;
 x=s[j];
break label;
    }
}
}
if(flag==1)
{
for(i=0;i<str.length();i++)
{
s[i]=x;
System.out.print(s[i]);
}
}
else
{
System.out.print(str);
}
}
}