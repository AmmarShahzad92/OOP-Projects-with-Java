class CalcOperations
{
    // Array to store history of operations of Calculator
    private String[] history;
    private int counter;
    private double result;

    public CalcOperations()
    {
        history = new String[100];
        counter = 0;
    }

    // Addition function
    public double additon(double a, double b)
    {
        result = a + b;
        HistorySaver("Sum: " + a + " + " + b + " = " + result);
        return result;
    }

    // Subtraction function
    public double subtraction(double a, double b)
    {
        result = a - b;
        HistorySaver("Difference: " + a + " - " + b + " = " + result);
        return result;
    }

    // Multiplication function
    public double multiplication(double a, double b)
    {
        result = a * b;
        HistorySaver("Product: " + a + " * " + b + " = " + result);
        return result;
    }

    // Division function
    public double division(double a, double b) 
    {
        if (b == 0)
        {
            System.out.println("Number Cannot be divided by zero!");
        }
        result = a / b;
        HistorySaver("Quotient: " + a + " / " + b + " = " + result);
        return result;
    }

    // Save operations to history
    private void HistorySaver(String answer)
    {
        if (counter < history.length)
        {
            history[counter] = answer;
            counter++;
        }
        else
        {
            System.out.println("History is full. Cannot save new operations.");
        }
    }

    // View entire history
    public void HistoryViewer()
    {
        if (counter == 0)
        {
            System.out.println("No history available.");
        }
        else
        {
            System.out.println("Operations History:");
            for (int i = 0; i < counter; i++)
            {
                System.out.println((i + 1) + ". " + history[i]);
            }
        }
    }

    // Delete all history
    public void deleteAllHistory()
    {
        counter = 0;
        System.out.println("All history deleted.");
    }

    // Delete specific history by position
    public void deleteSpecificHistory(int position)
    {
        if (position >= 1 && position <= counter)
        {
            for (int i = position - 1; i < counter - 1; i++)
            {
                history[i] = history[i + 1];
            }
            history[counter - 1] = null; // Clear the last entry
            counter--;
            System.out.println("History at position " + position + " is deleted.");
        }
        else
        {
            System.out.println("Invalid position. Please try again.");
        }
    }
}