import java.util.Scanner;

public class Listing
{ private String name;  // key field
   private String identification;
   private String gradePointAverage;
   public Listing(String n, String id, String gpa )
  {  name = n;
      identification = id;
      gradePointAverage = gpa;
  }
   public String toString( )
   {   return("Name is " + name +
                    "\nID is " + identification +
                    "\nGPA is " + gradePointAverage + "\n");
   }
   public Listing deepCopy( )
   {  Listing clone = new Listing(name, identification, gradePointAverage);
      return clone;
   }
   public int compareTo(String targetKey)
   {  return(name.compareTo(targetKey));
   }
   /*public int getKey(String targetKey)
   {  return compareTo(targetKey);
   }*/
   public void setGradePointAverage(String gpa) // coded to demonstrate encapsulation
   {  gradePointAverage = gpa;
   }
   public void input()
   {  Scanner reader = new Scanner(System.in);
      System.out.println("Enter a name: ");
      name = reader.nextLine();
      System.out.println("Enter id: ");
      identification = reader.nextLine();
      System.out.println("Enter gpa: ");
      gradePointAverage = reader.nextLine();
	
   }
 }// end of class Listing

