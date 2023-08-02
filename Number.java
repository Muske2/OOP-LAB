import java.util.*;
class Number {
    int val;
    int isStrong(int x)
    {
        int i,fact=1;
        if(x/10==0)
        {
            for(i=1;i<=x%10;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        else
        {
            for(i=1;i<=x%10;i++)
            {
                fact=fact*i;
            }
            return fact+isStrong(x/10);
        }
    }
    void Str(int x)
    {
      if(isStrong(x)==x)
      {
        System.out.println("It is a Strong Number.");
      }
      else
      {
        System.out.println("It is not a Strong Number.");
      }
    }
    void isFriendlyPair(Number a ,Number b)
    {
        float r1,r2;
        int f1=0,f2=0,i;
        for(i=1;i<a.val;i++)
        {
            if(a.val%i==0)
            {
                f1=f1+i;
            }
        }
        for(i=1;i<b.val;i++)
        {
            if(b.val%i==0)
            {
                f2=f2+i;
            }
        }
        r1=f1/a.val;
        r2=f2/b.val;
        if(r1==r2)
        {
            System.out.println("is a Friendly pair.");
        }
        else
        {
            System.out.println("is not a Friendly pair.");
        }
    }
}
class Y{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,i;
        Number n[]=new Number[10];
        System.out.println("Enter number of terms in array of Number class objects: ");
        l=sc.nextInt();
        System.out.println("Enter terms: ");
        for(i=0;i<l;i++)
        {
            n[i]=new Number();
            n[i].val=sc.nextInt();
        }
        System.out.println("Strong Number check: ");
        for(i=0;i<l;i++)
        {
            System.out.println("For element "+(i+1)+": ");
            n[i].Str(n[i].val);
        }
        System.out.println("Friendly pair check: ");
        for(i=0;i<l-1;i++)
        {
            System.out.println("Element "+(i+1)+" and "+(i+2));
            n[i].isFriendlyPair(n[i], n[i+1]);
        }
    }
}
