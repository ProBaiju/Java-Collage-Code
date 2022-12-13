import java.util.*;

class Pen{
    void print(int price,String name){
        System.out.println("Your pen name is: "+ name +" And price is: "+price);
    }

}

public class object {
    public static void main(String args[]) {
        Pen MyObject = new Pen();
        MyObject.print(10, "balpen");
    }
}
