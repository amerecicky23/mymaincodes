import java.util.Scanner;

public class SLLWorkoutTracker 
{
	SinglyLinkedList workoutList = new SinglyLinkedList();
    String workout = "";
    String operations = "";
    Workout temp;
   
    
    public static void main(String[] args)
    {   //controls
        Scanner reader = new Scanner(System.in);
        
        SinglyLinkedList workoutLog = new SinglyLinkedList();
        Workout newWorkout = new Workout("","","","","","","",""); //set new item object

        System.out.println("\nPlease enter one of these options:\n" +
        "1 for New Workout\n2 for Saved Workouts\n3 for Quit: ");
        int choice = reader.nextInt();
        while (choice != 3){//quit
              
                if(choice == 1)//new wkout
                {  
                    newWorkout.input();
                    workoutLog.insert(newWorkout);
                    System.out.println("\nWorkout log: ");
                    workoutLog.showAll();

                    System.out.println("\nPlease enter one of these options:\n" +
                    "1 for New Workout\n2 for Saved Workouts\n3 for Quit: ");
                    choice = reader.nextInt();
                }  //close 1

                else//(choice == 2)//saved wkout
                {   
                    while(choice != 6)
                    {
                    System.out.println("\nPlease enter one of these options:\n" +
                    "4 for Saved Workout or\n5 for Edit Workout\n6 for Main Menu: ");
                    choice = reader.nextInt();

                        if(choice == 4){
                        String name = "";              
                        System.out.println("Enter workout name: ");
		                reader.nextLine();
                        name = reader.nextLine(); 
                        Workout w1 = workoutLog.fetch(name);
		                if(w1 != null)
                        System.out.println("Operation complete: " + w1);      
                        else
                        System.out.println("Workout not in system");
                        System.out.println("\nPlease enter one of these options:\n" +
                        "1 for Saved Workout or\n2 for Edit Workout\n3 for Main Menu: ");
                        choice = reader.nextInt();
                        }//close 1

                        if(choice == 5){
                        String name = "";              
                        System.out.println("Enter workout name to edit: ");
                        reader.nextLine();
                        name = reader.nextLine(); 
                        workoutLog.delete(name);
                            //proceed to edit workout
                            if(name != null){
                            System.out.println("Operation complete. Enter new workout: "); 
                            newWorkout.input();
                            workoutLog.insert(newWorkout);
                            System.out.println("\nWorkout log: ");
                            workoutLog.showAll();
                            }
                            else
                            System.out.println("Workout not in system");
                            System.out.println("\nPlease enter one of these options:\n" +
                            "1 for Saved Workout or\n2 for Edit Workout\n3 for Main Menu: ");
                            choice = reader.nextInt();
                        }//close 5
                    }//6 was pressed
                        //choice = 3
                        System.out.println("\nPlease enter one of these options:\n" +
                        "1 for New Workout\n2 for Saved Workouts\n3 for Quit: ");
                         choice = reader.nextInt();
                
            }   //close 3          
        }
            System.exit(0);
            //close menu loop*/
    }//end main
}//end class