import java.util.*;
class Student {
    int regno;
    String name;
    int age;
    Scanner sc=new Scanner(System.in);
    Student()
    {
        System.out.println("Enter name,registeration number and age of student: ");
        name=sc.nextLine();
         regno=sc.nextInt();
        age=sc.nextInt();
    }
    void disp()
    {
        System.out.print(regno+"\t\t"+name+"\t\t"+age+"\t\t");
    }
}
class UG extends Student{
    int sem;
    double fee;
    UG()
    {
        System.out.println("Enter semester: ");
        sem=sc.nextInt();
         if(sem==1 || sem==2)
    {
        fee=6000;
    }
    else if(sem==3 || sem==4)
    {
        fee=12000;
    }
    else if(sem==5 || sem==6)
    {
        fee=20000;
    }
    else if(sem==7 || sem==8)
    {
        fee=45000;
    }
    else
    {
        System.out.println("INVALID SEMESTER.");
    }
    }
    void disp()
    {
        super.disp();
        System.out.print("\t\t"+sem+"\t\t"+fee);
    }

}
class PG extends Student{
    int sem;
    double fee;
    PG()
    {
        System.out.println("Enter semester: ");
        sem=sc.nextInt();
        if(sem==1 || sem==2)
    {
        fee=10000;
    }
    if(sem==3 || sem==4)
    {
        fee=20000;
    }
    if(sem==5 || sem==6)
    {
        fee=30000;
    }
    if(sem==7 || sem==8)
    {
        fee=50000;
    }
    }
    void disp()
    {
        super.disp();
        System.out.print("\t\t"+sem+"\t\t"+fee);
    }
}
class S{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter '1' if UG student and '2' if PG student: ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
            UG u=new UG();
            System.out.println("Reg no"+"\t\t"+"Name"+"\t\t"+"Age"+"\t\t"+"Sem"+"\t\t"+"Fees");
            System.out.println();
            u.disp();
            break;
            case 2:
            PG p=new PG();
            System.out.println("Reg no"+"\t\t"+"Name"+"\t\t"+"Age"+"\t\t"+"Sem"+"\t\t"+"Fees");
            System.out.println();
            p.disp();
            break;
            default:
            System.out.println("INVALID INPUT");
            break;
        }
    }
}
