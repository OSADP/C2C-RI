/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PDFViewUI.java
 *
 * Created on Jul 12, 2010, 5:25:53 PM
 */

package org.fhwa.c2cri.gui;

import javax.swing.JDialog;
import javax.swing.JPanel;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 * The Class PDFViewUI provides the PDV View capability.
 *
 * @author TransCore ITS, LLC
 * Last Updated:  1/8/2014
 */
public class PDFViewUI extends javax.swing.JDialog {

    /** The controller. */
    private SwingController controller;

    /**
     * Creates new form PDFViewUI.
     *
     * @param parent the parent
     * @param modal the modal
     */
    public PDFViewUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new SwingController();

        SwingViewBuilder factory = new SwingViewBuilder(controller);

        JPanel viewerComponentPanel = factory.buildViewerPanel();


        this.setSize(700, 500);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.getContentPane().add(viewerComponentPanel);


    }

    /**
     * Show display.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param report the report
     * @return true, if successful
     */
    public boolean showDisplay(String report){

        // Now that the GUI is all in place, we can try openning a PDF
        controller.openDocument(report);

        // show the component
        this.pack();
        this.setVisible(true);
        return true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("C2C RI Report Viewer");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jMenu1.setText("File");

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);
        jMenu1.setMnemonic(java.awt.event.KeyEvent.VK_F);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit menu item action performed.
     * 
     * Pre-Conditions: N/A
     * Post-Conditions: N/A
     *
     * @param evt the evt
     */
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        setVisible(false);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
                PDFViewUI dialog = new PDFViewUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /** The exit menu item. */
    private javax.swing.JMenuItem exitMenuItem;
    
    /** The j menu1. */
    private javax.swing.JMenu jMenu1;
    
    /** The j menu bar1. */
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}