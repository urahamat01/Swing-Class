/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.conn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RONY 1
 */
public class FromBasic extends javax.swing.JFrame {

    String fna, addr, coun, gend;
    String degree = " ";
    String gap = " ";
    JFileChooser fc;
    File dir;
    File file = null;
    DefaultTableModel model;

    /**
     * Creates new form FromBasic
     */
    public FromBasic() {
        initComponents();
        model = new DefaultTableModel();
        tblStudents.setModel(model);
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Country");
        model.addColumn("Gender");
        model.addColumn("Degree");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        cmdCountry = new javax.swing.JComboBox<>();
        rdMale = new javax.swing.JRadioButton();
        rdFemail = new javax.swing.JRadioButton();
        panDegree = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        panTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtShow = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDisplayArea = new javax.swing.JButton();
        btnDisplayTable = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblMsg = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Informatio\n");

        jLabel1.setText("jLabel1");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Students information J2EE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 153, 255))); // NOI18N

        jLabel2.setText("Name :");

        jLabel3.setText("Address :");

        jLabel4.setText("Country :");

        jLabel5.setText("Gender :");

        jLabel6.setText("Degree :");

        cmdCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Country", "Bangladesh", "India", "Button", "Maldib", "Silanka", "Myanmayer" }));

        gender.add(rdMale);
        rdMale.setText("Male");
        rdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdMaleActionPerformed(evt);
            }
        });

        gender.add(rdFemail);
        rdFemail.setText("Femail");

        jCheckBox1.setText("SSC");

        jCheckBox2.setText("HSC");

        jCheckBox3.setText("BBS");

        jCheckBox4.setText("J2EE");

        javax.swing.GroupLayout panDegreeLayout = new javax.swing.GroupLayout(panDegree);
        panDegree.setLayout(panDegreeLayout);
        panDegreeLayout.setHorizontalGroup(
            panDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDegreeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox4)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panDegreeLayout.setVerticalGroup(
            panDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDegreeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDegreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(panDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdFemail))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textName)
                                .addComponent(textAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(cmdCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmdCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdMale)
                    .addComponent(rdFemail))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Country", "Gender", "Degree"
            }
        ));
        tblStudents.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblStudentsAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        txtShow.setColumns(20);
        txtShow.setRows(5);
        jScrollPane2.setViewportView(txtShow);

        jLabel7.setText("Students List :");

        javax.swing.GroupLayout panTableLayout = new javax.swing.GroupLayout(panTable);
        panTable.setLayout(panTableLayout);
        panTableLayout.setHorizontalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
            .addGroup(panTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );
        panTableLayout.setVerticalGroup(
            panTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTableLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDisplayArea.setText("Display TextArea");
        btnDisplayArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAreaActionPerformed(evt);
            }
        });

        btnDisplayTable.setText("Display Table");
        btnDisplayTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayTableActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDisplayArea)
                .addGap(2, 2, 2)
                .addComponent(btnDisplayTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnDisplayArea)
                    .addComponent(btnDisplayTable)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(574, 574, 574)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdMaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
//save
        getAllRecord();

        if (textName.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "name is empaty ");
            textName.requestFocus();
        } else if (textAddress.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Address is empaty ");
            textAddress.requestFocus();
        } else {

            if (cmdCountry.getSelectedIndex() == 0) {

                JOptionPane.showMessageDialog(rootPane, "name is country");

                cmdCountry.requestFocus();
            } else {

                fc = new JFileChooser(dir);

                //add file fielter
                FileNameExtensionFilter fielter;

                fielter = new FileNameExtensionFilter("*.txt", new String[]{"txt"});
                fc.addChoosableFileFilter(fielter);
                int option = fc.showSaveDialog(this);

                if (option == JFileChooser.APPROVE_OPTION) {
                    dir = fc.getCurrentDirectory();
                    model.addRow(new Object[]{fna, addr, coun, gend, degree});
                    file = fc.getSelectedFile();
                    try {
                        writeAll();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    degree = "";

                }

            }

        }

        JOptionPane.showMessageDialog(rootPane, "name is empaty ");
        lblMsg.setText("Successfully Added into Table and Write to File");


    }//GEN-LAST:event_btnSaveActionPerformed
    public void getAllRecord() {
        fna = textName.getText();
        addr = textAddress.getText();
        coun = cmdCountry.getSelectedItem().toString();

        if (rdMale.isSelected()) {
            gend = "Male";
        } else {
            gend = "Femail";
        }
        for (int i = 0; i < panDegree.getComponentCount(); i++) {
            JCheckBox checkBox = (JCheckBox) panDegree.getComponent(i);

            if (checkBox.isSelected()) {

                degree += checkBox.getText();
                degree += gap;

            }
        }

    }

    private void writeAll() throws IOException {

        BufferedWriter buf = null;

        try {
            buf = new BufferedWriter(new FileWriter(file + getExtention(), true));
            buf.write(fna + "," + addr + "," + coun + "," + gend + "," + degree);
            buf.newLine();
            JOptionPane.showMessageDialog(rootPane, "Data Save");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (buf != null) {
                buf.close();

            }

        }
    }

    private String getExtention() {

        String ext = "";
        String extension = fc.getFileFilter().getDescription();

        if (extension.equals("*.txt")) {
            ext = ".txt";

        }
        return ext;

    }

    private void dispTArea() {

        FileInputStream fobj = null;
        fc = new JFileChooser(dir);
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            dir = fc.getCurrentDirectory();
            try {
                String str = "";
                fobj = new FileInputStream(file);
                int len = (int) file.length();
                for (int i = 0; i < len; i++) {
                    char str2 = 0;
                    try {
                        str2 = (char) fobj.read();
                        if (str2 == ',') {
                            str2 = '\t';

                        }
                    } catch (IOException e) {
                    }
                    str = str + str2;
                }
                txtShow.setText(str);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fobj != null) {
                        fobj.close();

                    }
                } catch (Exception e) {
                }

            }
        }
    }

    private void dispTable() {
        InputStream is = null;

        fc = new JFileChooser(dir);
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            dir = fc.getCurrentDirectory();
            try {
                File f = file;
                is = new FileInputStream(f);
                Scanner scan = new Scanner(is);
                String[] arr;
                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    if (line.indexOf(",") > 1) {
                        arr = line.split(",");

                    } else {
                        arr = line.split("\n");
                    }
                    Object[] data = new Object[arr.length];
                    for (int i = 0; i < data.length; i++) {
                        data[i] = arr[i];

                    }
                    model.addRow(data);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {

                try {
                    if (is != null) {

                        is.close();

                    }
                } catch (Exception e) {
                }

            }

        }

    }

    private void tblStudentsAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblStudentsAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tblStudentsAncestorAdded

    private void btnDisplayAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayAreaActionPerformed
        //call method
        dispTArea();
    }//GEN-LAST:event_btnDisplayAreaActionPerformed

    private void btnDisplayTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayTableActionPerformed
        dispTable();
    }//GEN-LAST:event_btnDisplayTableActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void clear() {
        textName.setText("");
        textAddress.setText("");
        cmdCountry.setSelectedIndex(0);
        lblMsg.setText("");
        degree = "";
        gender.clearSelection();
        for (int i = 0; i < panDegree.getComponentCount(); i++) {

            JCheckBox chechbox = (JCheckBox) panDegree.getComponent(i);
            if (chechbox.isSelected()) {
                chechbox.setSelected(false);

            }
        }
        if (tblStudents.getRowCount() > 0) {
            for (int i = tblStudents.getRowCount() - 1; i > -1; i--) {

                model.removeRow(i);
            }

        }
        txtShow.setText("");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromBasic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDisplayArea;
    private javax.swing.JButton btnDisplayTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmdCountry;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblMsg;
    private javax.swing.JPanel panDegree;
    private javax.swing.JPanel panTable;
    private javax.swing.JRadioButton rdFemail;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textName;
    private javax.swing.JTextArea txtShow;
    // End of variables declaration//GEN-END:variables
}
