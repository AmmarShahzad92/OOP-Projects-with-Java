public class studentMethods extends personMethods
{//start of class studentMethods

    //declaration of variables
    private String[] program;
    private String[] batch;
    private double[] gpa;
    private int counter;

    //constructor to initialize studentMethods class
    public studentMethods()
    {//start of studentMethods() constructor
        program = new String[5];
        batch = new String[5];
        gpa = new double[5];
        counter = 0;
    }//end of studentMethods() constructor

    public void addStudentDetails(String prog, String bat, double gpa)
    {//start of addStudentDetails() method
        program[counter] = prog;
        batch[counter] = bat;
        this.gpa[counter] = gpa;
        counter++;
    }//end of addStudentDetails() method
}//end of class studentMethods
