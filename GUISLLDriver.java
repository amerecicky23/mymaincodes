import java.awt.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.awt.event.*;

public class GUISLLDriver 
{   
    private JButton insertB = new JButton("Insert");
    private JButton fetchB = new JButton("Fetch");
    private JButton deleteB = new JButton("Delete");
    private JButton updateB = new JButton("Update");
    private JButton reinitialB = new JButton("Reinitialize");
    private JButton quitB = new JButton("Quit");
    private JButton okB = new JButton("OK");
    private JButton cancelB = new JButton("Cancel");
    private JTextField nameField = new JTextField(5);
    private JTextField idField = new JTextField(5);
    private JTextField gpaField = new JTextField(5);
    private JTextField opField = new JTextField(5);
    private JTextArea resultArea = new JTextArea(50, 20);
    SinglyLinkedList college = new SinglyLinkedList();
    //set up new student node for ops
    Listing newStudent = new Listing("","","");
    Listing s1 = new Listing("","","");
    Listing s2 = new Listing("","","");
    String name = "";
    String from = "";
    String changeTo = "";
    Listing temp;

    public GUISLLDriver ()
    {///main frame
        JFrame frame = new JFrame("Linked List GUI Application");
        frame.setSize(600,300);
        Container content = frame.getContentPane();
        //button panel at top
        JPanel display1 = new JPanel();   
        display1.add(insertB);
        display1.add(fetchB);
        display1.add(deleteB);
        display1.add(updateB);
        display1.add(reinitialB);
        display1.add(quitB);
        content.add(display1, BorderLayout.NORTH);
        //input fields at center
        JPanel display2 = new JPanel();  
        JLabel nameLbl = new JLabel("Name:");
        display2.add(nameLbl);
        display2.add(nameField);
        nameField.setSize(10,1);
        nameLbl.setVisible(true);
        nameField.setVisible(true);

        JLabel idLbl = new JLabel("ID:");
        display2.add(idLbl);
        display2.add(idField);
        idField.setSize(10,1);
        idLbl.setVisible(true);
        idField.setVisible(true);

        JLabel gpaLbl = new JLabel("GPA:");
        display2.add(gpaLbl);
        display2.add(gpaField);
        gpaField.setSize(10,1);
        gpaLbl.setVisible(true);
        gpaField.setVisible(true);
        
        JLabel opLbl = new JLabel("Enter name to operate on:");
        display2.add(opLbl);
        display2.add(opField);
        opField.setSize(10,1);
        opLbl.setVisible(true);
        opField.setVisible(true);
        display2.add(okB);
        display2.add(cancelB);
        content.add(display2, BorderLayout.CENTER);
        
        //scrollbox for results to be displayed
        JPanel display3 = new JPanel();
        display3.add(resultArea);
        JScrollPane sp = new JScrollPane(resultArea);
        resultArea.append("Initialized State(List is Empty:)");
        content.add(sp, BorderLayout.EAST);
            
        ActionListener in = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {      
                String nameText = nameField.getText().trim();
                String idText = idField.getText().trim();
                String gpaText = gpaField.getText().trim();
                Listing newStudent = new Listing(nameText,idText,gpaText);
                college.insert(newStudent);
                resultArea.append("\n" + newStudent.toString());
            }
        };
        insertB.addActionListener(in);

        ActionListener fe = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
                opField.getText().trim();
                name = opField.getText().trim();
                s1 = college.fetch(name);
                //college.fetch(name);
		temp = s1;//test for null value
		if(temp == null)
		resultArea.append(
                "\nNode not in structure; " + temp.toString());
		else
		resultArea.append("\nOperation complete:\n " + 
                temp.toString());
            }
        };
        fetchB.addActionListener(fe);

        ActionListener del = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
                opField.getText().trim();
                name = opField.getText().trim();
                s1 = college.fetch(name);
                college.delete(name);
                if(s1 != null)//test for null value
                resultArea.append(  
                "\nOperation complete; Delete of:\n " + name.toString());
                else
                resultArea.append(
                "\nNode not in structure; " + college.delete(name));
            }
        };
        deleteB.addActionListener(del);

        ActionListener upFrom = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {  
                opField.getText().trim();
                from = opField.getText().trim();
                s1 = college.fetch(from);
                //college.fetch(from);
		temp = s1;//test for null value
		if(temp == null)
		resultArea.append(
                "\nNode not in structure; " + temp.toString());
		else
		resultArea.append("\nName entered is\n " +
                temp.toString() +
                "\nEnter to change to,\nthen press Ok: \nPress Cancel to start again: ");
               
            }
        };
        updateB.addActionListener(upFrom);

        ActionListener upTo = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
                opField.getText().trim();
                changeTo = opField.getText().trim();
                s2 = college.fetch(changeTo);
                //college.fetch(changeTo);	
                college.update(from, s2);
                //temp = college.fetch(changeTo);
		temp = s2;//test for null value
		if(temp == null)
		resultArea.append(
                "\nNode not in structure; " + temp.toString() +
		"\nEnter to change to,\nthen press Ok: \nPress Cancel to start again: ");
		else
		resultArea.append("\nNew student listing:\n " +
                temp.toString() 
                );
            }
        };
        okB.addActionListener(upTo);

        ActionListener re = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
               // if(count > 0){
		temp = newStudent;//test for null value
                if(temp == null)
		resultArea.append("\nList is empty; ");//supposed to show if list is already empty..
		else
                {college.clearAll();
                resultArea.append("\nOperation complete ");
                resultArea.append("\nInitialized State(List is Empty:)");}
                
            }
        };
        reinitialB.addActionListener(re);

        ActionListener ca = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   temp = s1;//test for null value
		if(temp == null)
		resultArea.append("\nNo name in op field\nEnter name to Update");
		else
                resultArea.append("\nOperation canceled");
                opField.getText().trim();
                from = opField.getText().trim();
                s1 = college.fetch(from);
		temp = s1;//set up new update
            }
        };
        cancelB.addActionListener(ca);

        ActionListener quit = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
                System.exit(0);
            }
        };
        quitB.addActionListener(quit);

        frame.setVisible(true);      
    }
    public static void main(String[] args)
    {    
        new GUISLLDriver();
    }
 }
