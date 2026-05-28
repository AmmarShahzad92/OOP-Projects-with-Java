public class Employee extends Person implements OrderProcessing 
{   // Employee class inherits from Person and implements OrderProcessing

    // Attributes
    private int salary;
    private int totalSales; // Tracks total sales value processed

    // Constructor
    public Employee()
    {
        salary = 0;
        totalSales = 0;
    }

    public void Employee(int salary, int totalSales) 
    {   // Constructor overloaded
        this.salary = salary;
        this.totalSales = totalSales;
    }   // end of overloaded constructor

    // Override processOrder method
    @Override
    public void processOrder(Order order) 
    {   // Method to process the order
        totalSales += order.getTotalPrice(); // Add the total price of the order to the total sales
    }   // end of processOrder method

    // Override computeStarStatus method
    @Override
    public void computeStarStatus() 
    {   // Method to compute whether the employee is eligibe for stat status
        if (totalSales >= 1000000) 
        {   // if check to verify if the employee is eligible for star status
            setStarStatus(true);
        }   // end of if
    }   // end of computeStarStatus method

    // Override computeOrder method from Person class
    @Override
    public int computeOrder(Order[] orders, int discount) 
    {   // Method to compute the total price of the orders
        int totalPrice = 0;
        for (Order order : orders) 
        {   // for loop to iterate through the orders
            totalPrice += order.getTotalPrice();
        }   // end of for

        totalPrice -= discount; // Apply discount
        return totalPrice; // Return the computed price instead of printing
    }   // end of computeOrder method

    // Additional methods
    public int getTotalSales() 
    {   // Method to get the total sales value processed
        return totalSales;
    }   // end of getTotalSales method

    public int getSalary() 
    {   // Method to get the salary of the employee
        return salary;
    }   // end of getSalary method
}   // end of Employee class
