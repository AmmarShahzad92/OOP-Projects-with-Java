public class Order 
{   // Class to represent an order

    // Attributes
    private int orderID;
    private int employeeID; // Employee ID managing the order
    private int customerID; // Customer ID who placed the order
    private int counter;    // Counter for the number of items in the order
    private Date date;      // Date of the order
    private Item[] items;   // Array to store items in the order
    private double totalPrice; // Total price of the order

    // Default constructor
    public Order() 
    {   // Default constructor
        orderID = 0;
        employeeID = 0;
        customerID = 0;
        counter = 0;
        date = new Date();
        items = new Item[50]; // Initializes an array with a capacity of 50 items
        totalPrice = 0;
    }   // end of default constructor

    // Parameterized constructor for initializing with Order ID, Employee ID, and Customer ID
    public void Order(int ordID, int empId, int custId, Date date, Item[] items) 
    {   // Constructor overloaded
        this.orderID = ordID;
        this.employeeID = empId;
        this.customerID = custId;
        this.counter = 0;
        this.date = date;
        this.items = items;
    }   // end of overloaded constructor

    // Method to add an item to the order
    public boolean addItem(Item item, int quantity) 
    {   // Method to add an item to the order
        if (item != null && counter < items.length) 
        {   // if check to verify if the item is not null and the array has space
            item.setQuantityInOrder(quantity); // Set the quantity of the item in the order
            items[counter++] = item; // Add the item to the array and increment the counter
            return true; // Item successfully added
        }   // end of if
        return false; // Unable to add the item
    }   // end of addItem method

    // Getter for Employee ID
    public int getEmployeeID() 
    {   // Getter for Employee ID
        return employeeID;
    }   // end of getEmployeeID method

    // Getter for Customer ID
    public int getCustomerID() 
    {   // Getter for Customer ID
        return customerID;
    }   // end of getCustomerID method

    // Getter for items in the order
    public Item[] getOrderItems() 
    {   // Getter for items in the order
        Item[] actualItems = new Item[counter]; // Return trimmed array to avoid nulls
        System.arraycopy(items, 0, actualItems, 0, counter);
        return actualItems;
    }   // end of getOrderItems method

    // Setter for Item Counter
    public void setItemCounter(int counter) 
    {   // Setter for the number of items in the order
        this.counter = counter;
    }   // end of setItemCounter method

    // Getter for the number of items in the order
    public int getItemCounter() 
    {   // Getter for the number of items in the order
        return counter;
    }   // end of getItemCounter method

    // Method to calculate the total price of all items in the order
    public double calculateTotalOrderPrice(int counter) 
    {   // Method to calculate the total price of all items in the order
        double totalPrice = 0;
        for (int i = 0; i < counter; i++) 
        {   // for loop to iterate through the items in the order
            totalPrice += items[i].getSalesPrice() * items[i].getQuantityInOrder();
        }   // end of for
        return totalPrice;
    }   // end of calculateTotalOrderPrice method

    // Getter for order date
    public Date getOrderDate() 
    {   // Getter for order date
        return date;
    }   // end of getOrderDate method

    // Getter for order ID
    public int getOrderID() 
    {   // Getter for order ID
        return orderID;
    }   // end of getOrderID method

    // Getter for total price of the order
    public double getTotalPrice()
    {
        return totalPrice;
    }
}   // end of Order class
