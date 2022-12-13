import java.util.*;


class Country{
    public void India(){
        System.out.println("India is a Independent country and it is under developing country also.");
        System.out.println("India about facts: ");
    }
}


class Maharastra extends Country{
    public void India(){
        System.out.println("In this district people is veary coprative and Intelegent also");

    }
}

class Bihar extends Country{
    public void India(){
        System.out.println("Bihar border is conected with nepal also.");
    }
}


public class Polymorphism {
    public static void main(String []args) {
        Country c = new Country();
        Country b = new Bihar();
        Country m = new Maharastra();
        c.India();
        b.India();
        m.India();
    }
}
