class Ex1 extends Thread{
    Ex1(){
        start();
    }
    public void run(){
            for(int i=0;i<=3;i++){
                System.out.println("A: "+i);
            }
    }
}

class Threader implements Runnable{
    Thread t;
    Threader(){
        t= new Thread(this,"Example");
        t.start();
    }
    public void run()
    {
            for(int i=3;i>=0;i--){
                System.out.println("B: "+i);
    }
}
}
class Moo
{
    public static void main(String args[])
    {
        Ex1 t=new Ex1();
        Threader b=new Threader();
        try
        {
            Thread.sleep(10000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrrupted");
        }
    }
}