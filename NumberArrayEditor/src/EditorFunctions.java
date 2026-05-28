public class EditorFunctions
{ // start of EditorFunctions Class
    private final int ArraySize;
    private int[] NumArray;
    private int arrayCount;

    //constructor of EditorFunctions class
    public EditorFunctions()
    {
        ArraySize = 5;
        NumArray = new int[ArraySize];
        arrayCount = 0;
    }

    // Function for adding number at the end of the array
    public void addAtEnd(int number)
    { //start of addAtEnd Function

        if (arrayCount < ArraySize)
        { //start of if-else
            NumArray[arrayCount] = number;
            arrayCount++;
            System.out.println("Number added at the end of the array.");
        }
        else
        {
            System.out.println("Array is full, cannot add more elements.");
        } // end of if-else

    }//end of addAtEnd Function

    // Function to add number at a specific postion of the array
    public void addAtPosition(int position, int number)
    {// start of addAtPosition Function

        if (arrayCount >= ArraySize)
        { //start of if statement
            System.out.println("Array is full, cannot add more elements.");
        } // end of if statement
        else if (position < 0 || position > arrayCount)
        { //start of else-if statement
            System.out.println("Invalid index.");
        } // end of else-if statement
        else
        {//start of else statement
            for (int i = arrayCount; i > position; i--)
            { // start of for loop
                NumArray[i] = NumArray[i - 1];
            } // end of for loop
            NumArray[position] = number;
            arrayCount++;
            System.out.println("Number added at index " + position + " of the array.");
        } // end of else statement

    }// end of addAtPosition Function

    // Function to delete a number at the end of the array
    public void deleteFromEnd()
    {// start of deleteFromEnd Function

        if (arrayCount > 0)
        {//start of if statement
            NumArray[arrayCount - 1] = 0; // Last Number is set to 0
            arrayCount--;
            System.out.println("Number deleted from the end.");
        }//end of if statement
        else
        {//start of else statement
            System.out.println("Array is empty, cannot delete.");
        }//end of else statement

    }//end of deleteFromEnd Function

    // Function to delete a number at a specific index
    public void deleteFromPosition(int position)
    {//start of deleteFromPosition Function

        if (position < 0 || position >= arrayCount)
        {// start of if statement
            System.out.println("Invalid index.");
        }//end of if statement
        else
        {//start of else statement
            for (int i = position; i < arrayCount - 1; i++)
            {//start of for loop
                NumArray[i] = NumArray[i + 1];
            }//end of for loop
            NumArray[arrayCount - 1] = 0; // Optional: set last element to 0
            arrayCount--;
            System.out.println("Number deleted at index " + position + ".");
        }//end of else statement

    }//end of deleteFromPosition Function

    public void editAtEnd (int newValue)
    {//start of editAtEnd Function

        if (arrayCount > 0 )
        {//start of if statement
            NumArray[arrayCount-1] = newValue;
            System.out.println("Number at the end of array is replaced with " + newValue + ".");
        }//end of if statement
        else
        { // start of else statement
            System.out.println("Array is Empty, nothing to edit");
        } //end of else statement

    }//end of editAtEnd Function

    // Function to edit a number at a specific index
    public void editAtPosition(int index, int newValue)
    {//start of editAtIndex Function

        if (index >= 0 && index < arrayCount)
        {//start of if statement
            NumArray[index] = newValue;
            System.out.println("Number at index " + index + " updated.");
        } //end of if statement
        else if (index == arrayCount)
        {//start of else-if statement
            NumArray[index] = newValue;
            System.out.println("There was no value at index" + index + " of the array.");
            System.out.println("The new value " + newValue + " has been added at index " + index + " of the array.");
        }//end of else-if statement
        else
        {// start of else statement
            System.out.println("Invalid index.");
        }//end of else statement

    }//end of editAtIndex Function

    public void viewArray ()
    {//start of viewArray Function
        if (arrayCount == 0)
        {//start of if statement
            System.out.println("The array is empty");
        }//end of if statement
        else
        {//start of else statement
            for (int i=0; i < arrayCount; i++)
            {//start of for loop
                System.out.print(NumArray[i] + (" "));
            }//end of for loop
            System.out.println();
        }//end of else statement
    }//end of viewArray Function
}// end of EditorFunctions class

