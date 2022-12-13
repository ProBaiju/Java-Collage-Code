import java.util.*;

class Employee
{
	private
     int empid;
	private
     String emp;
	private double salary;
	public void setSalary(Double sal)
	{
		if(sal < 0)
		{
			System.out.println("Salary cannot be negative");
		}
		else
		{
			salary = sal;
		}
	}
}


public class AccessControl {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.setSalary(-1000.00);  
        e1.setSalary(2000.00);
    }
}
