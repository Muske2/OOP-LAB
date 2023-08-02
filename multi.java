import java.util.*;
class Ex extends Exception
{
    public String toString()
    {
        return "Cannot get factorial of negative number.";
    }
}
class Factorial implements Runnable
{
    int n;
    Thread t;
    int f=1;
    Factorial(int n)
    {
        this.n=n;
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }
            System.out.println("Factorial= "+f);
    }
}
class Sq extends Thread{
    int n;
    Sq(int n)
    {
        super("Yo");
        this.n=n;
        start();
    }
    public void run()
    {
        int s;
        s=n*n;
        System.out.println("Square= "+s);
    }
}
class multi
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter: ");
        int n=sc.nextInt();
        try 
        {
            if(n<0)
            {
                throw new Ex();
            }
            Factorial f=new Factorial(n);
        }
        catch(Ex e)
        {
            System.out.println(e);       
        }
        Sq s=new Sq(n);
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
}