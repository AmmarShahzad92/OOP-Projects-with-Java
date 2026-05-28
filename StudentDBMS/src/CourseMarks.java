public class CourseMarks 
{   // CourseMarks class

    // attributes
    private int CourseId;
    private int StudentId;
    private int TeacherId;
    private int Marks;

    public CourseMarks()
    {   // constructor
        CourseId = 0;
        StudentId = 0;
        TeacherId = 0;
        Marks = 0;
    }   // end of constructor

    public void CourseMarks(int cid, int sid, int tid, int marks)
    {   // method to set the course marks
        CourseId = cid;
        StudentId = sid;
        TeacherId = tid;
        Marks = marks;
    }   // end of method

    public int getCourseId()
    {   // method to get the course id
        return CourseId;
    }   // end of method

    public int getStudentId()
    {   // method to get the student id
        return StudentId;
    }   // end of method

    public int getTeacherId()
    {   // method to get the teacher id
        return TeacherId;
    }   // end of method

    public int getMarks()
    {   // method to get the marks
        return Marks;
    }   // end of method
}   // end of class CourseMarks
