import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static int populateMethod (Item[] items, Employee[] employees, Customer[] customers)
    {
        Random rand = new Random();
        int count = 0;
    
        Address address = new Address();
        Date date = new Date();
    
        for (int i = 0; i < 25; i++) 
        {
            items[i] = new Item();
            items[i].Item(i+1, ("Item #" + (i+1)), ("Category #" + (i+1)), (1000*(i+1)), ((1000*(i+1))+((1000*(i+1))/2)), rand.nextInt(51));
        }
            
        for (int i = 0; i < 5; i++)
        {
            address.Address(i+1, i+1, "City" + (i+1));
            date.setDate(i+1, i+1, 2001 + i);
    
            employees[i] = new Employee();
            employees[i].Person(i+1, "Employee #" + (i+1), address);
            employees[i].Employee((10000*(i+1)), ((1000*(i+1))+((1000*(i+1))/2)));
                
    
            customers[i] = new Customer();
            customers[i].Person(i+1, "Employee #" + (i+1), address);
            customers[i].Customer((i+1), 1000*(i+1), 1*(i+1));
    
            count++;    
        }
    
        return count;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    
        Address address = new Address();
        int hno = 0;
        int stno = 0;
        String city = "";
    
        Date date = new Date();
        int dd = 0;
        int mm = 0;
        int yyyy = 0;
    
        Item[] items = new Item[100];
        Item item = new Item();
        int itemId = 0;
        String itemName = "";
        String category = "";
        int costPrice = 0;
        int salesPrice = 0;
        int stock = 0;
        int quantitySold = 0;
        int quantityInOrder = 0;
        boolean isLowStock = false;
            
        int id = 0;
        String name = "";
        boolean isStarStatus = false;
    
        Employee[] employees = new Employee[50];
        Employee employee = new Employee();
        int salary = 0;
        int totalSales;
    
        Customer[] customers = new Customer[50];
        Customer customer = new Customer();
        int accountNumber = 0;
        int balance = 0;
        int totalOrders = 0;
        int customerOrderCount = 0;
    
        Order[] orders = new Order[100];
        int ocount = 0;
        Order order = new Order();
        int orderID = 0;
        int employeeID = 0;
        int customerID = 0;
        int counter = 0;
        int orderSize = 10;
        Item[] orderItems = new Item[orderSize];
        Item orderItem = new Item();
        int orderItemsCount = 0;
        int orderItemsCounter = 0;
    
        int count = populateMethod(items, employees, customers);
        int icount = count;
        int ecount = count;
        int ccount = count;
        

        int mainchoice = 1, option1 = 1, option2 = 1, option3 = 1, choice = 0;
        while (true) 
        { 
            System.out.println("""
                      Welcome to Grocery Store Management System
                    **********************************************
                    \nMain Menu
                    \t 1. Manage Items
                    \t 2. Manage Employees
                    \t 3. Manage Customers
                    \t 4. Manage Orders
                    \t 0. Exit program
                    \nEnter your option: 
                    """);
                    mainchoice = in.nextInt();

                    switch (mainchoice)
                    {
                        case 1:

                            while (option1 != 0)
                            {
                                System.out.println("""
                                Welcome to Item Management System
                                
                                \t 1. Add Items
                                \t 2. Edit Items
                                \t 3. Delete Items
                                \t 4. View Items
                                \t 0. Exit
                                \nEnter your choice: 
                                """);
                                option1 = in.nextInt();

                                switch (option1) 
                                {
                                    case 1: // Add Items
                                        System.out.println("Enter Item ID: ");
                                        itemId = in.nextInt();
                                        System.out.println("Enter Item Name: ");
                                        itemName = in.next();
                                        System.out.println("Enter Category: ");
                                        category = in.next();
                                        System.out.println("Enter Cost Price: ");
                                        costPrice = in.nextInt();
                                        System.out.println("Enter Sales Price: ");
                                        salesPrice = in.nextInt();
                                        System.out.println("Enter Stock: ");
                                        stock = in.nextInt();
                                        item.Item(itemId, itemName, category, costPrice, salesPrice, stock);
                                        items[icount++] = item;
                                        System.out.println("Item added successfully..!");
                                        break;

                                    case 2: // Edit Items
                                        System.out.println("Enter Item ID you want to edit: ");
                                        itemId = in.nextInt();
                                        for (Item currentItem : items)
                                        {   
                                            if (currentItem.getId() == itemId)
                                            {
                                                System.out.println("Enter Item Name: ");
                                                itemName = in.next();
                                                System.out.println("Enter Category: ");
                                                category = in.next();
                                                System.out.println("Enter Cost Price: ");
                                                costPrice = in.nextInt();
                                                System.out.println("Enter Sales Price: ");
                                                salesPrice = in.nextInt();
                                                System.out.println("Enter Stock: ");
                                                stock = in.nextInt();
                                                currentItem.Item(itemId, itemName, category, costPrice, salesPrice, stock);
                                                currentItem.Item(itemId, itemName, category, costPrice, salesPrice, stock);
                                                System.out.println("Item updated successfully..!");
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Item not found..!");
                                            }
                                        }
                                        break;

                                    case 3: // Delete Items
                                        System.out.println("Enter Item ID you want to delete: ");
                                        itemId = in.nextInt();
                                        for (Item currentItem : items)
                                        {
                                            if (currentItem.getId() == itemId)
                                            {
                                                currentItem = null;
                                                System.out.println("Item deleted successfully..!");
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Item not found..!");
                                            }
                                        }
                                        break;

                                    case 4: // View Items
                                        System.out.println("""
                                                1. View All Items
                                                2. View Specific Item
                                                0. Exit
                                                \nEnter your choice: 
                                                """);
                                        choice = in.nextInt();
                                        while (choice != 0)
                                        {
                                            switch (choice)
                                            {
                                                case 1:
                                                    for (Item currentItem : items)
                                                    {
                                                        System.out.println("Item ID: " + currentItem.getId());
                                                        System.out.println("Item Name: " + currentItem.getName());
                                                        System.out.println("Category: " + currentItem.getCategory());
                                                        System.out.println("Cost Price: " + currentItem.getCostPrice());
                                                        System.out.println("Sales Price: " + currentItem.getSalesPrice());
                                                        System.out.println("Stock: " + currentItem.getStock());
                                                        System.out.println("Quantity Sold: " + currentItem.getQuantitySold());
                                                        System.out.println("isLowStock: " + currentItem.isLowStock());
                                                    }
                                                    break;

                                                case 2:
                                                    System.out.println("Enter Item ID you want to view: ");
                                                    itemId = in.nextInt();
                                                    for (Item currentItem : items)
                                                    {
                                                        if (currentItem.getId() == itemId)
                                                        {
                                                            System.out.println("Item ID: " + currentItem.getId());
                                                            System.out.println("Item Name: " + currentItem.getName());
                                                            System.out.println("Category: " + currentItem.getCategory());
                                                            System.out.println("Cost Price: " + currentItem.getCostPrice());
                                                            System.out.println("Sales Price: " + currentItem.getSalesPrice());
                                                            System.out.println("Stock: " + currentItem.getStock());
                                                            System.out.println("Quantity Sold: " + currentItem.getQuantitySold());
                                                            System.out.println("isLowStock: " + currentItem.isLowStock());
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Item not found..!");
                                                        }
                                                    }
                                                    break;

                                                case 0: // Exit
                                                    break;

                                                default:
                                                    System.out.println("Invalid option. Please try Again..!");
                                            }
                                        }
                                        break;

                                    case 0: // Exit
                                        break;

                                    default:
                                        System.out.println("Invalid option. Please try Again..!");
                                }
                            }
                            break;

                        case 2:
                            
                            while (option1 != 0)
                            {
                                System.out.println("""
                                Welcome to Employee Management System
                                
                                \t 1. Add Employee
                                \t 2. Edit Employee
                                \t 3. Delete Employee
                                \t 4. View Employee
                                \t 0. Exit
                                \nEnter your choice: 
                                """);
                                option1 = in.nextInt();

                                switch (option1) 
                                {
                                    case 1: // Add Employee
                                        System.out.println("Enter Employee ID: ");
                                        id = in.nextInt();
                                        System.out.println("Enter Employee Name: ");
                                        name = in.next();
                                        System.out.println("Enter House Number: ");
                                        hno = in.nextInt();
                                        System.out.println("Enter Street Number: ");
                                        stno = in.nextInt();
                                        System.out.println("Enter City: ");
                                        city = in.next();
                                        address.Address(hno, stno, city);
                                        System.out.println("Enter Salary: ");
                                        salary = in.nextInt();
                                        employee.Person(id, name, address);
                                        employee.Employee(salary, 0);
                                        employees[ecount++] = employee;
                                        System.out.println("Employee added successfully..!");
                                        break;

                                    case 2: // Edit Employee
                                        System.out.println("Enter Employee ID you want to edit: ");
                                        id = in.nextInt();
                                        for (Employee currentEmployee : employees)
                                        {
                                            if (currentEmployee.getId() == id)
                                            {
                                                System.out.println("Enter Employee Name: ");
                                                name = in.next();
                                                System.out.println("Enter House Number: ");
                                                hno = in.nextInt();
                                                System.out.println("Enter Street Number: ");
                                                stno = in.nextInt();
                                                System.out.println("Enter City: ");
                                                city = in.next();
                                                address.Address(hno, stno, city);
                                                System.out.println("Enter Salary: ");
                                                salary = in.nextInt();
                                                currentEmployee.Person(id, name, address);
                                                currentEmployee.Employee(salary, 0);
                                                System.out.println("Employee updated successfully..!");
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Employee not found..!");
                                            }
                                        }
                                        break;

                                    case 3: // Delete Employee
                                        System.out.println("Enter Employee ID you want to delete: ");
                                        id = in.nextInt();
                                        for (Employee currentEmployee : employees)
                                        {
                                            if (currentEmployee.getId() == id)
                                            {
                                                currentEmployee = null;
                                                System.out.println("Employee deleted successfully..!");
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Employee not found..!");
                                            }
                                        }
                                        break;

                                    case 4: // View Employee
                                        System.out.println("""
                                                1. View All Employees
                                                2. View Specific Employee
                                                0. Exit
                                                \nEnter your choice: 
                                                """);
                                        choice = in.nextInt();
                                        while (choice != 0)
                                        {
                                            switch (choice)
                                            {
                                                case 1:
                                                    for (Employee currentEmployee : employees)
                                                    {
                                                        System.out.println("Employee ID: " + currentEmployee.getId());
                                                        System.out.println("Employee Name: " + currentEmployee.getName());
                                                        System.out.println("Address: " + currentEmployee.getAddress());
                                                        System.out.println("Salary: " + currentEmployee.getSalary());
                                                        System.out.println("Total Sales: " + currentEmployee.getTotalSales());
                                                    }
                                                    break;

                                                case 2:
                                                    System.out.println("Enter Employee ID you want to view: ");
                                                    id = in.nextInt();
                                                    for (Employee currentEmployee : employees)
                                                    {
                                                        if (currentEmployee.getId() == id)
                                                        {
                                                            System.out.println("Employee ID: " + currentEmployee.getId());
                                                            System.out.println("Employee Name: " + currentEmployee.getName());
                                                            System.out.println("Address: " + currentEmployee.getAddress());
                                                            System.out.println("Salary: " + currentEmployee.getSalary());
                                                            System.out.println("Total Sales: " + currentEmployee.getTotalSales());
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Employee not found..!");
                                                        }
                                                    }
                                                    break;

                                                case 0:
                                                    break;

                                                default:
                                                    System.out.println("Invalid option. Please try Again..!");
                                            }
                                        }
                                        break;

                                    case 0: // Exit
                                        break;

                                    default:
                                        System.out.println("Invalid option. Please try Again..!");
                                }
                            }
                            break;
                        case 3:
                            
                            while (option1 != 0)
                            {
                                System.out.println("""
                                Welcome to Customer Management System
                            
                                \t 1. Add Customer
                                \t 2. Edit Customer
                                \t 3. Delete Customer
                                \t 4. View Customer
                                \t 0. Exit
                                \nEnter your choice: 
                                """);
                                option1 = in.nextInt();

                                switch (option1) 
                                {
                                    case 1: // Add Customer
                                        System.out.println("Enter Customer ID: ");
                                        id = in.nextInt();
                                        System.out.println("Enter Customer Name: ");
                                        name = in.next();
                                        System.out.println("Enter House Number: ");
                                        hno = in.nextInt();
                                        System.out.println("Enter Street Number: ");
                                        stno = in.nextInt();
                                        System.out.println("Enter City: ");
                                        city = in.next();
                                        address.Address(hno, stno, city);
                                        System.out.println("Enter Account Number: ");
                                        accountNumber = in.nextInt();
                                        customer.Person(id, name, address);
                                        customer.Customer(accountNumber, 0, 0);
                                        customers[ccount++] = customer;
                                        System.out.println("Customer added successfully..!");
                                        break;

                                    case 2: // Edit Customer
                                        System.out.println("Enter Customer ID you want to edit: ");
                                        id = in.nextInt();
                                        for (Customer currentCustomer : customers)
                                        {
                                            if (currentCustomer.getId() == id)
                                            {
                                                System.out.println("Enter Customer Name: ");
                                                name = in.next();
                                                System.out.println("Enter House Number: ");
                                                hno = in.nextInt();
                                                System.out.println("Enter Street Number: ");
                                                stno = in.nextInt();
                                                System.out.println("Enter City: ");
                                                city = in.next();
                                                address.Address(hno, stno, city);
                                                System.out.println("Enter Account Number: ");
                                                accountNumber = in.nextInt();
                                                currentCustomer.Person(id, name, address);
                                                currentCustomer.Customer(accountNumber, 0, 0);
                                                System.out.println("Customer updated successfully..!");
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Customer not found..!");
                                            }
                                        }
                                        break;

                                    case 3: // Delete Customer
                                        System.out.println("Enter Customer ID you want to delete: ");
                                        id = in.nextInt();
                                        for (Customer currentCustomer : customers)
                                        {
                                            if (currentCustomer.getId() == id)
                                            {
                                                currentCustomer = null;
                                                System.out.println("Customer deleted successfully..!");
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Customer not found..!");
                                            }
                                        }
                                        break;

                                    case 4: // View Customer
                                        System.out.println("""
                                                1. View All Customers
                                                2. View Specific Customer
                                                0. Exit
                                                \nEnter your choice: 
                                                """);
                                        choice = in.nextInt();
                                        while (choice != 0)
                                        {
                                            switch (choice)
                                            {
                                                case 1: // View All Customers
                                                    for (Customer currentCustomer : customers)
                                                    {
                                                        System.out.println("Customer ID: " + currentCustomer.getId());
                                                        System.out.println("Customer Name: " + currentCustomer.getName());
                                                        System.out.println("Address: " + currentCustomer.getAddress());
                                                        System.out.println("Account Number: " + currentCustomer.getAccountNumber());
                                                        System.out.println("Balance: " + currentCustomer.getBalance());
                                                        System.out.println("Total Orders: " + currentCustomer.getTotalOrders());
                                                    }
                                                    break;

                                                case 2: // View Specific Customer
                                                    System.out.println("Enter Customer ID you want to view: ");
                                                    id = in.nextInt();
                                                    for (Customer currentCustomer : customers)
                                                    {
                                                        if (currentCustomer.getId() == id)
                                                        {
                                                            System.out.println("Customer ID: " + currentCustomer.getId());
                                                            System.out.println("Customer Name: " + currentCustomer.getName());
                                                            System.out.println("Address: " + currentCustomer.getAddress());
                                                            System.out.println("Account Number: " + currentCustomer.getAccountNumber());
                                                            System.out.println("Balance: " + currentCustomer.getBalance());
                                                            System.out.println("Total Orders: " + currentCustomer.getTotalOrders());
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Customer not found..!");
                                                        }
                                                    }
                                                    break;

                                                case 0: // Exit
                                                    break;

                                                default:
                                                    System.out.println("Invalid option. Please try Again..!");
                                            }
                                        }
                                        break;

                                    case 0: // Exit
                                        break;
                                    default:
                                        System.out.println("Invalid option. Please try Again..!");
                                }
                            }
                            break;

                        case 4:
                            while (option1 != 0)
                            {
                                System.out.println("""
                                Welcome to Order Management System
                                
                                \t 1. Add Order
                                \t 2. Edit OrdercustomerOrderCount
                                \t 3. Delete Order
                                \t 4. View Order
                                \t 0. Exit
                                \nEnter your choice: 
                                """);
                                option1 = in.nextInt();

                                switch (option1) 
                                { 
                                    
                                    case 1: // Add Order
                                        System.out.println("Enter Order ID: ");
                                        orderID = in.nextInt();
                                        System.out.println("Enter Employee ID: ");
                                        employeeID = in.nextInt();
                                        for (Employee currentEmployee : employees)
                                        {
                                            if (currentEmployee.getId() == employeeID)
                                            {
                                                System.out.println("Enter Customer ID: ");
                                                customerID = in.nextInt();
                                                for (Customer currentCustomer : customers)
                                                {
                                                    if (currentCustomer.getId() == customerID)
                                                    {
                                                        currentCustomer.setTotalOrders(customerOrderCount++);
                                                        currentCustomer.computeStarStatus();
                                                        System.out.println("Enter Date: ");
                                                        System.out.println("Enter Day: ");
                                                        dd = in.nextInt();
                                                        System.out.println("Enter Month: ");
                                                        mm = in.nextInt();
                                                        System.out.println("Enter Year: ");
                                                        yyyy = in.nextInt();
                                                        date.setDate(dd, mm, yyyy);
                                                        System.out.println("Enter Number of Items: ");
                                                        orderItemsCount = in.nextInt();
                                                        for (int i = 0; i < orderItemsCount; i++)
                                                        {
                                                            System.out.println("Enter Item ID: ");
                                                            itemId = in.nextInt();
                                                            for (Item currentItem : items)
                                                            {
                                                                if (currentItem.getId() == itemId)
                                                                {
                                                                    System.out.println("Enter Quantity: ");
                                                                    quantityInOrder = in.nextInt();
                                                                    if (currentItem.sellItem(quantityInOrder) == false)
                                                                    {
                                                                        System.out.println("Not enough stock..!");
                                                                        if (currentItem.isLowStock() == true)
                                                                        {
                                                                            System.out.println("Item is low in stock..!");
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        orderItem.Item(currentItem.getId(), currentItem.getName(), currentItem.getCategory(), currentItem.getCostPrice(), currentItem.getSalesPrice(), currentItem.getStock());
                                                                        orderItem.setQuantityInOrder(quantityInOrder);
                                                                        orderItems[i] = orderItem;
                                                                        orderItemsCounter++;
                                                                    }
                                                                    
                                                                }
                                                                else
                                                                {
                                                                    System.out.println("Item not found..!");
                                                                }
                                                            }      
                                                        }
                                                        order.setItemCounter(orderItemsCounter);
                                                        order.Order(orderID, employeeID, customerID, date, orderItems);
                                                        orders[ocount++] = order;
                                                        orders[ocount].calculateTotalOrderPrice(orderItemsCounter);
                                                        currentEmployee.processOrder(orders[ocount]);
                                                        currentEmployee.computeStarStatus();
                                                        System.out.println("Order added successfully..!");
                                                        break;
                                                    }
                                                    else
                                                    {
                                                        System.out.println("Customer not found..! Add Customer first..!");
                                                    }
                                                }
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Employee not found..! Add Employee first..!");
                                            }
                                        }
                                        break;

                                    case 2: // Edit Order
                                        System.out.println("Enter Order ID you want to edit: ");
                                        orderID = in.nextInt();
                                        for (Order currentOrder : orders)
                                        {
                                            if (currentOrder.getOrderID() == orderID)
                                            {
                                                System.out.println("Enter Employee ID: ");
                                                employeeID = in.nextInt();
                                                System.out.println("Enter Customer ID: ");
                                                customerID = in.nextInt();
                                                System.out.println("Enter Date: ");
                                                System.out.println("Enter Day: ");
                                                dd = in.nextInt();
                                                System.out.println("Enter Month: ");
                                                mm = in.nextInt();
                                                System.out.println("Enter Year: ");
                                                yyyy = in.nextInt();
                                                date.setDate(dd, mm, yyyy);
                                                System.out.println("Enter Number of Items: ");
                                                orderItemsCount = in.nextInt();
                                                for (int i = 0; i < orderItemsCount; i++)
                                                {
                                                    System.out.println("Enter Item ID: ");
                                                    itemId = in.nextInt();
                                                    for (Item currentItem : items)
                                                    {
                                                        if (currentItem.getId() == itemId)
                                                        {
                                                            System.out.println("Enter Quantity: ");
                                                            quantityInOrder = in.nextInt();
                                                            orderItem.Item(currentItem.getId(), currentItem.getName(), currentItem.getCategory(), currentItem.getCostPrice(), currentItem.getSalesPrice(), currentItem.getStock());
                                                            orderItem.setQuantityInOrder(quantityInOrder);
                                                            orderItems[i] = orderItem;
                                                            orderItemsCounter++;
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Item not found..!");
                                                        }
                                                    }
                                                }
                                                currentOrder.Order(orderID, employeeID, customerID, date, orderItems);
                                                System.out.println("Order updated successfully..!");
                                            }
                                            else 
                                            {
                                                System.out.println("Order not found..!");
                                            }
                                        }
                                        break;

                                    case 3: // Delete Order
                                        System.out.println("Enter Order ID you want to delete: ");
                                        orderID = in.nextInt();
                                        for (Order currentOrder : orders)
                                        {
                                            if (currentOrder.getOrderID() == orderID)
                                            {
                                                currentOrder = null;
                                                System.out.println("Order deleted successfully..!");
                                                break;
                                            }
                                            else
                                            {
                                                System.out.println("Order not found..!");
                                            }
                                        }
                                        break;

                                    case 4: // View Order
                                        System.out.println("""
                                                1. View All Orders
                                                2. View Specific Order
                                                0. Exit
                                                \nEnter your choice: 
                                                """);
                                        choice = in.nextInt();
                                        while (choice != 0)
                                        {
                                            switch (choice)
                                            {
                                                case 1: // View All Orders
                                                    for (Order currentOrder : orders)
                                                    {   
                                                        System.out.println("Order ID: " + currentOrder.getOrderID());
                                                        System.out.println("Employee ID: " + currentOrder.getEmployeeID());
                                                        System.out.println("Customer ID: " + currentOrder.getCustomerID());
                                                        System.out.println("Order Date: " + currentOrder.getOrderDate());
                                                        System.out.println("Total Order Price: " + currentOrder.calculateTotalOrderPrice(currentOrder.getItemCounter()));
                                                        System.out.println("Items in Order: ");
                                                        for (Item currentItem : currentOrder.getOrderItems())
                                                        {
                                                            System.out.println("Item ID: " + currentItem.getId());
                                                            System.out.println("Item Name: " + currentItem.getName());
                                                            System.out.println("Category: " + currentItem.getCategory());
                                                            System.out.println("Cost Price: " + currentItem.getCostPrice());
                                                            System.out.println("Sales Price: " + currentItem.getSalesPrice());
                                                            System.out.println("Stock: " + currentItem.getStock());
                                                            System.out.println("Quantity Sold: " + currentItem.getQuantitySold());
                                                            System.out.println("isLowStock: " + currentItem.isLowStock());
                                                        }
                                                    }
                                                    break;

                                                case 2: // View Specific Order
                                                    System.out.println("Enter Order ID you want to view: ");
                                                    orderID = in.nextInt();
                                                    for (Order currentOrder : orders)
                                                    {
                                                        if (currentOrder.getOrderID() == orderID)
                                                        {
                                                            System.out.println("Order ID: " + currentOrder.getOrderID());
                                                            System.out.println("Employee ID: " + currentOrder.getEmployeeID());
                                                            System.out.println("Customer ID: " + currentOrder.getCustomerID());
                                                            System.out.println("Order Date: " + currentOrder.getOrderDate());
                                                            System.out.println("Total Order Price: " + currentOrder.calculateTotalOrderPrice(currentOrder.getItemCounter()));
                                                            System.out.println("Items in Order: ");
                                                            for (Item currentItem : currentOrder.getOrderItems())
                                                            {
                                                                System.out.println("Item ID: " + currentItem.getId());
                                                                System.out.println("Item Name: " + currentItem.getName());
                                                                System.out.println("Category: " + currentItem.getCategory());
                                                                System.out.println("Cost Price: " + currentItem.getCostPrice());
                                                                System.out.println("Sales Price: " + currentItem.getSalesPrice());
                                                                System.out.println("Stock: " + currentItem.getStock());
                                                                System.out.println("Quantity Sold: " + currentItem.getQuantitySold());
                                                                System.out.println("isLowStock: " + currentItem.isLowStock());
                                                            }
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Order not found..!");
                                                        }
                                                    }
                                                    break;
                                                case 0: // exit
                                                    break;                                        
                                    
                                    default:
                                        System.out.println("Invalid option. Please try Again..!");
                                }
                            }
                            break;
                        case 0: // Exit
                            System.out.println("Thank you for using Grocery Store Management System..!");
                            break;
                        default:
                            System.out.println("Invalid option. Please try Again..!");
                    }
                }
            }
        }
    }
}