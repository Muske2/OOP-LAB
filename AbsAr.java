abstract class AbsAr{
    abstract double Area();
}
class Rectangle extends AbsAr
{
    int l,b;
    Rectangle(int x,int y)
    {
        l=x;
        b=y;
    }
    double Area()
    {
        double a=l*b;
        return a;
    }
}
class Circle extends AbsAr
{
    int r;
    Circle(int x)
    {
        r=x;
    }
    double Area()
    {
        double a=3.14*r*r;
        return a;
    }
}
class HIE
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle(10, 5);
        Circle c=new Circle(1);
       System.out.println("Area of Rectangle= "+ r.Area());
       System.out.println("Area of Circle= "+ c.Area());
    }
}