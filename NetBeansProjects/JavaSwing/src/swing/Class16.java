
package swing;


import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Class16 extends JFrame {
    
    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;
   
  

    Class16() {
        initComponents();
    }

    public void initComponents() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
       
        img = new ImageIcon(getClass().getResource("name.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50,30,img.getIconHeight(),img.getIconWidth());
        c.add(imgLabel);
     
    }

    public static void main(String[] args) {
        Class16 frame = new Class16();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("12 CLASS HELLOW WOULD");
    }

    
    
    
}
