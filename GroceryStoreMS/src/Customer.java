public class Customer extends Person implements OrderProcessing 
{   // Customer class inherits from Person and implements OrderProcessing

    // Attributes
    private int accountNumber;
    private int balance;
    private int totalOrders; // Tracks the number of orders placed

    public Customer()
    {   // Default constructor
        accountNumber = 0;
        balance = 0;
        totalOrders = 0;
    }   // end of default constructor

    public void Customer(int accountNumber, int balance, int totalOrders) 
    {   // Constructor overloaded
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.totalOrders = totalOrders;
    }   // end of overloaded constructor

    // Implementation of computeOrder inherited from Person
    @Override
    public int computeOrder(Order[] orders, int discount) 
    {   // Method to compute the total price of the orders
        int totalPrice = 0;
        for (Order order : orders) 
        {   // for loop to iterate through the orders
            totalPrice += order.getTotalPrice();
        }   // end of for loop
        totalPrice -= ((discount * totalPrice)/100); // Apply discount
        return totalPrice;
    }   // end of computeOrder

    @Override
    public void processOrder(Order order) 
    {   // Method to process the order
        if (balance >= order.getTotalPrice()) 
        {   // if check to verify if the balance is enough to place the order
            balance -= order.getTotalPrice(); // Deduct the order price from the balance
            totalOrders++;
        }   // end of if
    }   // end of processOrder method

    @Override
    public void computeStarStatus() 
    {   // Method to compute the star status of the customer
        if (totalOrders >= 5 && balance >= 10000) 
        {   // if check to verify if the customer is eligible for star status
            setStarStatus(true);
        }   // end of if
    }   // end of computeStarStatus method

    // Additional methods if needed
    public void setTotalOrders(int totalOrders) 
    {   // method to set the total number of orders placed
        this.totalOrders  += totalOrders;
    }   // end of setTotalOrders method
    public int getTotalOrders() 
    {   // method to get the total number of orders placed
        return totalOrders;
    }   // end of getTotalOrders method

    public int getAccountNumber() 
    {   // method to get the account number of the customer
        return accountNumber;
    }   // end of getAccountNumber method

    public int getBalance() 
    {   // method to get the balance of the customer
        return balance;
    }   // end of getBalance method
}   // end of Customer class
