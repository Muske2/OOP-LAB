import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        do
        {
            System.out.println("Enter first number,operator,second number: ");
            float a=sc.nextFloat();
            char o=sc.next().charAt(0);
            float b=sc.nextFloat();
            switch(o)
            {
              case '+':
              System.out.println(a+b);
              break;
              case '-':
              System.out.println(a-b);
              break;
              case '*':
              System.out.println(a*b);
              break;
              case '/':
              System.out.println(a/b);
              break;
              default:
              System.out.println("INVALID");
              break;
            }
            System.out.println("Do another(y/n)?: ");
             c=sc.next().charAt(0);
        }
        while(c=='y');
        
    }
}
