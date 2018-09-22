/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class WetterWerteGui extends javax.swing.JFrame
{

    /**
     * Creates new form WetterWerteGui
     */
    public WetterWerteGui()
    {
        initComponents();
        liDisplay.setModel(bl);
    }

    private WetterModell bl = new WetterModell();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miSave = new javax.swing.JMenuItem();
        miLoad = new javax.swing.JMenuItem();
        miClose = new javax.swing.JMenuItem();
        lbData = new javax.swing.JLabel();
        plMainDisplay = new javax.swing.JPanel();
        plInput = new javax.swing.JPanel();
        lbTemperature = new javax.swing.JLabel();
        slTemperature = new javax.swing.JSlider();
        lbHumidity = new javax.swing.JLabel();
        slHumidity = new javax.swing.JSlider();
        btAdd = new javax.swing.JButton();
        plDisplay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        liDisplay = new javax.swing.JList<>();

        miSave.setText("Speichern");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miSave);

        miLoad.setText("Load");
        miLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLoadActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miLoad);

        miClose.setText("Exit");
        miClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCloseActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miClose);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(270, 450));
        setPreferredSize(new java.awt.Dimension(424, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onWinOpened(evt);
            }
        });

        lbData.setText("  Datei");
        lbData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbData.setComponentPopupMenu(jPopupMenu1);
        getContentPane().add(lbData, java.awt.BorderLayout.PAGE_START);

        plMainDisplay.setLayout(new java.awt.GridLayout(1, 2));

        plInput.setBorder(javax.swing.BorderFactory.createTitledBorder("Eingabe"));
        plInput.setLayout(new java.awt.GridLayout(6, 1));

        lbTemperature.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lbTemperature.setText("Temperatur: 10°");
        plInput.add(lbTemperature);

        slTemperature.setMaximum(40);
        slTemperature.setMinimum(-20);
        slTemperature.setPaintLabels(true);
        slTemperature.setPaintTicks(true);
        slTemperature.setToolTipText("1");
        slTemperature.setValue(10);
        slTemperature.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onTempChange(evt);
            }
        });
        plInput.add(slTemperature);

        lbHumidity.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lbHumidity.setText("Luftfeuchtigkeit: 50%");
        plInput.add(lbHumidity);

        slHumidity.setPaintLabels(true);
        slHumidity.setPaintTicks(true);
        slHumidity.setToolTipText("");
        slHumidity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onLuftChange(evt);
            }
        });
        plInput.add(slHumidity);

        btAdd.setText("Einfügen");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        plInput.add(btAdd);

        plMainDisplay.add(plInput);

        plDisplay.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Anzeige"));

        liDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(liDisplay);

        plDisplay.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        plMainDisplay.add(plDisplay);

        getContentPane().add(plMainDisplay, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onWinOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_onWinOpened
    {//GEN-HEADEREND:event_onWinOpened
        slTemperature.setMajorTickSpacing(10);
        slTemperature.setMinorTickSpacing(5);
        
        slHumidity.setMajorTickSpacing(20);
        slHumidity.setMinorTickSpacing(10);
    }//GEN-LAST:event_onWinOpened

    private void onTempChange(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_onTempChange
    {//GEN-HEADEREND:event_onTempChange
        lbTemperature.setText("Temperatur: "+slTemperature.getValue()+"°");
    }//GEN-LAST:event_onTempChange

    private void onLuftChange(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_onLuftChange
    {//GEN-HEADEREND:event_onLuftChange
        lbHumidity.setText("Temperatur: "+slHumidity.getValue()+"°");
    }//GEN-LAST:event_onLuftChange

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        bl.add(new WetterWerte(slTemperature.getValue(), slHumidity.getValue()) {
        });
    }//GEN-LAST:event_btAddActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        bl.save();
    }//GEN-LAST:event_miSaveActionPerformed

    private void miLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLoadActionPerformed
       bl.load();
    }//GEN-LAST:event_miLoadActionPerformed

    private void miCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_miCloseActionPerformed

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(WetterWerteGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(WetterWerteGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(WetterWerteGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(WetterWerteGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new WetterWerteGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbHumidity;
    private javax.swing.JLabel lbTemperature;
    private javax.swing.JList<String> liDisplay;
    private javax.swing.JMenuItem miClose;
    private javax.swing.JMenuItem miLoad;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JPanel plDisplay;
    private javax.swing.JPanel plInput;
    private javax.swing.JPanel plMainDisplay;
    private javax.swing.JSlider slHumidity;
    private javax.swing.JSlider slTemperature;
    // End of variables declaration//GEN-END:variables
}
