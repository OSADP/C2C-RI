
/*
 * ConfigurationBasePanel.java
 *
 * Created on Jan 24, 2010, 11:35:57 PM
 */
package org.fhwa.c2cri.gui;

import javax.swing.event.TreeSelectionEvent;

/**
 * Main Panel for managing the configuration settings.  It serves as a container
 * for other configuration definition tab panels.  It also contains the Save, Ok, and Cancel
 * button controls.
 *
 * @author TransCore ITS, LLC
 * Last Updated:  1/8/2014
 */
public class ConfigurationBasePanel extends javax.swing.JPanel implements javax.swing.event.TreeSelectionListener {

    /** the configuration panel tab. */
    protected ConfigurationPanel configPanel;
    
    /** the SUT panel tab. */
    protected SUTPanel sutPanel;
    
    /** the InfoLayerPanel tab. */
    protected InfoLayerPanel infoPanel;
    
    /** the AppLayerPanel tab. */
    protected AppLayerPanel appPanel;
    
    /** the InfoLayer Test Case Panel tab. */
    protected InfoLayerTestCasePanel infoTestCasePanel;
    
    /** the AppLayer Test Case Panel tab. */
    protected AppLayerTestCasePanel appTestCasePanel;

    /** the Emulation Parameters Panel tab. */
    protected EmulationParametersPanel emulationParametersPanel;

    /** 
     * Creates new form ConfigurationBasePanel.
     *
     * First initialize the ConfigurationBasePanel.  Then create new instances
     * of the config, log, sut, info and app panels.  Add the new panels to the
     * ConfigurationBasePanel subPanel as Tabs.  Set the SubPanel to be visible, but
     * make teh ConfigurationBasePanel invisible.
     */
    public ConfigurationBasePanel() {
        initComponents();

        this.configPanel = new ConfigurationPanel();
        this.sutPanel = new SUTPanel();
        this.infoPanel = new InfoLayerPanel();
        this.appPanel = new AppLayerPanel();
        this.infoTestCasePanel = new InfoLayerTestCasePanel();
        this.appTestCasePanel = new AppLayerTestCasePanel();
        this.emulationParametersPanel = new EmulationParametersPanel();

        this.configurationSubPanel.addTab("Configuration", null,configPanel,"Basic Configuration File Settings.");
        this.configurationSubPanel.addTab("System Under Test", null,sutPanel, " SUT Parameters");
        this.configurationSubPanel.addTab("Information Layer Parameters", null,infoPanel,"Information Layer Standard NRTM");
        this.configurationSubPanel.addTab("Application Layer Parameters", null,appPanel, "Application Layer Standard NRTM");
        this.configurationSubPanel.addTab("Information Layer Test Cases", null,infoTestCasePanel, "Information Layer Standard Test Cases");
        this.configurationSubPanel.addTab("Application Layer Test Cases", null,appTestCasePanel, "Application Layer Standard Test Cases");
        this.configurationSubPanel.addTab("Entity Emulation Parameters", null,emulationParametersPanel, "Entity Emulation Parameters");
        this.configurationSubPanel.setVisible(true);
        this.setVisible(false);


    }
    
    /* (non-Javadoc)
     * @see javax.swing.event.TreeSelectionListener#valueChanged(javax.swing.event.TreeSelectionEvent)
     */
    @Override
    public void valueChanged(TreeSelectionEvent e) {
         ConfigurationTreeNode node = (ConfigurationTreeNode)
                           this.configurationTree.getLastSelectedPathComponent();

        if (node == null) return;

        Object nodeInfo = node.getUserObject();
        if (node.isLeaf()) {
            String panelName = (String)nodeInfo;
            if (panelName.equals("Configuration Panel")){
                this.configurationSubPanel.setSelectedComponent(configPanel);
            } else if (panelName.equals("SUT Panel")){
                this.configurationSubPanel.setSelectedComponent(sutPanel);
             } else if (panelName.equals("Information Layer Panel")){
                this.configurationSubPanel.setSelectedComponent(infoPanel);
            } else if (panelName.equals("Application Layer Panel")){
                this.configurationSubPanel.setSelectedComponent(appPanel);
             } else if (panelName.equals("Information Layer Test Cases")){
                this.configurationSubPanel.setSelectedComponent(infoTestCasePanel);
            } else if (panelName.equals("Application Layer Test Cases")){
                this.configurationSubPanel.setSelectedComponent(appTestCasePanel);
            } else if (panelName.equals("Entity Emulation Parameters")){
                this.configurationSubPanel.setSelectedComponent(emulationParametersPanel);
           }
        }
    }

    /** This method is called from within the constructor to
     * initialize the panel.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        navigationPane = new javax.swing.JScrollPane();
        configurationTree = new javax.swing.JTree();
        jScrollPane1 = new javax.swing.JScrollPane();
        configurationSubPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        validateConfigurationButton = new javax.swing.JButton();
        saveAsButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setAutoscrolls(true);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(652, 388));
        setPreferredSize(new java.awt.Dimension(652, 488));

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(400, 138));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(400, 134));

        navigationPane.setFocusable(false);

        configurationTree.setMaximumSize(new java.awt.Dimension(144, 128));
        configurationTree.setPreferredSize(new java.awt.Dimension(148, 128));
        navigationPane.setViewportView(configurationTree);
        configurationTree.getAccessibleContext().setAccessibleName("Configuration Panel List");
        configurationTree.getAccessibleContext().setAccessibleDescription("");

        jSplitPane1.setLeftComponent(navigationPane);

        configurationSubPanel.setBackground(new java.awt.Color(204, 204, 204));
        configurationSubPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        configurationSubPanel.setMaximumSize(new java.awt.Dimension(900, 900));
        configurationSubPanel.setMinimumSize(new java.awt.Dimension(650, 386));
        configurationSubPanel.setPreferredSize(new java.awt.Dimension(620, 420));
        jScrollPane1.setViewportView(configurationSubPanel);

        jSplitPane1.setRightComponent(jScrollPane1);

        jPanel1.setFocusable(false);

        validateConfigurationButton.setText("Validate");
        validateConfigurationButton.setToolTipText("Validate current configuration settings");

        saveAsButton.setText("Save As");
        saveAsButton.setToolTipText("Save current settings with different file name");

        saveButton.setText("Save");
        saveButton.setToolTipText("Save current settings");

        okButton.setText("Close");
        okButton.setToolTipText("Save changes and close");

        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("Cancel without saving changes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(validateConfigurationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(saveAsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(validateConfigurationButton)
                        .addComponent(saveAsButton))
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton cancelButton;
    protected javax.swing.JTabbedPane configurationSubPanel;
    protected javax.swing.JTree configurationTree;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    protected javax.swing.JScrollPane navigationPane;
    protected javax.swing.JButton okButton;
    protected javax.swing.JButton saveAsButton;
    protected javax.swing.JButton saveButton;
    protected javax.swing.JButton validateConfigurationButton;
    // End of variables declaration//GEN-END:variables
}
