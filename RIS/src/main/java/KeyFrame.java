


import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author tyler
 */
public class KeyFrame extends JFrame implements KeyListener{
	
	 JLabel label;
	
    KeyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
        
        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        
        this.add(label);
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
     //keyTyped = Invoked when a key is typed. Uses KeyChar, char output
     /*switch(e.getKeyChar()) {
      case 'a': label.setLocation(label.getX()-10, label.getY());
       break;
      case 'w': label.setLocation(label.getX(), label.getY()-10);
       break;
      case 's': label.setLocation(label.getX(), label.getY()+10);
       break;
      case 'd': label.setLocation(label.getX()+10, label.getY());
       break;
     }*/
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
     //keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
    switch(e.getKeyCode()) {
     case 10: label.setLocation(label.getX()-10, label.getY()); //enter
      break;
     case 65: label.setLocation(label.getX(), label.getY()-10); //a
      break;
     case 87: label.setLocation(label.getX()+10, label.getY()); //w
      break;
     case 69: label.setLocation(label.getX(), label.getY()+10); //e
      break;
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {
     //Released = called whenever a button is released
     System.out.println("You released key char: " + e.getKeyChar());
     System.out.println("You released key code: " + e.getKeyCode());
   }
}
