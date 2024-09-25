import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class Puzzle extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
    String name;
    private Timer timer;
    private JLabel timeLabel;
    private int remainingTime;
    
    Puzzle(){
        super("Puzzle Game by kishore(sec-b)");
        name=JOptionPane.showInputDialog(this,"Enter Name");
        // Create the timer with a 2-minute delay
        timer = new Timer(120000, this);

        // Create the time label and add it to the frame
        timeLabel = new JLabel("Time: 2:00");
        getContentPane().add(timeLabel);
        setBounds(10, 10, 80, 70);
        
    
        // Start the timer
        timer.start();
        setVisible(true);
        setLayout(null);

        
        

        b1=new JButton("1");  
        b1.setBounds(10,30,100,100);
        add(b1);
        
        
         
        b2=new JButton("2");  
        b3=new JButton("3");  
        b4=new JButton("4");  
        b5=new JButton("5");  
        b6=new JButton("6");  
        b7=new JButton("7");  
        b8=new JButton(" ");  
        b9=new JButton("8");  
        next=new JButton("next");
        
        b2.setBounds(120,30,100,100);  
        b3.setBounds(230,30,100,100);  
        b4.setBounds(10,140,100,100);  
        b5.setBounds(120,140,100,100);  
        b6.setBounds(230,140,100,100);  
        b7.setBounds(10,250,100,100);  
        b8.setBounds(120,250,100,100);  
        b9.setBounds(230,250,100,100);  
        next.setBounds(100,370,150,50);
        add(b2); add(b3); add(b4);
        add(b5); add(b6); add(b7);
        add(b8); add(b9); add(next);

        

        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        next.addActionListener(this);
        
         
        
        b1.setBackground(Color.orange);
        b1.setForeground(Color.red);
        b2.setBackground(Color.orange);
        b2.setForeground(Color.blue);
        b3.setBackground(Color.orange);
        b3.setForeground(Color.black);
        b4.setBackground(Color.white);
        b4.setForeground(Color.red);
        b5.setBackground(Color.white);
        b5.setForeground(Color.blue);
        b6.setBackground(Color.white);
        b6.setForeground(Color.black);
        b7.setBackground(Color.green);
        b7.setForeground(Color.red);
        b8.setBackground(Color.green);
        b8.setForeground(Color.blue);
        b9.setBackground(Color.green);
        b9.setForeground(Color.black);
        next.setBackground(Color.black);
        next.setForeground(Color.pink);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(360,580);
                
        setLocation(100,100);
        setVisible(true);
        
        
        
        
        
        

        
    }//end of constructor
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == timer) {
            // Update the remaining time
            remainingTime -= 1000;

            // Update the time label
            int minutes = remainingTime / 60000;
            int seconds = (remainingTime % 60000) / 1000;
            
            timeLabel.setText("Time: " + minutes + ":" + (seconds < 10 ? "0" : "") + seconds);
            setLayout(null);
            setVisible(true);
            
            if (remainingTime <= 0) {
                // End the game if the time limit is reached
                timer.stop();
                JOptionPane.showMessageDialog(this, "Time's up! You lose.");
                // Add code to end the game here
            }
        }
        if(e.getSource()==b1){
            String s=b1.getText();
            if(b2.getText()==" "){
                b1.setText(" ");
                b2.setText(s);
            }
            else if(b4.getText()==" "){
                b4.setText(s);
                b1.setText(" ");
            }
        }
        
        if(e.getSource()==b2){
            String s=b2.getText();  
            if(b1.getText()==" "){ 
                b1.setText(s); b2.setText(" ");
            }  
            else if(b3.getText()==" "){ 
                b3.setText(s); b2.setText(" ");
            }  
            else if(b5.getText()==" "){ 
                b5.setText(s); b2.setText(" ");
            }  
        }
        
        if(e.getSource()==b3){
            String s=b3.getText();  
            if(b2.getText().equals(" ")){
                b2.setText(s); b3.setText(" ");
            }  
            else if(b6.getText()==" "){
                b6.setText(s); b3.setText(" ");
            }  
        }
        
        if(e.getSource()==b4){
            String s=b4.getText();  
            if(b1.getText()==" "){ 
                b1.setText(s); b4.setText(" ");
            }  
            else if(b7.getText()==" "){ 
                b7.setText(s); b4.setText(" ");
            }  
            else if(b5.getText()==" "){ 
                b5.setText(s); b4.setText(" ");
            } 
            else if(b8.getText()==" "){
                JOptionPane.showMessageDialog(this,"Invalid Move","Worning",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        if(e.getSource()==b5){
            String s=b5.getText();  
            if(b2.getText()==" "){ 
                b2.setText(s); b5.setText(" ");
            }  
            else if(b4.getText()==" "){ 
                b4.setText(s); b5.setText(" ");
            }  
            else if(b6.getText()==" "){ 
                b6.setText(s); b5.setText(" ");
            }  
            else if(b8.getText()==" "){ 
                b8.setText(s); b5.setText(" ");
            }  
        }
        
        if(e.getSource()==b6){
            String s=b6.getText();  
            if(b9.getText()==" "){ 
                b9.setText(s); b6.setText(" ");
            }  
            else if(b3.getText()==" "){ 
                b3.setText(s); b6.setText(" ");
            }  
            else if(b5.getText()==" "){ 
                b5.setText(s); b6.setText(" ");
            }  
        }
        
        if(e.getSource()==b7){
            String s=b7.getText();  
            if(b4.getText()==" "){ 
                b4.setText(s); b7.setText(" ");
            }  
            else if(b8.getText()==" "){ 
                b8.setText(s); b7.setText(" ");
            }  
        }
        
        if(e.getSource()==b8){
            String s=b8.getText();  
            if(b7.getText()==" "){ 
                b7.setText(s); b8.setText(" ");
            }  
            else if(b9.getText()==" "){ 
                b9.setText(s); b8.setText(" ");
            }  
            else if(b5.getText()==" "){ 
                b5.setText(s); b8.setText(" ");
            }
        }
        
        if(e.getSource()==b9){
            String s=b9.getText();  
            if(b6.getText()==" "){ 
                b6.setText(s); b9.setText(" ");
            }   
            else if(b8.getText()==" "){ 
                b8.setText(s); b9.setText(" ");
            }
            if(b1.getText()=="1" && b2.getText().equals("2")&&b3.getText()  
                .equals("3")&&b4.getText().equals("4")
                 &&b5.getText().equals("5")  
                &&b6.getText().equals("6")&&b7.getText().equals("7")
                &&b8.getText()  
                .equals("8")&&b9.getText().equals(" ")){
                JOptionPane.showMessageDialog(this,name+"!! Congratulations!! You Won The Game");
            }
        }
        
        if(e.getSource()==next){
            String s1=b1.getText();
            b1.setText(b5.getText());
            b5.setText(s1);
            String s2=b4.getText();
            b4.setText(b9.getText());
            b9.setText(s2);
            String s3=b2.getText();
            b2.setText(b7.getText());
            b7.setText(s3);
            String s4=b3.getText();
            b3.setText(b4.getText());
            b4.setText(s4);
        }
    }
    
    public static void main(String []args)
    {
        
        new Puzzle();
        
    }
}