/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OptionsUI.java
 *
 * Created on Jul 8, 2010, 1:21:20 PM
 */

package org.fhwa.c2cri.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.text.html.HTMLEditorKit;
import org.fhwa.c2cri.gui.propertyeditor.Group;
import org.fhwa.c2cri.gui.propertyeditor.Parameter;
import org.fhwa.c2cri.utilities.RIParameters;

/**
 * The Class OptionsUI presents the c2c ri options dialog.
 *
 * @author TransCore ITS, LLC
 * Last Updated:  1/8/2014
 */
public class OptionsUI extends javax.swing.JDialog implements javax.swing.event.ListSelectionListener, Observer
{

//    private boolean okPressed;
    /** The tables. */
public  static JTable tables[];
    
    /** The j tp. */
    private static JTabbedPane jTp;
    
    /** The doc editor pane. */
    public static JEditorPane docEditorPane;
    
    /** The e panel. */
    private org.fhwa.c2cri.gui.propertyeditor.PropertyEditorPanel ePanel;
    
    /** The parameters modified. */
    private boolean parametersModified = false;
    
    /**
     * Creates new form OptionsUI.
     *
     * @param parent the parent
     * @param modal the modal
     */
    public OptionsUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("C2C RI Options");
        RIParameters.getInstance().configure();
        RIParameters.getInstance().eFile.addObserver(this);

        ePanel = new org.fhwa.c2cri.gui.propertyeditor.PropertyEditorPanel(cPane,RIParameters.getInstance().eFile);

	javax.swing.JPanel thePane = (javax.swing.JPanel) getContentPane();


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cPane = new javax.swing.JPanel();
        riParametersLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("RI Options"); // NOI18N

        cPane.setPreferredSize(new java.awt.Dimension(400, 400));
        cPane.setLayout(new java.awt.GridLayout(1, 0));

        riParametersLabel.setText("RI Parameters");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(riParametersLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(cPane, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(riParametersLabel)
                .addGap(18, 18, 18)
                .addComponent(cPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        saveButton.setText("Save");
        saveButton.setToolTipText("Save the current settings");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        doneButton.setText("Done");
        doneButton.setToolTipText("Close and save changes");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("Close without saving changes");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(saveButton)
                .addGap(42, 42, 42)
                .addComponent(doneButton)
                .addGap(56, 56, 56)
                .addComponent(cancelButton)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(doneButton)
                    .addComponent(cancelButton))
                .addGap(47, 47, 47))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

        jPanel1.getAccessibleContext().setAccessibleName("RI Options Panel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Save button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        RIParameters.getInstance().saveFile();
}//GEN-LAST:event_saveButtonActionPerformed

    /**
     * Cancel button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        if(parametersModified){
            int n = JOptionPane.showConfirmDialog(null,
		"The parameters have been modified.\n"+ 
		"Do you wish to cancel without saving?",
		"Cancel Confirmation",
		JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) setVisible(false);
        } else{
            setVisible(false);
        }
        
}//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Done button action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        RIParameters.getInstance().saveFile();
        setVisible(false);
    }//GEN-LAST:event_doneButtonActionPerformed

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
            @Override
            public void run() {
                OptionsUI dialog = new OptionsUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    /**
     * make the optionsUI dialog visible.
     */
    public void showDialog(){
        RIParameters.getInstance().configure();
        if (RIParameters.getInstance().eFile == null) {
                javax.swing.JOptionPane.showMessageDialog(null, "The properties file could not be processed.", "Properties File Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {

            System.out.println("*** Should be showing Properties Now ***");
            System.out.println("Looking for LogFile value =>"
                    + RIParameters.getInstance().getParameterValue("LogFile"));
            setVisible(true);
        }
}

    /* (non-Javadoc)
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void update(Observable o, Object arg) {
		if (RIParameters.getInstance().eFile.isModified())
                    parametersModified = true;
//                    setTitle("*Properties Editor (Edited)");
		else
                    parametersModified = false;
//			setTitle("Properties Editor");
	}

    /* (non-Javadoc)
     * @see javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.ListSelectionEvent)
     */
    @Override
    	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting())
			return;

		int i = jTp.getSelectedIndex();

		if (i == -1 || i > tables.length)
			return;

		JTable currentTable = tables[i];
		if (currentTable.getSelectedRowCount() < 1)
			return;

		Object value =
			currentTable.getValueAt(currentTable.getSelectedRow(), 1);
		if (value instanceof Parameter)
			docEditorPane.setText(
				"<div style='font-family: Arial; font-size:11pt'>"
					+ "<b>"
					+ ((Parameter) value).getName()
					+ "</b><br><br>"
					+ ((Parameter) value).getDoc()
					+ "</div>");
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cPane;
    protected javax.swing.JButton cancelButton;
    private javax.swing.JButton doneButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel riParametersLabel;
    protected javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

}
