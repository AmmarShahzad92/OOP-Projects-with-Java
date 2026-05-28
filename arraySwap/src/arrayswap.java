public class arrayswap
{
    private int[] myArray;
    private int counter;
    private int largest;
    private int highIndex;
    private int smallIndex;
    private int smallest;
    private int temp;
    private int size;

    public arrayswap()
    {
        size= 10;
        myArray = new int[size];
        counter = 0;
        highIndex = 0;
        smallIndex = 0;
        largest = 0;
        smallest = 0;
        temp = 0;
    }

    public void addinarray (int x)
    {
        myArray[counter]=x;
        counter++;

    }

    public int largecheck ()
    {
        largest = myArray[0];
        for (int i=0; i<size; i++)
        {
            if (myArray[i] > largest)
            {
                largest=myArray[i];
                highIndex = i;
            }
        }
        System.out.println("Largest Number in array: " + largest);
        return highIndex;
    }

    public int smallcheck ()
    {
        smallest=myArray[0];
        for (int i=0; i<size; i++)
        {
            if ((myArray[i] < smallest))
            {
                smallest=myArray[i];
                smallIndex=i;
            }

        }
        System.out.println("Smallest Number in Array: " + smallest);
        return smallIndex;

    }
    public void swapping ()
    {
        System.out.println("Array Before Swapping: " + myArray);
        temp = myArray[highIndex];
        myArray[highIndex]=myArray[smallIndex];
        myArray[smallIndex]=temp;
        System.out.println("Largest Swapped With: " + myArray[highIndex]);
        System.out.println("Smallest Swapped With: " + myArray[smallIndex]);
        System.out.println("Array After Swapping: " + myArray);
    }

}
