import java.util.*;
class Box {
    int l,b,h;
    Box()
    {
        l=b=h=-1;
    }
    Box(int x,int y,int z)
    {
       l=x;
       b=y;
       h=z;
    }
    Box(int n)
    {
        l=b=h=n;
    }
    int Vol()
    {
        int v;
        v=l*b*h;
        return v;
    }
}
 class Volume
{
    public static void main(String args[])
    {
      int n,v;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter '1' if Box is cube and '2' if Box is not a cube: ");
      n=sc.nextInt();
      switch(n)
      {
        case 1:
        int l;
        System.out.println("Enter side of cube: ");
        l=sc.nextInt();
        Box a=new Box(l);
        v=a.Vol();
        System.out.println("Volume= "+v);
        break;
        case 2:
        int x,y,z;
        System.out.println("Enter dimensions of box: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        Box b=new Box(x,y,z);
        v=b.Vol();
        System.out.println("Volume= "+v);
        break;
        default:
        Box c=new Box();
        v=c.Vol();
        System.out.println("Volume= "+v);
      }
      }
    }
