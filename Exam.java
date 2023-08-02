import java.util.*;
 class Stu {
    int roll;
    int m[][]=new int[10][3];
    int total[]=new int[10];
    Scanner sc=new Scanner(System.in);
    Stu()
    {
      
    }
    Stu[] read()
    {
        int i,j,x;
        Stu s[]=new Stu[3];
        for(i=0;i<3;i++)
        {
         s[i]=new Stu();
           s[i].roll=sc.nextInt();
           for(j=0;j<3;j++)
           {
            s[i].m[i][j]=sc.nextInt();
           }
           
        }
        return s;
    }
    void disp(Stu[] s)
    {
        int i,j;
        System.out.println("Roll no.\tSubject 1\tSubject 2\tSubject 3");
        for(i=0;i<3;i++)
        {
            System.out.print(s[i].roll+"\t\t");
          for(j=0;j<3;j++)
          {
             System.out.print(s[i].m[i][j]+"\t\t");
          }
          System.out.println();
        }
       
    }
    void t(Stu s[])
    {
        int i,j;
        for(i=0;i<3;i++)
        {
            s[i].total[i]=0;
            for(j=0;j<3;j++)
            {
                s[i].total[i]=s[i].total[i]+s[i].m[i][j];
            }
        }  
    }
    void high(Stu s[])
    {
        int i,j,high=0,r=0;
        for(i=0;i<3;i++)
        {
            if(s[i].m[i][0]>high)
            {
               high=s[i].m[i][0];
               r=s[i].roll;
            }
        }
        System.out.println("Roll number "+r+" has obtained highest marks"+"("+high+")"+ " in Subject 1.");
        high=0;
        for(i=0;i<3;i++)
        {
            if(s[i].m[i][1]>high)
            {
               high=s[i].m[i][1];
               r=s[i].roll;
            }
        }
        System.out.println("Roll number "+r+" has obtained highest marks"+"("+high+")"+ " in Subject 2.");
       high=0;
        for(i=0;i<3;i++)
        {
            if(s[i].m[i][2]>high)
            {
               high=s[i].m[i][2];
               r=s[i].roll;
            }
        }
        System.out.println("Roll number "+r+" has obtained highest marks"+"("+high+")"+ " in Subject 3.");
        high=0;
        for(i=0;i<3;i++)
        {
            if(s[i].total[i]>high)
            {
               high=s[i].total[i];
               r=s[i].roll;
            }
        }
        System.out.println("Roll number "+r+" has obtained highest total marks"+"("+high+")");
    }
 }
 class B{
        public static void main(String args[])
        {
            Stu x[]=new Stu[3];
            int i,j;
            Stu a=new Stu();
            System.out.println("Enter roll number,marks in subject 1,2 and 3 of students: ");
            x=a.read();
            a.disp(x);
            a.t(x);
            a.high(x);
        }
 }

