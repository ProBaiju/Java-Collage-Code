import java.util.*;

interface Study{
    void money();
    void income();
}

class MoneyClass implements Study{
    void money(){
        System.out.println("YOUR BANK BALANCE IS 151000");
    }
}

class incomeClass implements Study{
    void income(){
        System.out.println("YOUR INCOME 20000");
    }
}


class tempCodeRunnerFile{
    public static void main(String args[]) {
        Study s = new Study();
        s.income();
        s.money();
    }
}