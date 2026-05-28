public interface OrderProcessing 
{   // Interface for order processing


    // Process an order and update necessary records
    public abstract void processOrder(Order order);

    // Compute and check if the person qualifies as a star status
    public abstract void computeStarStatus();

}   // end of OrderProcessing interface
