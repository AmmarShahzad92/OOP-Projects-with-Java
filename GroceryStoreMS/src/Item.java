public class Item 
{   // start of class Item

    // attributes
    private int id;
    private String name;
    private String category;
    private int costPrice;
    private int salesPrice;
    private int stock;       // Represents current available quantity
    private int quantitySold; // Tracks total sold quantity
    private int quantityInOrder; // Tracks quantity in the current order

    // Default constructor
    public Item() 
    {
        this.id = 0;
        this.name = " ";
        this.category = " ";
        this.costPrice = 0;
        this.salesPrice = 0;
        this.stock = 0;
        this.quantitySold = 0;
        this.quantityInOrder = 0;
    }

    // Constructor for full initialization
    public void Item(int id, String name, String category, int costPrice, int salesPrice, int stock) 
    {   // constructor overloaded
        this.id = id;
        this.name = name;
        this.category = category;
        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
        this.stock = stock;
        this.quantitySold = 0; // Initialize sold quantity to zero
        this.quantityInOrder = 0; // Initialize quantity in order to zero
    }   // end of overloaded constructor

    // Method to set the quantity of the item in a specific order
    public void setQuantityInOrder(int quantity) 
    {   // Method to set the quantity of the item in a specific order
        if (quantity <= stock) 
        {   // if check to verify if the quantity is less than or equal to the stock
            this.quantityInOrder = quantity; // Set the quantity sold for the order
        }   // end of if 
        else 
        {   // else block to handle the case when the quantity is more than the stock
            this.quantityInOrder = stock; // Set the quantity to the available stock
        }   // end of else
    }   // end of setQuantityInOrder method

    // Sell items (update stock and quantitySold)
    public boolean sellItem(int quantity) 
    {   // Method to sell the item
        if (quantity > stock) 
        {   // if check to verify if the quantity is more than the stock
            return false; // Not enough stock to sell
        }   // end of if


        stock -= quantity;
        quantitySold += quantity;
        return true;
    }   // end of sellItem method

    // Method to check if the stock is low (threshold is 5)
    public boolean isLowStock() 
    {   // Method to check if the stock is low
        return stock < 5; // Assuming 5 as the threshold for low stock
    }   // end of isLowStock method

    // Reduce stock by a specified quantity
    public void reduceStock(int qty) 
    {   // Method to reduce the stock by a specified quantity
        if (qty <= stock) 
        {   // if check to verify if the quantity is less than or equal to the stock
            stock -= qty;
        }   // end of if
    }   // end of reduceStock method

    // Getter for quantity in order
    public int getQuantityInOrder() 
    {   // Method to get the quantity in order
        return quantityInOrder;
    }   // end of getQuantityInOrder method

    // Getter for quantitySold
    public int getQuantitySold() 
    {   // Method to get the quantity sold
        return quantitySold;
    }   // end of getQuantitySold method

    // Getter for stock
    public int getStock() 
    {   // Method to get the stock
        return stock;
    }   // end of getStock method

    // Setters and getters for other attributes
    public int getId() 
    {   // Method to get the id
        return id;
    }   // end of getId method

    public String getName() 
    {   // Method to get the name
        return name;
    }   // end of getName method


    public String getCategory() 
    {   // Method to get the category
        return category;
    }   // end of getCategory method

    public int getCostPrice() 
    {   // Method to get the cost price
        return costPrice;
    }   // end of getCostPrice method

    public int getSalesPrice() 
    {   // Method to get the sales price
        return salesPrice;
    }   // end of getSalesPrice method

    public void setId(int id) 
    {   // Method to set Id
        this.id = id;
    }   // end of setId method

    public void setName(String name) 
    {   // Method to set the name
        this.name = name;
    }   // end of setName method

    public void setCategory(String category) 
    {   // Method to set the category
        this.category = category;
    }   // end of setCategory method
    
    public void setCostPrice(int costPrice) 
    {   // Method to set the cost price
        this.costPrice = costPrice;
    }   // end of setCostPrice method

    public void setSalesPrice(int salesPrice) 
    {   // Method to set the sales price
        this.salesPrice = salesPrice;
    }   // end of setSalesPrice method

    public void setStock(int stock) 
    {   // Method to set the stock
        this.stock = stock;
    }   // end of setStock method
}   // end of class Item
