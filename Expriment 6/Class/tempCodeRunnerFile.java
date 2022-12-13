import java.util.*;

class Man{
    int n=10;
    Man(int x){
        x +=n;
    }

    void print(int x){
        System.out.println(x);
    }
}

public class ClassJava {
    public static void main(String args[]) {
        Man m = new Man(10);
        m.print(10);

    }    
}
