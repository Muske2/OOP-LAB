 interface Area {
    void disp();
}
class Rect implements Area{
    int l,b;
    Rect(int x,int y)
    {
        l=x;b=y;
    }
    public void disp()
    {
        System.out.println("Area of Rectangle= "+(l*b));
    }
}
class Circle implements Area{
    int r;
    Circle(int x)
    {
        r=x;
    }
    public void disp()
    {
        System.out.println("Area of Circle= "+(3.14*r*r));
    }
}
class Lessgoo
{
    public static void main(String args[]) {
        Rect r=new Rect(10, 5);
        Circle c=new Circle(2);
        r.disp();
        c.disp();
        
    }
}
