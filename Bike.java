 class Bike {
 int speedlimit;
 Bike()
 {
    speedlimit=70;
 }   
 void run()
 {
    System.out.println("Speedlimit of Bike: "+speedlimit);
 }
}
class Splendar extends Bike
{
    Splendar()
    {
        speedlimit=60;
    }
    void run()
    {
        System.out.println("Speed limit of Splendar: "+speedlimit);
    }
}
class Test
{
    public static void main(String args[])
    {
        Bike b=new Bike();
        Splendar s=new Splendar();
        Bike r;
        r=b;
        r.run();
        r=s;
        r.run();
    }
}
