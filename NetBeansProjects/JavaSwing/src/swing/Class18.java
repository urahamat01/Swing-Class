package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Class18 extends JFrame {
    
    private Container c;
    private JTextField tf1, tf2;
    private Font f;
    
    Class18() {
        initComponents();
        
    }
    
    public void initComponents() {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        
         f = new Font("Arial",Font.ITALIC + Font.BOLD,16);
         
         
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        tf1.setFont(f);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setText("Rahamat ullah");
        
        tf2.setBounds(50, 120, 200, 50);
        tf2.setFont(f);
        c.add(tf2);
        
    }
    
    public static void main(String[] args) {
        Class18 frame = new Class18();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Little programmer---");
        
    }

}
