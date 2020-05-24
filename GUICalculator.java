import java.awt.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;


import java.awt.event.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class GUICalculator implements WindowListener
{
         private JButton addB = new JButton("+");
    private JButton subtractB = new JButton("-");
    private JButton multiplyB = new JButton("*");
    private JButton divideB = new JButton("/");
    private JButton oneB = new JButton("1");
    private JButton twoB = new JButton("2");
    private JButton threeB = new JButton("3");
    private JButton fourB = new JButton("4");
    private JButton fiveB = new JButton("5");
    private JButton sixB = new JButton("6");
    private JButton sevenB = new JButton("7");
    private JButton eightB = new JButton("8");
    private JButton nineB = new JButton("9");
    private JButton zeroB = new JButton("0");
    private JButton clearAllB = new JButton("C");
    private JButton equalsB = new JButton("=");
    private JTextField opField1 = new JTextField(5);
    String operations = "";
    String numPressed = "";
    String answer;
    double firstNum = 0;
    double secondNum = 0;
    double result = 0;
    
    public GUICalculator()
    {   //controls
        JFrame frame = new JFrame("GUI Calculator Application");
        frame.setSize(300,300);
        Container content = frame.getContentPane();
        
        JPanel display1 = new JPanel();//textboxes top
        display1.add(opField1);
        opField1.setVisible(true);
        content.add(display1, BorderLayout.NORTH);
    
        JPanel display2 = new JPanel();//button panel at center
        display2.setLayout(new GridLayout(4,3));
        display2.add(oneB);
        display2.add(twoB);
        display2.add(threeB);
        display2.add(fourB);
        display2.add(fiveB);
        display2.add(sixB);
        display2.add(sevenB);
        display2.add(eightB);
        display2.add(nineB);
        display2.add(zeroB);
        display2.add(clearAllB);
        display2.add(equalsB);
        content.add(display2, BorderLayout.CENTER);

        JPanel display3 = new JPanel();//ops panel at bottom 
        display3.add(addB);
        display3.add(subtractB);
        display3.add(multiplyB);
        display3.add(divideB);
        content.add(display3, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.addWindowListener(this);
//buttons
        ActionListener one = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   String input = opField1.getText().trim();
                int count = input.length();
            
                    if  (count >= 1)
                    opField1.setText(opField1.getText() + "1");
                    else 
                    opField1.setText("1");
              
                numPressed = "1";
            }
        };
        oneB.addActionListener(one);

        ActionListener two = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { String input = opField1.getText().trim();
                int count = input.length();  
                
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "2");
                    else 
                    opField1.setText("2");
             
                numPressed = "2";
            }
        };
        twoB.addActionListener(two);

        ActionListener three = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { String input = opField1.getText().trim();
                int count = input.length();
        
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "3");
                    else 
                    opField1.setText("3");
             
                numPressed = "3";
            }
        };
        threeB.addActionListener(three);

        ActionListener four = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { String input = opField1.getText().trim();
                int count = input.length();
            
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "4");
                    else 
                    opField1.setText("4");
           
                numPressed = "4";
            }
        };
        fourB.addActionListener(four);

        ActionListener five = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { String input = opField1.getText().trim();
                int count = input.length();
  
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "5");
                    else 
                    opField1.setText("5");
          
                numPressed = "5";
            }
        };
        fiveB.addActionListener(five);

        ActionListener six = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { String input = opField1.getText().trim();
                int count = input.length();
   
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "6");
                    else 
                    opField1.setText("6");
              
                numPressed = "6";
            }
        };
        sixB.addActionListener(six);

        ActionListener seven = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { String input = opField1.getText().trim();
                int count = input.length();
        
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "7");
                    else 
                    opField1.setText("7");
              
                numPressed = "7";
            }
        };
        sevenB.addActionListener(seven);

        ActionListener eight = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            { String input = opField1.getText().trim();
                int count = input.length();
   
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "8");
                    else 
                    opField1.setText("8");
                
                numPressed = "8";
            }
        };
        eightB.addActionListener(eight);

        ActionListener nine = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   String input = opField1.getText().trim();
                int count = input.length();

                    if (count >= 1)
                    opField1.setText(opField1.getText() + "9");
                    else 
                    opField1.setText("9");      
                
                numPressed = "9";
            }
        };
        nineB.addActionListener(nine);

        ActionListener zero = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {String input = opField1.getText().trim();
                int count = input.length();
         
                    if (count >= 1)
                    opField1.setText(opField1.getText() + "0");
                    else 
                    opField1.setText("0");
              
                numPressed = "0";
            }   
        };
        zeroB.addActionListener(zero);

        ActionListener clearAll = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
                opField1.setText("");
                //opField2.setText("");
                //resultField.setText("0");
            }
        };
        clearAllB.addActionListener(clearAll);

        ActionListener add = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {  
                firstNum = Double.parseDouble(opField1.getText());
                opField1.setText("");
                operations = "+";
        
            }
        };
        addB.addActionListener(add);

        ActionListener sub = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
            firstNum = Double.parseDouble(opField1.getText());
            opField1.setText("");
            operations = "-";
            }
        };
        subtractB.addActionListener(sub);

        ActionListener mul = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {  
            firstNum = Double.parseDouble(opField1.getText());
            opField1.setText("");
            operations = "*";
          
            }
        };
        multiplyB.addActionListener(mul);

        ActionListener div = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
                firstNum = Double.parseDouble(opField1.getText());
                opField1.setText("");
                operations = "/";
               
            }
        };
        divideB.addActionListener(div);

        ActionListener eq = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   secondNum = Double.parseDouble(opField1.getText()); 
                if(operations == "+")
                    result = firstNum + secondNum;
                    answer = String.format("%.0f", result);
                    opField1.setText(answer);
                if(operations == "-")
                    result = firstNum - secondNum;
                    answer = String.format("%.0f", result);
                    opField1.setText(answer);
                if(operations == "*")
                    result = firstNum * secondNum;
                    answer = String.format("%.0f", result);
                    opField1.setText(answer);
                if(operations == "/")
                    result = firstNum / secondNum;
                    if ((result == Math.floor(result)) && !Double.isInfinite(result))
                    answer = String.format("%.0f", result);
                    else
                    answer = String.format("%.2f", result);
                opField1.setText(answer);         
                operations = "=";      
            }
        };
        equalsB.addActionListener(eq);
    }
    
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
    public void windowActivated(WindowEvent we) {}
    public void windowClosed(WindowEvent we) {}
    public void windowDeactivated(WindowEvent we) {}
    public void windowDeiconified(WindowEvent we) {}
    public void windowIconified(WindowEvent we) {}
    public void windowOpened(WindowEvent we) {}

    public static void main(String[] args)
    {
        new GUICalculator();
    }
}