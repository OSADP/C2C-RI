/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.fhwa.c2cri.ntcip2306v109.wsdl.OperationSpecification;
import org.fhwa.c2cri.ntcip2306v109.wsdl.RIWSDL;


/**
 * The Class TestNTCIP2306OperationGUI.
 *
 * @author TransCore ITS, LLC
 * Last Updated:  1/8/2014
 */
public class TestNTCIP2306OperationGUI extends javax.swing.JFrame {

    /** The op spec list. */
    ArrayList<OperationSpecification> opSpecList = new ArrayList();
    
    /** The wsdl. */
    RIWSDL theWSDL = null;

    /**
     * Creates new form TestNTCIP2306OperationGUI.
     */
    public TestNTCIP2306OperationGUI() {
        initComponents();
        this.jOperationList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.jOperationList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getFirstIndex() >= 0) {
                    TestNTCIP2306OperationGUI.this.jOperationTextArea.setText(opSpecList.get(e.getFirstIndex()).toString());
                }
            }
        });

        this.jFilterComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateOperationList();
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCenterModeComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jWSDLFileTextField = new javax.swing.JTextField();
        jWSDLFileChooserButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jFilterComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jOperationList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jOperationTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jOpMessageFileTextField = new javax.swing.JTextField();
        jOpMessageFileChooserButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jStartButton = new javax.swing.JButton();
        jStopButton = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPubOperationList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jPubMessageFileTextField = new javax.swing.JTextField();
        jPubMessageChooserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCenterModeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EC", "OC" }));

        jLabel1.setText("Center Mode");

        jLabel2.setText("WSDL File");

        jWSDLFileTextField.setText("jTextField1");

        jWSDLFileChooserButton.setText("...");
        jWSDLFileChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWSDLFileChooserButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Operation Filter");

        jFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "SOAP-RR", "SOAP-SP", "HTTP-Post", "HTTP-Get", "FTP-Get" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jCenterModeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jWSDLFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jWSDLFileChooserButton)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addComponent(jFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCenterModeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jWSDLFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWSDLFileChooserButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Operations: ");

        jOperationList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jOperationList);

        jOperationTextArea.setColumns(20);
        jOperationTextArea.setRows(5);
        jScrollPane2.setViewportView(jOperationTextArea);

        jLabel6.setText("Message File: ");

        jOpMessageFileTextField.setText("jTextField2");

        jOpMessageFileChooserButton.setText("...");
        jOpMessageFileChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpMessageFileChooserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jOpMessageFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jOpMessageFileChooserButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jOpMessageFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOpMessageFileChooserButton))
                .addContainerGap())
        );

        jStartButton.setText("Start");

        jStopButton.setText("Stop");

        jExitButton.setText("Exit");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jStartButton)
                .addGap(48, 48, 48)
                .addComponent(jStopButton)
                .addGap(31, 31, 31)
                .addComponent(jExitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStopButton)
                    .addComponent(jStartButton)
                    .addComponent(jExitButton))
                .addGap(36, 36, 36))
        );

        jLabel5.setText("Publications:");

        jPubOperationList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jPubOperationList);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        jLabel7.setText("Message File: ");

        jPubMessageFileTextField.setText("jTextField3");

        jPubMessageChooserButton.setText("...");
        jPubMessageChooserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPubMessageChooserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPubMessageFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPubMessageChooserButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPubMessageFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPubMessageChooserButton))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * J wsdl file chooser button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void jWSDLFileChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWSDLFileChooserButtonActionPerformed
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();

        int returnVal = fc.showOpenDialog(TestNTCIP2306OperationGUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            this.jWSDLFileTextField.setText(file.getPath());
            updateOperationList();

        }

    }//GEN-LAST:event_jWSDLFileChooserButtonActionPerformed

    /**
     * Update operation list.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     */
    private void updateOperationList() {
        try {
            URL tmpURL = new File(this.jWSDLFileTextField.getText()).toURI().toURL();
            theWSDL = new RIWSDL(tmpURL.toString());
            ArrayList<String> operationList = new ArrayList();
            if (((String) this.jFilterComboBox.getSelectedItem()).equals("None")) {
                opSpecList = theWSDL.getAllOperationSpecifications();
            } else if (((String) this.jFilterComboBox.getSelectedItem()).equals("SOAP-RR")) {
                opSpecList.clear();
                for (OperationSpecification opSpec : theWSDL.getAllOperationSpecifications()) {
                    if (opSpec.getOperationInputEncoding().contains("SOAP") && opSpec.isRequestResponseOperation()) {
                        opSpecList.add(opSpec);
                    }
                }

            } else if (((String) this.jFilterComboBox.getSelectedItem()).equals("SOAP-SP")) {
                opSpecList.clear();
                for (OperationSpecification opSpec : theWSDL.getAllOperationSpecifications()) {
                    if (opSpec.getOperationInputEncoding().contains("SOAP") && opSpec.isSubscriptionOperation()) {
                        opSpecList.add(opSpec);
                    } else {
                        System.out.println("Rejected : "+opSpec.getOperationName() + " with encoding "+opSpec.getOperationInputEncoding());
                    }
                }

            } else if (((String) this.jFilterComboBox.getSelectedItem()).equals("HTTP-Post")) {
                opSpecList.clear();
                for (OperationSpecification opSpec : theWSDL.getAllOperationSpecifications()) {
                    if (!opSpec.getOperationInputEncoding().contains("SOAP") && opSpec.isRequestResponseOperation()) {
                        opSpecList.add(opSpec);
                    } else {
                        System.out.println("Rejected : "+opSpec.getOperationName() + " with encoding "+opSpec.getOperationInputEncoding());
                    }
                }
            } else if (((String) this.jFilterComboBox.getSelectedItem()).equals("HTTP-Get")) {
                opSpecList.clear();
                for (OperationSpecification opSpec : theWSDL.getAllOperationSpecifications()) {
                    if (opSpec.getOperationInputEncoding().equals("") && opSpec.isGetOperation()) {
                        opSpecList.add(opSpec);
                    } else {
                        System.out.println("Rejected : "+opSpec.getOperationName() + " with encoding "+opSpec.getOperationInputEncoding());
                    }
                }
            } else if (((String) this.jFilterComboBox.getSelectedItem()).equals("FTP-Get")) {
                opSpecList.clear();
                for (OperationSpecification opSpec : theWSDL.getAllOperationSpecifications()) {
                    if (opSpec.getOperationType().contains("FTP")&&opSpec.isGetOperation()) {
                        opSpecList.add(opSpec);
                    } else {
                        System.out.println("Rejected : "+opSpec.getOperationName() + " with operationType "+opSpec.getOperationType());
                    }
                }
            }

            for (OperationSpecification opSpec : opSpecList) {
                operationList.add(opSpec.getOperationName());
            }
            this.jOperationList.setListData(operationList.toArray());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    /**
     * J op message file chooser button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void jOpMessageFileChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpMessageFileChooserButtonActionPerformed
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();

        int returnVal = fc.showOpenDialog(TestNTCIP2306OperationGUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            this.jOpMessageFileTextField.setText(file.getPath());
        }

    }//GEN-LAST:event_jOpMessageFileChooserButtonActionPerformed

    /**
     * J pub message chooser button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void jPubMessageChooserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPubMessageChooserButtonActionPerformed
        //Create a file chooser
        final JFileChooser fc = new JFileChooser();

        int returnVal = fc.showOpenDialog(TestNTCIP2306OperationGUI.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            this.jPubMessageFileTextField.setText(file.getPath());
        }

    }//GEN-LAST:event_jPubMessageChooserButtonActionPerformed

    /**
     * The main method.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestNTCIP2306OperationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestNTCIP2306OperationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestNTCIP2306OperationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestNTCIP2306OperationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestNTCIP2306OperationGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    /** The j center mode combo box. */
    private javax.swing.JComboBox jCenterModeComboBox;
    
    /** The j exit button. */
    private javax.swing.JButton jExitButton;
    
    /** The j filter combo box. */
    private javax.swing.JComboBox jFilterComboBox;
    
    /** The j label1. */
    private javax.swing.JLabel jLabel1;
    
    /** The j label2. */
    private javax.swing.JLabel jLabel2;
    
    /** The j label3. */
    private javax.swing.JLabel jLabel3;
    
    /** The j label4. */
    private javax.swing.JLabel jLabel4;
    
    /** The j label5. */
    private javax.swing.JLabel jLabel5;
    
    /** The j label6. */
    private javax.swing.JLabel jLabel6;
    
    /** The j label7. */
    private javax.swing.JLabel jLabel7;
    
    /** The j op message file chooser button. */
    private javax.swing.JButton jOpMessageFileChooserButton;
    
    /** The j op message file text field. */
    private javax.swing.JTextField jOpMessageFileTextField;
    
    /** The j operation list. */
    private javax.swing.JList jOperationList;
    
    /** The j operation text area. */
    private javax.swing.JTextArea jOperationTextArea;
    
    /** The j panel1. */
    private javax.swing.JPanel jPanel1;
    
    /** The j panel2. */
    private javax.swing.JPanel jPanel2;
    
    /** The j panel3. */
    private javax.swing.JPanel jPanel3;
    
    /** The j panel4. */
    private javax.swing.JPanel jPanel4;
    
    /** The j pub message chooser button. */
    private javax.swing.JButton jPubMessageChooserButton;
    
    /** The j pub message file text field. */
    private javax.swing.JTextField jPubMessageFileTextField;
    
    /** The j pub operation list. */
    private javax.swing.JList jPubOperationList;
    
    /** The j scroll pane1. */
    private javax.swing.JScrollPane jScrollPane1;
    
    /** The j scroll pane2. */
    private javax.swing.JScrollPane jScrollPane2;
    
    /** The j scroll pane3. */
    private javax.swing.JScrollPane jScrollPane3;
    
    /** The j scroll pane4. */
    private javax.swing.JScrollPane jScrollPane4;
    
    /** The j start button. */
    private javax.swing.JButton jStartButton;
    
    /** The j stop button. */
    private javax.swing.JButton jStopButton;
    
    /** The j text area2. */
    private javax.swing.JTextArea jTextArea2;
    
    /** The j wsdl file chooser button. */
    private javax.swing.JButton jWSDLFileChooserButton;
    
    /** The j wsdl file text field. */
    private javax.swing.JTextField jWSDLFileTextField;
    // End of variables declaration//GEN-END:variables
}