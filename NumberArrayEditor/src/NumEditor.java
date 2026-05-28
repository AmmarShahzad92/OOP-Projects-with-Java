import java.util.Scanner;

public class NumEditor
{// Start of Editor class
    public static void main(String[] args)
    {// Start of main method

        //Scanner Library definition
        Scanner in = new Scanner(System.in);

        //declaration of class type variable
        EditorFunctions editor = new EditorFunctions();

        //Definition of variables
        int option;
        int number;
        char choice = '0';
        int position;


        //Display of Main Menu
        while (true)
        {// Start of the main menu While loop
            System.out.println("1. Add in Array");
            System.out.println("2. Delete in Array");
            System.out.println("3. Edit in Array");
            System.out.println("4. View Array");
            System.out.println("0. Exit Program");
            System.out.print("Enter your option: ");
            option = in.nextInt();


            //program exit condition check
            if (option == 0)
            {//start of if statement
                break;
            }//end of if statement

            // Check if user wants to add, delete, or edit
            if (option > 0 && option < 4)
            {//start of if statement

                //Display Of Sub Menu
                while (choice != 'A' && choice != 'B')
                {//start of Sub Menu While Loop
                    System.out.println("A. Perform Operation at End");
                    System.out.println("B. Perform Operation at Specific Index");
                    System.out.println("Enter Correct Choice (A/B only) : ");
                    choice = in.next().charAt(0);

                    if (choice != 'A' && choice != 'B')
                    {//check if choice is invalid
                        System.out.println("Invalid Choice..!!");
                    }//end of if check
                }//end of Sub Menu While Loop

            }//end of if statement


            //user option handling
            switch (option)
            {//start of switch statement
                case 1:  // Add function
                    if (choice == 'A')
                    {// check if to add at end of the array
                        System.out.print("Enter number to add at the end: ");
                        number = in.nextInt();
                        editor.addAtEnd(number);
                    }// End of if check addAtEnd
                    else {// Check if to add at specific position of the array
                        System.out.print("Enter the index: ");
                        position = in.nextInt();
                        System.out.print("Enter the number: ");
                        number = in.nextInt();
                        editor.addAtPosition(position, number);
                    } // End of if check addAtPosition

                    break;

                case 2:  // Delete function
                    if (choice == 'A')
                    {// Check if to delete from end of the array
                        editor.deleteFromEnd();
                    }// End of if check deleteFromEnd
                    else {// check if to delete from specific postion of the array
                        System.out.print("Enter the index: ");
                        position = in.nextInt();
                        editor.deleteFromPosition(position);
                    }// End of if check deleteFromPosition

                    break;

                case 3:  // Edit function
                    if (choice == 'A')
                    {// check if to edit at the end of the array
                        System.out.print("Enter a number to edit at the end: ");
                        number = in.nextInt();
                        editor.editAtEnd(number);
                    }// End of if check editAtEnd
                    else {// check if to edit at specific position of the array
                        System.out.print("Enter the index: ");
                        position = in.nextInt();
                        System.out.print("Enter the number: ");
                        number = in.nextInt();
                        editor.editAtPosition(position, number);
                    }// End of if check editAtPosition

                    break;

                case 4:  // View function
                    editor.viewArray(); // Display the numbers of the array
                    break;
                default:
                    System.out.println("Invalid option."); // Handle invalid menu option
            }  // End of switch statement

        }  // End of main menu whileloop
    }  // End of main method
}  // End of Editor class
