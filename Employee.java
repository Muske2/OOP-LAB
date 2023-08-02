import java.util.*;
import java.lang.*;
class Employee {
    String name;
    String city;
    double salary;
    double da;
    double hra;
    double t;
    Scanner sc=new Scanner(System.in);
    void get_data(){
       name=sc.nextLine();
       city=sc.nextLine();
       salary=sc.nextDouble();
       da=sc.nextDouble();
       hra=sc.nextDouble();
    }
    void calculate()
    {
        t=salary+(salary*da/100) +(salary*hra/100);
    }
    void display()
    {
        System.out.println("Total= "+t);
    }
}
class olo{
    public static void main(String args[])
    {
        
        Employee e=new Employee();
        System.out.println("Enter name,city,basic salary,dearness allowance and house rent: ");
        e.get_data();
        e.calculate();
        e.display();
    }
}
