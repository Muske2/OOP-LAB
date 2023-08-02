import java.util.*;
public class Bitwise {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number: ");
      int n=sc.nextInt();
      System.out.println(n+" multiplied by 2 will give= "+(n<<1));
      System.out.println(n+" divided by 2 will give= "+(n>>1));
    }
}
