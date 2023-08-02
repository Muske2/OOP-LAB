import java.util.*;
 class Marks {
    int internal;
    int endsem;
    char grade;
    void compute()
    {
        if(endsem>18 && (internal+endsem)>50)
        {
            grade='P';
        }
        else
        {
            grade='F';
        }
    }
}
 class Student{
    int regno;
   char name[]=new char[20];
    Marks m=new Marks();
    Student(int a,char[] b,int c,int d)
    {
        regno=a;
        name=b;
        m.internal=c;
        m.endsem=d;
    }
}
 class Result{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i;
        Student s[]=new Student[3];
        char y[]=new char[20];
        System.out.println("Enter regno,name,internal marks and endsem marks: ");
        for(i=0;i<3;i++)
        {
            int x=sc.nextInt();
            y=sc.next().toCharArray();
           // System.out.println(y);
            int m1=sc.nextInt();
            int m2=sc.nextInt();
             s[i]=new Student(x,y,m1,m2);
             //
        }
        System.out.println("Regno\tName\tInternal marks\tEndsem marks");
        for(i=0;i<3;i++)
        {
            
            s[i].m.compute();
            if(s[i].m.grade=='P')
            {
                String name=new String(s[i].name);
                System.out.println(s[i].regno+'\t'+name+'\t'+s[i].m.internal+'\t'+s[i].m.endsem);
            }
        }
    }
}
