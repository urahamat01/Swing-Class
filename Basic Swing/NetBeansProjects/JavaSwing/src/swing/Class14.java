
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Class14 extends JFrame{
    
    
    private Container c;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel lastLabel;
    private Font f;

    Class14() {
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.BOLD, 14);

        userLabel = new JLabel();
        userLabel.setText("Entered your name :");
        userLabel.setBounds(50, 20, 200, 80);
        userLabel.setFont(f);
        userLabel.setForeground(Color.red);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.green);
        c.add(userLabel);

        lastLabel = new JLabel();
        lastLabel.setText("Entered your last :");
        lastLabel.setBounds(50, 80, 200, 80);
        lastLabel.setFont(f);
        lastLabel.setForeground(Color.red);
        lastLabel.setOpaque(true);
        lastLabel.setBackground(Color.YELLOW);
        c.add(lastLabel);

        passLabel = new JLabel();
        passLabel.setText("Entered your password :");
        passLabel.setBounds(50, 140, 200, 80);
        passLabel.setFont(f);
        passLabel.setForeground(Color.red);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.blue);
        c.add(passLabel);
    }

    public static void main(String[] args) {
        Class14 frame = new Class14();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("12 CLASS HELLOW WOULD");
    }
    
    
    
}
