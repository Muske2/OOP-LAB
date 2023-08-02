import java.util.*;
interface Type {
    void details();
}
class Company implements Type
{
    Scanner sc=new Scanner(System.in);
    String t,m;
    int n;
    double sales;
    public void details()
    {
        Hardware h=new Hardware();
        Software s=new Software();
        sales=h.n*1000+s.n*500;
        h.details();
        s.details();
        System.out.println("Total sales for last 3 months: "+sales);
    }
}
class Hardware extends Company
{
    Hardware()
    {
        System.out.println("Enter category of item: ");
        t=sc.nextLine();
        System.out.println("Enter Original Manufacturer: ");
        m=sc.nextLine();
        System.out.println("Enter hardware sales of last 3 months: ");
        n=sc.nextInt();
    }
  public void details()
  {
    System.out.println("Category: "+t+"\nManufacturer: "+m);
  }
}
class Software extends Company{
    Software()
    {
        System.out.println("Enter type of Software: ");
        t=sc.nextLine();
        System.out.println("Enter Operating system: ");
        m=sc.nextLine();
        System.out.println("Enter software sales of last 3 months: ");
        n=sc.nextInt();
    }
    public void details()
    {
        System.out.println("Software: "+t+"\nOperating system: "+m);
    }
}
class ABC
{
    public static void main(String args[])
    {
        Company c=new Company();
        c.details();
    }
}
