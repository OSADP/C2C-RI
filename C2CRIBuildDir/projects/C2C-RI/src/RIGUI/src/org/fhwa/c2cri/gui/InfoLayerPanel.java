
/*
 * InfoLayerPanel.java - Contains the InfoLayerPanel class which extends javax.swing.JPanel.
 *
 * Created on Feb 12, 2010, 7:44:02 PM
 */
package org.fhwa.c2cri.gui;

/**
 * The panel used by the user to specify Information Level parameters to be used for a test.
 * 
 * This class provides the view of the panel only.  Control of the panel is handled by an external
 * coordinator (control) class.
 *
 * @author TransCore ITS, LLC
 * Last Updated:  1/8/2014
 */
public class InfoLayerPanel extends javax.swing.JPanel {

    /** 
     * Creates new form InfoLayerPanel by calling initComponents.
     */
    public InfoLayerPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the panel.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectNeedPanel = new javax.swing.JPanel();
        selectNeedsScrollPane = new javax.swing.JScrollPane();
        standardNeedsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        needsClearOptionsButton = new javax.swing.JButton();
        testParametersPanel = new javax.swing.JPanel();
        parametersScrollPane = new javax.swing.JScrollPane();
        parametersTable = new javax.swing.JTable();
        selectRequirementsPanel = new javax.swing.JPanel();
        standardRequirementsScrollPane = new javax.swing.JScrollPane();
        standardRequirementsTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        requirementsClearAllButton = new javax.swing.JButton();

        selectNeedPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Need"));
        selectNeedPanel.setPreferredSize(new java.awt.Dimension(678, 154));

        selectNeedsScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        selectNeedsScrollPane.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        selectNeedsScrollPane.setAutoscrolls(true);
        selectNeedsScrollPane.setPreferredSize(new java.awt.Dimension(650, 72));

        standardNeedsTable.setAutoCreateRowSorter(true);
        standardNeedsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"2.3.1.1.1", "Need for Subscription Request", "M"},
                {"2.3.1.1.2", "Need to communicate DMS Inventory", "O"},
                {"2.3.1.1.3", "Need to provide CCTV Control", "M"},
                {"2.3.1.1.4", "Need to process FE Update", "O"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Need", "Need Text", "Project Requirements"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        standardNeedsTable.setToolTipText("Select Information layer standard needs.");
        standardNeedsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        standardNeedsTable.setFillsViewportHeight(true);
        standardNeedsTable.setName("InfoNeeds"); // NOI18N
        standardNeedsTable.setOpaque(false);
        standardNeedsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectNeedsScrollPane.setViewportView(standardNeedsTable);
        standardNeedsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        standardNeedsTable.getAccessibleContext().setAccessibleName("Infomration Layer Needs Table");

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 23));

        needsClearOptionsButton.setText("Clear Optional");
        needsClearOptionsButton.setToolTipText("De-select all optional Needs");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(needsClearOptionsButton)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(needsClearOptionsButton)
        );

        javax.swing.GroupLayout selectNeedPanelLayout = new javax.swing.GroupLayout(selectNeedPanel);
        selectNeedPanel.setLayout(selectNeedPanelLayout);
        selectNeedPanelLayout.setHorizontalGroup(
            selectNeedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectNeedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectNeedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectNeedsScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
                .addContainerGap())
        );
        selectNeedPanelLayout.setVerticalGroup(
            selectNeedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectNeedPanelLayout.createSequentialGroup()
                .addComponent(selectNeedsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        testParametersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Test Parameters"));
        testParametersPanel.setPreferredSize(new java.awt.Dimension(678, 99));

        parametersScrollPane.setPreferredSize(new java.awt.Dimension(452, 0));

        parametersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SubscriptionDelay", "The maximum time (in milliseconds to await a response", "1000"}
            },
            new String [] {
                "Parameter", "Description", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        parametersTable.setToolTipText("Set information layer standard parameters.");
        parametersTable.setFillsViewportHeight(true);
        parametersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        parametersScrollPane.setViewportView(parametersTable);
        parametersTable.getColumnModel().getColumn(0).setPreferredWidth(10);

        javax.swing.GroupLayout testParametersPanelLayout = new javax.swing.GroupLayout(testParametersPanel);
        testParametersPanel.setLayout(testParametersPanelLayout);
        testParametersPanelLayout.setHorizontalGroup(
            testParametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testParametersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parametersScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        testParametersPanelLayout.setVerticalGroup(
            testParametersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testParametersPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(parametersScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        selectRequirementsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Select Requirements"));
        selectRequirementsPanel.setPreferredSize(new java.awt.Dimension(678, 142));

        standardRequirementsScrollPane.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        standardRequirementsScrollPane.setPreferredSize(new java.awt.Dimension(452, 110));

        standardRequirementsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3.3.1.1.1", "Subscription Request", "M",  new Boolean(true)},
                {"3.3.1.1.2", "DMS Inventory", "O",  new Boolean(true)},
                {"3.3.1.1.3", "CCTV Control", "M",  new Boolean(true)},
                {"3.3.1.1.4", "FE Update", "O", null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Requirement", "Description", "Project Requirements", "Selected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        standardRequirementsTable.setToolTipText("Selection information layer standard requirements.");
        standardRequirementsTable.setFillsViewportHeight(true);
        standardRequirementsTable.setMinimumSize(new java.awt.Dimension(60, 60));
        standardRequirementsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        standardRequirementsScrollPane.setViewportView(standardRequirementsTable);
        standardRequirementsTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        standardRequirementsTable.getAccessibleContext().setAccessibleName("Information Layer Requirements Table");

        jPanel2.setPreferredSize(new java.awt.Dimension(100, 23));

        requirementsClearAllButton.setText("Clear Optional");
        requirementsClearAllButton.setToolTipText("De-select all optional Requirements");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(requirementsClearAllButton)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(requirementsClearAllButton)
        );

        javax.swing.GroupLayout selectRequirementsPanelLayout = new javax.swing.GroupLayout(selectRequirementsPanel);
        selectRequirementsPanel.setLayout(selectRequirementsPanelLayout);
        selectRequirementsPanelLayout.setHorizontalGroup(
            selectRequirementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectRequirementsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectRequirementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(standardRequirementsScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
                .addContainerGap())
        );
        selectRequirementsPanelLayout.setVerticalGroup(
            selectRequirementsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectRequirementsPanelLayout.createSequentialGroup()
                .addComponent(standardRequirementsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectRequirementsPanel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectNeedPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(testParametersPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(selectNeedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectRequirementsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(testParametersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    protected javax.swing.JButton needsClearOptionsButton;
    protected javax.swing.JScrollPane parametersScrollPane;
    protected javax.swing.JTable parametersTable;
    protected javax.swing.JButton requirementsClearAllButton;
    private javax.swing.JPanel selectNeedPanel;
    private javax.swing.JScrollPane selectNeedsScrollPane;
    private javax.swing.JPanel selectRequirementsPanel;
    protected javax.swing.JTable standardNeedsTable;
    private javax.swing.JScrollPane standardRequirementsScrollPane;
    protected javax.swing.JTable standardRequirementsTable;
    private javax.swing.JPanel testParametersPanel;
    // End of variables declaration//GEN-END:variables
}
