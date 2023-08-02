import java.util.*;
class Bank
{
    int interest;
    int rateofinterest()
    {
       interest=0;
       return interest;
    }
}
class SBI extends Bank
{
   int rateofinterest()
    {
        interest=8;
        return interest;
    }
}
class ICICI extends Bank
{
   int rateofinterest()
    {
        interest=7;
        return interest;
    }
}
class AXIS extends Bank
{
    int rateofinterest()
    {
        interest=9;
        return interest;
    }
}
class Demo
{
    public static void main(String args[])
    {
        Bank b=new Bank();
        Bank r;
        ICICI i=new ICICI();
        SBI s=new SBI();
        AXIS a=new AXIS();
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter '1' for SBI,'2' for ICICI and '3' for AXIS bank:  ");
        int n=sc.nextInt();
        System.out.println("Interest rate provided by the bank: ");
        switch(n)
        {
            case 1:
                r=s;
                x=r.rateofinterest();
                System.out.println(x);
                break;
            case 2:
                r=i;
                x=r.rateofinterest();
                System.out.println(x);
                break;
            case 3:
                r=a;
                x=r.rateofinterest();
                System.out.println(x);
                break;
            default:
                 r=b;
                 x=r.rateofinterest();
                System.out.println(x);
                System.out.println("INVALID INPUT");
                break;
    }
}
}