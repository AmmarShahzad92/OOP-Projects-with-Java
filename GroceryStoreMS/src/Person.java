public abstract class Person implements OrderProcessing
{   // start of Person class

    // attributes
    private int id;
    private String name;
    private Address address;
    private boolean isStarStatus;

    public Person()
    {   // constructor
        id = 0;
        name = "";
        address = new Address();
    }   // end of constructor

    public void Person(int id, String name, Address address)
    {   // method to set the Persons
        this.id = id;
        this.name = name;
        this.address = address;
    }   // end of method

    public void setStarStatus(boolean isStarStatus)
    {   // method to set the star status
        this.isStarStatus = isStarStatus;
    }   // end of method setPersonStatus

    // abstract method to compute the order
    public abstract int computeOrder(Order[] orders, int count);

    public int getId()
    {   // method to get the id
        return id;
    }   // end of method

    public String getName()
    {   // method to get the name
        return name;
    }   // end of method

    public Address getAddress()
    {   // method to get address
        return address;
    }   // end of method

    public boolean isStarStatus()
    {   // method to check if the person is a star status
        return isStarStatus;
    }   // end of method isStarStatus
}   // end of class Person
