import java.util.*;
public class LeapYear {
    public static void main(String args[])
    {
        boolean flag=false;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter year: ");
      int n=sc.nextInt();
      if(n%4==0)
      {
        if(n%100==0)
        {
            if(n%400==0)
            {
             flag=true;
            }
            else
            {
                flag=false;
            }
        }
        else
        {
            flag=true;
        }
      }
      else
      {
        flag=false;
      }
      System.out.println(flag);
    }
}
