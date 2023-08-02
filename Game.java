class Game {
    void type()
    {
        System.out.println("indoor and outdoor games");
    }
}
class Cricket extends Game
{
    void type()
    {
        System.out.println("Cricket is an outdoor game.");
    }
}
class Chess extends Game
{
    void type()
    {
        System.out.println("Chess is an indoor game.");
    }
}
class G{
    public static void main(String args[])
    {
        Game g=new Game();
        Cricket a=new Cricket();
        Chess b=new Chess();
        Game r;
        r=g;
        r.type();
        r=a;
        r.type();
        r=b;
        r.type();
    }
}