
package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Class10 extends JFrame {
    
    private Container c;
    private JLabel userLabel;
    Class10(){
    initComponents();
    }
    
    public void initComponents(){
    
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.PINK);
    
    userLabel = new JLabel();
    userLabel.setText("Entered your name :");
    userLabel.setBounds(50,20,150,80);
    c.add(userLabel);
    }
    
    public static void main(String[] args) {
        Class10 frame = new Class10();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        
        frame.setTitle("12 CLASS HELLOW WOULD");
    }
    
}
