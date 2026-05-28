public class Teachers extends Employees
{   // Teachers class

    // attributes
    private String Qualification;

    public Teachers()
    {   // constructor
        Qualification = "";
    }   // end of constructor

    public void Teachers(String qualification)
    {   // method to set the Teachers
        Qualification = qualification;
    }   // end of method

    public String getQualification()
    {   // method to get the qualification
        return Qualification;
    }   // end of method

    //public double computeSalary(int wDays, int Scale)
    //{   // method to compute the salary
    //    return 0;
    //}   // end of method
}
