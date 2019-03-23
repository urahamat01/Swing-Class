package swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Class25 extends JFrame {
    
    private Container c;
    private JPasswordField pf;
    
    Class25() {
        initComponents();
        
    }
    
    public void initComponents() {
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(50, 20, 150, 50);
        c.add(pf);
    }
    
    public static void main(String[] args) {
        Class25 frame = new Class25();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("JTextField Demo");
    }
    
}
