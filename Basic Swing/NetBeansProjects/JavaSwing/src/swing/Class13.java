/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author RONY 1
 */
public class Class13 extends JFrame {

    private Container c;
    private JLabel userLabel;
    private JLabel passLabel;
    private JLabel lastLabel;
    private Font f;

    Class13() {
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
        c.add(userLabel);

        lastLabel = new JLabel();
        lastLabel.setText("Entered your name :");
        lastLabel.setBounds(50, 50, 200, 80);
        lastLabel.setFont(f);
        c.add(lastLabel);

        passLabel = new JLabel();
        passLabel.setText("Entered your password :");
        passLabel.setBounds(50, 80, 200, 80);
        passLabel.setFont(f);
        c.add(passLabel);
    }

    public static void main(String[] args) {
        Class13 frame = new Class13();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("12 CLASS HELLOW WOULD");
    }

}
