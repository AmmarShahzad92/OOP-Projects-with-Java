import java.util.Scanner;
public class GPAcalculator
{//start of GPAcalculator class
    public static void main(String[] args)
    {//start of main() function

        //declaration of class variables
        Scanner in = new Scanner(System.in);
        personMethods person = new personMethods();
        studentMethods student = new studentMethods();
        teacherMethods teacher = new teacherMethods();

        //initialization of variables
        int option;
        int choice;
        //display of main menu
        while (true)
        {//main menu display - while loop
            System.out.println("1. Go to Student Menu ");
            System.out.println("2. go to Teacher Menu ");
            System.out.println("0. Exit Program");
            System.out.println("Enter your option : ");
            option = in.nextInt();

            //if check to exit program
            if (option == 0)
            {//start of if statement
                break;
            }// end of if statement

            switch (option)
            {//user options handling
                case 1: // student Menu
                    while (true)
                    {//display of student menu
                        System.out.println("");
                    }//end of student menu while loop
            }//end of switch cases

        }//end of while loop

    }//end of main() function
}//end of GPAcalculator class