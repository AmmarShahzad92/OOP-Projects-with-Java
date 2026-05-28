public class teacherMethods extends personMethods
{
    private int salary;
    private String[] subject;
    private int counter;

    public teacherMethods()
    {
        salary = 0;
        subject = new String[5];
    }

    public void addTeacherDetails(String sub, int sal)
    {
        subject[counter] = sub;
        salary = sal;
        counter++;
    }
}
