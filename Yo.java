import java.util.*;
public class Yo {
         public static void main(String args[]){
         float length,breadth;
         length=Float.parseFloat(args[0]); //command line arguments
        breadth=(args[1]); //convert string to integer
        int area=length *breadth;
        System.out.println("length of rectangle ="+ length);
        System.out.println("breadth of rectangle ="+ breadth);
        System.out.println("area of rectangle ="+ area);
}
}
