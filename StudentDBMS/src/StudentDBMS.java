import java.util.Random;  // Import the Scanner class
import java.util.Scanner;   // Import the Random class
public class StudentDBMS 
{  // Create a class named Main

    public int PopulateMethod (Teachers[] teachers, Students[] students, Course[] courses, CourseMarks[] courseMarks)
    {   // Create a method to populate the arrays of objects

        // Creating Random object
        Random rand = new Random();
      
        // Initializing objects
        Address address = new Address();
        int count = 0;  // Initialize count variable to 0

        // Populate all arrays in one loop
        for (int i = 0; i < 5; i++) {
            // Populate Teachers array
            address.Address((i + 1), (i + 1), "City" + (i + 1));
            teachers[i] = new Teachers();
            teachers[i].Persons((i + 1), "Teacher" + (i + 1), address);
            teachers[i].setSalary(1000 * (i + 1));
            teachers[i].Teachers("PhD");

            // Populate Students array
            students[i] = new Students();
            students[i].Persons((i + 1), "Student" + (i + 1), address);
            // Populate Courses array
            courses[i] = new Course();
            courses[i].Course((i + 1), "Course" + (i + 1), 3);

            // Populate CourseMarks array
            courseMarks[i] = new CourseMarks();
            courseMarks[i].CourseMarks(rand.nextInt(6), rand.nextInt(6), rand.nextInt(6), rand.nextInt(40, 100));
            count += 1;
        }
        return count; // return the count of records
    }   // End of method

    public double calculateGPA (int sid, CourseMarks[] courseMarks, Course[] courses)
    {   // Create a method to calculate GPA

        // Define variables
        double GPA = 0;
        int totalCreditHours = 0;
        int totalGradePoints = 0;
        int gradePoints = 0;
        CourseMarks cm = new CourseMarks();
        Course course = new Course();
        int marks = 0;
        int cid = 0;
        int crHrs = 0;
        
        
        for (int i = 0; i < courseMarks.length; i++)
        {   // Create a for loop to calculate GPA
            cm = courseMarks[i];
            if (cm != null && cm.getStudentId() == sid) 
            {   // Create an if statement to check student ID
                cid = cm.getCourseId();
                marks = cm.getMarks();
                
                for (int j = 0; j < courses.length; j++) 
                {   // Create a nested for loop to calculate GPA
                    course = courses[j];
                    if (course != null && course.getCourseCode() == cid) 
                    {   // Create a nested if statement to check course code
                        crHrs = course.getCreditHours();
                        totalCreditHours += crHrs;
                        totalGradePoints += (marks * crHrs);
                    }   // End of nested if statement
                }   // End of nested for loop
            }   // End of if statement
        }   // End of for loop

        // Calculate GPA
        if (totalCreditHours > 0) 
        {   // Create an if statement to check total credit hours greater than 0
            GPA = (double) totalGradePoints / totalCreditHours;
        }   // End of if statement
        else 
        {   // Create an else statement to display an error message
            System.out.println("Total credit hours is zero, cannot calculate GPA.");
        }   // End of else statement
        return GPA;
    }   // End of method

    public void main(String[] args)
    {  // Create a main method

        // define general variables
        Scanner in = new Scanner(System.in);
        int option = 0;
        char choice = ' ';
        final int size = 20;
        
        //course-marks objects
        CourseMarks[] courseMarks = new CourseMarks[size];
        CourseMarks cm = new CourseMarks();
        int cid = 0;
        int sid = 0;
        int tid = 0;
        int marks = 0;
        int record = 0;
        
        //defining general variables for teacher and student
        int id = 0;
        String name = "";

        //define student objects
        Students[] students = new Students[size];
        Students std = new Students();
        String prog = "";
        int sem = 0;

        //define teacher objects
        Teachers[] teachers = new Teachers[size];
        Teachers tch = new Teachers();
        String qual = "";

        //define course objects
        Course[] courses = new Course[size];
        Course crs = new Course();
        int ccode = 0;
        String cname = "";
        int crHrs = 0;

        //define department objects
        Department[] users = new Department[size];
        Department user = new Department();
        String departmentName = "";
        int userId = 0;
        String password = "";
        int dcount = 0;

        //define person objects
        Persons[] persons = new Persons[size];
        Persons person = new Persons();
        int pid = 0;
        String pname = "";
        int pcount = 0;
        
        //define address objects
        Address address = new Address();
        int hno;
        int stno;
        String city;


        //populate the arrays and get the count of records
        int marksCount = PopulateMethod(teachers, students, courses, courseMarks);
        int tcount = marksCount;
        int scount = marksCount;
        int ccount = marksCount;
        while (true)
        {   // Create a while loop

            // Display the menu
            System.out.println("1. Add Marks");
            System.out.println("2. View Marks");
            System.out.println("3. Delete Marks");
            System.out.println("4. Update Marks");
            System.out.println("5. View GPA");
            System.out.println("6. Add Teacher");
            System.out.println("7. Add Student");
            System.out.println("8. Add Course");
            System.out.println("9. Add Software User");
            System.out.println("10. Add Department Person");
            System.out.println("11. Display Teacher");
            System.out.println("12. Display Student");
            System.out.println("13. Display Course");
            System.out.println("14. Display User");
            System.out.println("15. Display Dept Person");
            System.out.println("0. Exit Program");
            System.out.println("Enter your option: ");
            option = in.nextInt();

            // Exit the program if the user enters 0
            if (option == 0)
            {
                break;
            }

            switch (option)
            {   // Create a switch statement to handle user input
                case 1:
                    // Add Marks
                    while (marksCount < size)
                    {   // Create a while loop to add marks
                        System.out.println("Enter Course ID: ");
                        cid = in.nextInt();
                        System.out.println("Enter Student ID: ");
                        sid = in.nextInt();
                        System.out.println("Enter Teacher ID: ");
                        tid = in.nextInt();
                        System.out.println("Enter Marks: ");
                        marks = in.nextInt();
                        cm.CourseMarks(cid, sid, tid, marks);
                        courseMarks[marksCount] = cm;
                        marksCount++;
                        System.out.println("Marks added successfully!");
                        System.out.println("Do you want to add more marks? (Y/N)");
                        choice = in.next().charAt(0);

                        if (choice == 'N')
                        {   // Create an if statement to check user input
                            break;
                        }   // End of if statement

                        if (marksCount == size)
                        {   // Create an if statement to check array size
                            System.out.println("Array is full!");
                            break;
                        }   // End of if statement
                    }   // End of while loop
                    break;

                case 2:
                    // View Marks
                    for (int i = 0; i < size; i++)
                    {   // Create a for loop to view marks
                        System.out.println("Course ID: " + courseMarks[i].getCourseId());
                        System.out.println("Student ID: " + courseMarks[i].getStudentId());
                        System.out.println("Teacher ID: " + courseMarks[i].getTeacherId());
                        System.out.println("Marks: " + courseMarks[i].getMarks());
                    }   // End of for loop
                    break;
                
                case 3:
                    // Delete Marks
                    System.out.println("Enter Record Number to delete marks: ");
                    record = in.nextInt();

                    for (int i = 0; i < size; i++)
                    {   // Create a for loop to delete marks
                        if (i == record)
                        {   // Create an if statement to check record number
                            System.out.println("Existing record: ");
                            System.out.println("Course ID: " + courseMarks[record].getCourseId());
                            System.out.println("Student ID: " + courseMarks[record].getStudentId());
                            System.out.println("Teacher ID: " + courseMarks[record].getTeacherId());
                            System.out.println("Marks: " + courseMarks[record].getMarks());
                            System.out.println("Do you confirm to delete this record? (Y/N)");
                            choice = in.next().charAt(0);
                            if (choice == 'Y')
                            {   // Create a nested if statement to check user input
                                courseMarks[record] = null;
                                System.out.println("Record deleted successfully!");
                            }   // End of nested if statement
                        }   // End of if statement
                        else
                        {   // Create an else statement to display an error message
                            System.out.println("Record not found!");
                        }   // End of else statement
                    }   // End of for loop
                    break;
                
                case 4:
                    // Update Marks
                    System.out.println("Enter Record Number to update marks: ");
                    record = in.nextInt();
                    System.out.println("Existing record: ");
                    System.out.println("Course ID: " + courseMarks[record].getCourseId());
                    System.out.println("Student ID: " + courseMarks[record].getStudentId());
                    System.out.println("Teacher ID: " + courseMarks[record].getTeacherId());
                    System.out.println("Marks: " + courseMarks[record].getMarks());
                    System.out.println("Do you confirm to update this record? (Y/N)");
                    choice = in.next().charAt(0);

                    if (choice == 'Y')
                    {   // Create an if statement to check user input
                        System.out.println("Enter Course ID: ");
                        cid = in.nextInt();
                        System.out.println("Enter Student ID: ");
                        sid = in.nextInt();
                        System.out.println("Enter Teacher ID: ");
                        tid = in.nextInt();
                        System.out.println("Enter Marks: ");
                        marks = in.nextInt();
                        cm.CourseMarks(cid, sid, tid, marks);
                        courseMarks[record] = cm;
                        System.out.println("Record updated successfully!");
                    }   // End of if statement
                    break;

                case 5:
                    // View GPA
                    System.out.println("Enter Student ID to view GPA: ");
                    sid = in.nextInt();
                    
                    System.out.println("GPA: " + calculateGPA(sid, courseMarks, courses));
                    break;
                case 6:
                    // Add Teacher
                    System.out.println("Enter Teacher ID: ");
                    id = in.nextInt();
                    System.out.println("Enter Teacher Name: ");
                    name = in.next();
                    System.out.println("Enter House No: ");
                    hno = in.nextInt();
                    System.out.println("Enter Street No: ");
                    stno = in.nextInt();
                    System.out.println("Enter City: ");
                    city = in.next();
                    address.Address(hno, stno, city);
                    tch.Persons(id, name, address);
                    System.out.println("Enter Qualification: ");
                    qual = in.next();
                    tch.Teachers(qual);
                    teachers[tcount] = tch;
                    tcount++;
                    break;

                case 7:
                    // Add Student
                    System.out.println("Enter Student ID: ");
                    id = in.nextInt();
                    System.out.println("Enter Student Name: ");
                    name = in.next();
                    System.out.println("Enter House No: ");
                    hno = in.nextInt();
                    System.out.println("Enter Street No: ");
                    stno = in.nextInt();
                    System.out.println("Enter City: ");
                    city = in.next();
                    address.Address(hno, stno, city);
                    std.Persons(id, name, address);
                    System.out.println("Enter Student Program: ");
                    prog = in.next();
                    System.out.println("Enter Student Semester");
                    std.Students(prog, sem);
                    students[scount] = std;
                    scount++;
                    break;

                case 8:
                    // Add Course
                    System.out.println("Enter Course Code: ");
                    ccode = in.nextInt();
                    System.out.println("Enter Course Name: ");
                    cname = in.next();
                    System.out.println("Enter Course Credit Hours: ");
                    crHrs = in.nextInt();
                    crs.Course(ccode, cname, crHrs);
                    courses[ccount] = crs;
                    ccount++;
                    break;

                case 9:
                    // Add Software User
                    System.out.println("Enter Department Name: ");
                    departmentName = in.next();
                    System.out.println("Enter User ID: ");
                    userId = in.nextInt();
                    System.out.println("Enter Password: ");
                    password = in.next();
                    user.addUser(departmentName, userId, password);
                    users[dcount] = user;
                    dcount++;
                    break;

                case 10:
                    // Add Department Person
                    System.out.println("Enter Person ID: ");
                    pid = in.nextInt();
                    System.out.println("Enter Person Name: ");
                    pname = in.next();
                    System.out.println("Enter House No: ");
                    hno = in.nextInt();
                    System.out.println("Enter Street No: ");
                    stno = in.nextInt();
                    System.out.println("Enter City: ");
                    city = in.next();
                    address.Address(hno, stno, city);
                    person.Persons(pid, pname, address);
                    persons[pcount] = person;
                    pcount++;
                    break;

                case 11:
                    // Display Teacher
                    for (int i = 0; i < tcount; i++)
                    {   // Create a for loop to display teacher
                        System.out.println("Teacher ID: " + teachers[i].getId());
                        System.out.println("Teacher Name: " + teachers[i].getName());
                        System.out.println("Address: House No." + teachers[i].getAddress().getHouseNumber() + ", Street No." + teachers[i].getAddress().getStreetNumber() + ", " + teachers[i].getAddress().getCity());
                        System.out.println("Teacher Qualification: " + teachers[i].getQualification());
                    }   // End of for loop
                    break;

                case 12:
                    // Display Student
                    for (int i = 0; i < scount; i++)
                    {   // Create a for loop to display teacher
                        System.out.println("Student ID: " + students[i].getId());
                        System.out.println("Student Name: " + students[i].getName());
                        System.out.println("Address: House No." + students[i].getAddress().getHouseNumber() + ", Street No." + students[i].getAddress().getStreetNumber() + ", " + students[i].getAddress().getCity());
                        System.out.println("Student Program: " + students[i].getProgram());
                        System.out.println("Student Semester: " + students[i].getSemester());
                    }   // End of for loop
                    break;

                case 13:
                    // Display Course
                    for (int i = 0; i < ccount; i++)
                    {   // Create a for loop to display teacher
                        System.out.println("Course Code: " + courses[i].getCourseCode());
                        System.out.println("Course Name: " + courses[i].getCourseName());
                        System.out.println("Course Credit Hours: " + courses[i].getCreditHours());
                    }   // End of for loop
                    break;
                
                case 14:
                    // Display User
                    for (int i = 0; i < dcount; i++)
                    {   // Create a for loop to display teacher
                        System.out.println("Department Name: " + users[i].getDepartmentName());
                        System.out.println("User ID: " + users[i].getUserId());
                        System.out.println("Password: " + users[i].getPassword());
                    }   // End of for loop
                    break;

                case 15:
                    // Display Department Person
                    for (int i =0; i < pcount; i++)
                    {   // Create a for loop to display teacher
                        System.out.println("Person ID: " + persons[i].getId());
                        System.out.println("Person Name: " + persons[i].getName());
                        System.out.println("Address: House No." + persons[i].getAddress().getHouseNumber() + ", Street No." + persons[i].getAddress().getStreetNumber() + ", " + persons[i].getAddress().getCity());
                    }   // End of for loop
                    break;

                default:
                    // Display an error message if the user enters an invalid option
                    System.out.println("Invalid option!");
                    break;
            }   // End of switch statement
        }   // End of while loop
    }   // End of main method
}   // End of class Main