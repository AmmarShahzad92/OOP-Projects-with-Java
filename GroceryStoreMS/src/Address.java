public class Address 
{   // start of Address class

    // Attributes
    private int houseNumber;
    private int streetNumber;
    private String city;

    public Address()
    {   // Constructor
        houseNumber = 0;
        streetNumber = 0;
        city = "";
    }   // End of Constructor

    public void Address(int hno, int streetNo, String city)
    {   // Method to set the address
        houseNumber = hno;
        streetNumber = streetNo;
        this.city = city;
    }   // End of Method

    public int getHouseNumber()
    {   // Method to get the house number
        return houseNumber;
    }   // End of Method

    public int getStreetNumber()
    {   // Method to get the street number
        return streetNumber;
    }   // End of Method

    public String getCity()
    {   // Method to get the city
        return city;
    }   // End of Method

    public String toString()
    {   // Method to return the address
        return "House No. " + houseNumber + "\nStreet No. " + streetNumber + "\nCity: " + city;
    }   // End of Method

}   // End of Address class
