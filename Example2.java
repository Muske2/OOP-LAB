class Example2{
     static int num;
    //Static class
    public static class X{
    num=99;
    static String str="Inside Class X";
    }
    public static void  main(String args[])
    {
    Example2.X obj = new Example2.X(); 
   System.out.println("Value of num="+obj.str);
    }
   }