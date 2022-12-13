import java.util.*;

//A class which contains the abstract keyword in its declaration is called abstract class.
// But we can create referance varable

abstract class Manager{
    public abstract void sal(); 
}

class Salary extends Manager{
    public void sal() {
        int sal = 10000;
        System.out.println("Your money is "+sal);
    }
    
}



public class MainAbstraction {
    public static void main(String args[]) {
        Manager s = new Salary();
        s.sal();
    }
}
