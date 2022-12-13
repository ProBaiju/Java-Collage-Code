import java.util.*;


class Employe{
    int salary = 100000;
    class bonus{
        int bon = 20000;
    }
}


public class InnerClass {
    public static void main(String args[]) {
        Employe em = new Employe();
        Employe.bonus Inner = em.new bonus();
        System.out.println(Inner.bon + em.salary);
    }
}
