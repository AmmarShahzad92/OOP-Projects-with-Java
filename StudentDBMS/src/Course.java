public class Course 
{   // Course class

    // attributes
    private int CourseCode;
    private String CourseName;
    private int CreditHours;

    public Course()
    {   // constructor
        CourseCode = 0;
        CourseName = "";
        CreditHours = 0;
    }   // end of constructor

    public void Course(int courseCode, String courseName, int creditHours)
    {   // method to set the course
        CourseCode = courseCode;
        CourseName = courseName;
        CreditHours = creditHours;
    }   // end of method
    
    public int getCourseCode()
    {   // method to get the course code
        return CourseCode;
    }   // end of method

    public String getCourseName()
    {   // method to get the course name
        return CourseName;
    }   // end of method

    public int getCreditHours()
    {   // method to get the credit hours
        return CreditHours;
    }   // end of method
}   // end of class Course
