public class Department 
{   // Department class

    // Attributes
    private String DepartmentName;
    private Persons person;
    private int UserId;
    private String Password;

    public Department()
    {   // Constructor
        DepartmentName = "";
        person = new Persons();
        UserId = 743454;
        Password = "ammar123";
    }   // End of Constructor

    public void addUser(String dName, int userId, String password)
    {   //method to set department name
        DepartmentName = dName;
        UserId = userId;
        Password = password;
    }   //end of method

    public void addperson(Persons prsn)
    {   //method to add person
        person = prsn;
    }   //end of method

    public String getDepartmentName()
    {   //method to get department name
        return DepartmentName;
    }   //end of method

    public Persons getPerson()
    {   //method to get person id
        return person;
    }   //end of method

    public int getUserId()
    {   //method to get UserId
        return UserId;
    }   //end of method

    public String getPassword()
    {   //method to get password
        return Password;
    }   //end of method

}   // End of Department class
