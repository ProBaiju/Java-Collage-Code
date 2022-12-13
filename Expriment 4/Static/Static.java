import java.util.*;

public class Static {
    static int a;
    static int b;
    static {
       a = 10;
       b = 20;
       System.out.println(a);
    }
   
    public static void main(String args[]) {
   
     System.out.println("Value of a = " + a);
     System.out.println("Value of b = " + b);

     
   
        }
   }
