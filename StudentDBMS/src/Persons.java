public class Persons 
{   // Persons class

    // attributes
    private int Id;
    private String Name;
    private Address Address;

    public Persons()
    {   // constructor
        Id = 0;
        Name = "";
        Address = new Address();
    }   // end of constructor

    public void Persons(int Id, String Name, Address Address)
    {   // method to set the Persons
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
    }   // end of method

    public int getId()
    {   // method to get the id
        return Id;
    }   // end of method

    public String getName()
    {   // method to get the name
        return Name;
    }   // end of method

    public Address getAddress()
    {   // method to get address
        return Address;
    }   // end of method
}   // end of class Persons
