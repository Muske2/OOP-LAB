interface readable  
{
    void read();
}
class Text implements readable
{
   public void read()
   {
    System.out.println("Reading text");
   }
}
class Book implements readable
{
    public void read()
    {
        System.out.println("Reading Book.");
    }
}
class St implements readable
{
    public void read()
    {
        Book b=new Book();
        Text t=new Text();
        System.out.println("Student is ");
        b.read();
        System.out.println("and ");
        t.read();
    }
}
class Lotto
{
    public static void main(String args[])
    {
        Text t=new Text();
        Book b=new Book();
        St s=new St();
        t.read();
        b.read();
        s.read();
    }
}
