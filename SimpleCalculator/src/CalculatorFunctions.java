public class CalculatorFunctions
{
    private final int arraySize;
    private int[] myArray;
    private int counter;
    public CalculatorFunctions()
    {
        arraySize = 10;
        myArray = new int[arraySize];
        counter = 0;
    }

    public int add(int a, int b)
    {
        return a + b;
    }
    public int subtract(int a, int b)
    {
        return a - b;
    }
    public int multiply(int a, int b)
    {
        return a * b;
    }
    public int divide(int a, int b)
    {
        return a / b;
    }
}
