import java.util.*;
class Student_detail
{
    String name;
    int id;
    static String clg="MIT";
    void display_details()
    {
        System.out.println("Name: "+name+"\nID: "+id+"\nCollege name: "+clg);
    }
}
class yolo
{
    public static void main(String args[])
    {
        Student_detail s1=new Student_detail();
        Student_detail s2=new Student_detail();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and ID of student 1: ");
        s1.name=sc.nextLine();
        s1.id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name Student 2: ");
        s2.name=sc.nextLine();
        s2.id=sc.nextInt();
        s1.display_details();
        s2.display_details();
    }
}