 class Static {
    static int x;
    Static(int a)
    {
        x=a;
        y=x*3;
    }
    static int y;
    static{
       
    }
    static void disp()
    {
        System.out.println(x+"+"+y+"="+(x+y));
    }
    public static void main(String args[])
    {
        Static s=new Static(10);
        disp();
    }
}
