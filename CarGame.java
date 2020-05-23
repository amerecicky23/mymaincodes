import java.awt.*;

import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.awt.event.*;

public class CarGame
{   
    int carSpeed1 = 0;
    int carSpeed2 = 0;
    private JButton enterB = new JButton("Enter top speed");
    private JButton quitB = new JButton("Quit");
    private JTextField speedField1 = new JTextField(5);
    private JTextField speedField2 = new JTextField(5);
    private JTextField resultArea = new JTextField(15);

    public CarGame ()
    {///main frame
        JFrame frame = new JFrame("The Car Game");
        frame.setSize(600,300);
        Container content = frame.getContentPane();
        //button panel at top
        JPanel display1 = new JPanel();   
        display1.add(enterB);
        display1.add(quitB);
        display1.add(speedField1);
        display1.add(speedField2);
        display1.add(resultArea);
        content.add(display1, BorderLayout.NORTH);
        //enter first car speed
            
        ActionListener enterTopSpeed = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {      
                String speed1Text = speedField1.getText().trim();
                String speed2Text = speedField2.getText().trim();
                carSpeed1 = Integer.parseInt(speed1Text);
                carSpeed2 = Integer.parseInt(speed2Text);
                if(carSpeed1 > carSpeed2)
                resultArea.setText("Car 1 wins!");
                else
                resultArea.setText("Car 2 wins!");
               
            }
        };
        enterB.addActionListener(enterTopSpeed);

        ActionListener quit = new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {   
                System.exit(0);
            }
        };
        quitB.addActionListener(quit);

        frame.setVisible(true);  
        
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
               System.exit(0);
            }
         });
    }
    public static void main(String[] args)
    {    
        new CarGame();
    }
 }