public class Date 
{   // start of class Date

    // instance variables
    private int day;
    private int month;
    private int year;

    public Date()
    {   // start of constructor
        day = 1;
        month = 1;
        year = 1;
    }   // end of constructor

    public void setDate(int dd, int mm, int yyyy)
    {   //method to set date

        // check if the date is valid
        if (dd > 0 && dd <= 31) 
        { 
            day = dd;
        }
        // check if the month is valid
        if (mm > 0 && mm <= 12) 
        { 
            month = mm;
        }
        // check if the year is valid
        if (yyyy >= 2000) 
        { 
            year = yyyy;
        }

    }   // end of method setDate

    public int getDay()
    {   // method to get day
        return day;
    }   // end of method getDay

    public int getMonth()
    {   // method to get month
        return month;
    }   // end of method getMonth

    public int getYear()
    {   // method to get year
        return year;
    }   // end of method getYear
    public String toString()
    {   // method to return date as a string
        return day + "/" + month + "/" + year;
    }   // end of method toString
}   // end of class Date
