import java.util.Scanner;

public class StudentDriver
{   public static void main(String[] args)
    {  Scanner reader = new Scanner(System.in);
        
        SinglyLinkedList college = new SinglyLinkedList();
        System.out.println("Enter size of initial data set: ");
        int size = reader.nextInt();        

        Listing[] collegeList = new Listing[size];

        for(int i = 0; i < collegeList.length; i++)// input values
        {
            collegeList[i] = new Listing("","","");
            collegeList[i].input();
            college.insert(collegeList[i]);
        }
        Listing newStudent = new Listing("","",""); //set new student object
        
        System.out.println("\nPlease enter one of these options:\n" +
        "1 for insert\n2 for fetch\n3 for delete\n4 for update\n" +
        "5 for output\n6 for quit: ");
        int choice = reader.nextInt();
        while (choice != 6){

            if (choice == 1)
             {  
                System.out.println("\nInsert new student: ");
                newStudent.input();
                college.insert(newStudent);
                System.out.println("\nCollege list: ");
                college.showAll();
                
                System.out.println("\nPlease enter one of these options:\n" +
                "1 for Insert\n2 for Fetch\n3 for Delete\n4 for Update\n" +
                "5 for Output\n6 for Quit: ");
                 choice = reader.nextInt(); 
               }  //close 1
            else if(choice == 2)
            {  
            String name = "";              
            System.out.println("Fetch: Enter student name: ");
		    reader.nextLine();
                name = reader.nextLine(); 
		    Listing s1 = college.fetch(name);
		    if(s1 != null)
            System.out.println("Operation complete: " + s1);
		    else
            {System.out.println("Node not in structure");}
         
                    System.out.println("\nPlease enter one of these options:\n" +
                    "1 for Insert\n2 for Fetch\n3 for Delete\n4 for Update\n" +
                    "5 for Output\n6 for Quit: ");
                    choice = reader.nextInt();
            }  //close 2

            else if (choice == 3)
            {String name = "";
             System.out.println("Delete: Enter student name: ");
		    reader.nextLine();
            name = reader.nextLine(); 
            college.delete(name);
            if(name != null)
            {
            System.out.println("Operation complete, current list: ");
            college.showAll();}
		    else
		     {System.out.println("Node not in structure");}
           
                System.out.println("\nPlease enter one of these options:\n" +
                "1 for Insert\n2 for Fetch\n3 for Delete\n4 for Update\n" +
                "5 for Output\n6 for Quit: ");
                choice = reader.nextInt();
            }//close 3

           else if (choice == 4) {String name = "";
		    String name2 = "";
            System.out.println("Update: Enter student name to update: ");
		    reader.nextLine();
            name = reader.nextLine();
            Listing s1 = college.fetch(name);

            System.out.println("Enter new student: ");
            reader.nextLine();
            name2 = reader.nextLine();
            Listing s2 = college.fetch(name2);
            college.update(name, s2);        
            if(s1 != null || s2 != null){   
			System.out.println("Operation complete: ");
			college.showAll();}
            else
           {System.out.println("Node not in structure");}    

                System.out.println("\nPlease enter one of these options:\n" +
                "1 for Insert\n2 for Fetch\n3 for Delete\n4 for Update\n" +
                "5 for Output\n6 for Quit: ");
                choice = reader.nextInt();
            }//close 4

            else if (choice == 5){
             System.out.println("Output of student list: ");
             college.showAll();
             System.out.println("\nPlease enter one of these options:\n" +
                "1 for Insert\n2 for Fetch\n3 for Delete\n4 for Update\n" +
                "5 for Output\n6 for Quit: ");
                choice = reader.nextInt();
            }//close 5 */

            else //(choice == 6)close program
              System.exit(0);
            }//close menu loop
        System.exit(0);
    }
 }
