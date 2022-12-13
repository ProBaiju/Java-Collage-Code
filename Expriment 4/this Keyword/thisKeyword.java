import java.util.*;

//In java, this is a referance variable

class Krishna{
    Krishna(){
        System.out.println("I'm Krishna bro...");
    }

    Krishna(int n){
        this();
        System.out.println(n);
    }
}


public class thisKeyword {
    public static void main(String args[]) {
        Krishna k = new Krishna(20);     
    }
   
}
