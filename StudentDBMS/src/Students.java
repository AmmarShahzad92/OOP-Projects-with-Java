public class Students extends Persons
{   // Students class

    // attributes
    private String Program;
    private int Semester;

    public Students()
    {   // constructor
        Program = "";
        Semester = 0;
    }   // end of constructor

    public void Students(String program, int semester)
    {   // method to set the Students
        Program = program;
        Semester = semester;
    }   // end of method

    public String getProgram()
    {   // method to get the program
        return Program;
    }   // end of method

    public int getSemester()
    {   // method to get the semester
        return Semester;
    }   // end of method
}   // end of class Students
