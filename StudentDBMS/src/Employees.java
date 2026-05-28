public class Employees extends Persons
{   // Employees class

    // attributes
    private int Salary;

    public Employees()
    {   // constructor
        Salary = 0;
    }   // end of constructor

    public void setSalary(int salary)
    {   // method to set the salary
        Salary = salary;
    }   // end of method

    public int getSalary()
    {   // method to get the salary
        return Salary;
    }   // end of method
}   // end of class Employees
