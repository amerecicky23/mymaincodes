import javax.lang.model.util.ElementScanner6;

public class SinglyLinkedList
{  private Node h;  // list header
    public SinglyLinkedList()
    {  h = new Node();  // dummy node
        h.l = null;//set fields of dummy node to null
        h.next = null;//condition for empty list
    }
    public boolean insert(Listing newListing)
    {  Node n = new Node();//create a new linked list Node object
    
        if(n == null) // out of memory
           return false;
        else
            n.next = h.next;//add the linked list Node object to the front of the list
            h.next = n;
            n.l = newListing.deepCopy();
            return true;
          
        
   }
public Listing fetch(String targetKey)
 {  Node p = h.next;
     while (p != null  &&  !(p.l.compareTo(targetKey) == 0))
     {  p = p.next;
     }
     if(p != null)
        return p.l.deepCopy();
     else
        return null;
  }
  public boolean delete(String targetKey)
  {  Node q = h;//header
      Node p = h.next;//node after header
      while (p != null && !(p.l.compareTo(targetKey) == 0))
      {  q = p;//q is equal to node after header
          p = p.next;//p is equal to the next node
      }
      if(p != null)
      {   q.next = p.next;//node after q is equal to node after p
           return true;
      }
      else
           return false;
  }
  public boolean update(String targetKey, Listing newListing)
  {  if(delete(targetKey) == false)
         return false;
      else if(insert(newListing) == false)
        return false;
      return true;
  }
  public void showAll()
  { Node p = h.next;
     while (p != null) //continue to traverse the list
     {   System.out.println(p.l.toString( ));
          p = p.next;
     }
   }
   public boolean clearAll()
   { Node p = h.next;
      if (p != null) //continue to traverse the list
        { 
            h.next = null;
            return true;}
        else 
           return false;
    }
  public class Node
  {  private Listing l;
      private Node next;
      public Node()
     {
     }
   }// end of inner class Node
}//end SinglyLinkedList outer class

