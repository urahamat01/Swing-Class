package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Class17 extends JFrame {
    
    private Container c;
    private JTextField tf1, tf2;
    
    Class17() {
        initComponents();
        
    }
    
    public void initComponents() {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setText("Rahamat ullah");
        
        tf2.setBounds(50, 120, 200, 50);
        c.add(tf2);
        
    }
    
    public static void main(String[] args) {
        Class17 frame = new Class17();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Little programmer---");
        
    }
}
