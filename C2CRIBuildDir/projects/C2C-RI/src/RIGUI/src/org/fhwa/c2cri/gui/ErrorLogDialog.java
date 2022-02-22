/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ErrorLogDialog.java
 *
 * Created on Aug 15, 2010, 3:07:47 AM
 */

package org.fhwa.c2cri.gui;

import java.util.ArrayList;

/**
 * The Class ErrorLogDialog represents the primary error log display presented to the user when a significant amount of information needs to be presented.
 *
 * @author TransCore ITS, LLC
 * Last Updated:  1/8/2014
 */
public class ErrorLogDialog extends javax.swing.JDialog {

    /** The ok pressed. */
    private boolean okPressed;
    
    /** The continue selected. */
    private boolean continueSelected;

    /**
     * Creates new form ErrorLogDialog.
     *
     * @param parent the parent
     * @param modal the modal
     */
    public ErrorLogDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        errorLogTextArea = new javax.swing.JTextArea();
        continueButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Test Configuration Error Log");

        errorLogTextArea.setColumns(20);
        errorLogTextArea.setEditable(false);
        errorLogTextArea.setRows(5);
        jScrollPane1.setViewportView(errorLogTextArea);

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(continueButton)
                .addGap(123, 123, 123)
                .addComponent(returnButton)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueButton)
                    .addComponent(returnButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Continue button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        continueSelected = true;
        setVisible(false); 
    }//GEN-LAST:event_continueButtonActionPerformed

    /**
     * Return button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        continueSelected = false;
        setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

        /**
         * Show dialog.
         * 
         * Pre-Conditions: N/A
         * Post-Conditions: N/A
         *
         * @return flag indicating whether the test configuration whether the user entered valid values
         * and clicked ok (true) or canceled (false)
         */
    public boolean showDialog() {
        okPressed = false;
        setVisible(true);
        return continueSelected;
    }

    /**
     * The main method.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ErrorLogDialog dialog = new ErrorLogDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

/**
 * Initialize.
 * 
 * Pre-Conditions: N/A
 * Post-Conditions: N/A
 *
 * @param errorContent the error content
 */
public void initialize(ArrayList<String> errorContent){
    for (String errorLine : errorContent){
        this.errorLogTextArea.append(errorLine+"\n");
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    /** The continue button. */
    private javax.swing.JButton continueButton;
    
    /** The error log text area. */
    private javax.swing.JTextArea errorLogTextArea;
    
    /** The j scroll pane1. */
    private javax.swing.JScrollPane jScrollPane1;
    
    /** The return button. */
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables

}