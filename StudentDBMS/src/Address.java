public class Address 
{   // Address class

    // Attributes
    private int HouseNumber;
    private int StreetNumber;
    private String City;

    public Address()
    {   // Constructor
        HouseNumber = 0;
        StreetNumber = 0;
        City = "";
    }   // End of Constructor

    public void Address(int Hno, int streetNo, String city)
    {   // Method to set the address
        HouseNumber = Hno;
        StreetNumber = streetNo;
        City = city;
    }   // End of Method

    public int getHouseNumber()
    {   // Method to get the house number
        return HouseNumber;
    }   // End of Method

    public int getStreetNumber()
    {   // Method to get the street number
        return StreetNumber;
    }   // End of Method

    public String getCity()
    {   // Method to get the city
        return City;
    }   // End of Method
}   // End of Address class
