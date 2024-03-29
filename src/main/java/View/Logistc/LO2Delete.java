package View.Logistc;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import Utilities.AdExcel;
import java.io.File;
import java.util.ArrayList;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author juan.castro17
 */
public class LO2Delete extends javax.swing.JFrame {

    public LO2Delete() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Logístico");
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconLogiZOO.png"));
        this.setIconImage(faviconX1);
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));
        comboBoxDelete();
    }

    private void comboBoxDelete() {
        AdExcel excel = new AdExcel();
        File file = new File("rom/Supply.xlsx");
        if (file.exists()) {
            ArrayList<String> columns = excel.getColumn(file, 1);
            for (String column : columns) {
                ArrayList<String> types = new ArrayList();
                for (int i = 0; i < cbSupplies.getItemCount(); i++) {
                    types.add(cbSupplies.getItemAt(i));
                }
                if (!types.contains(column)) {
                    cbSupplies.addItem(column);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jbNameNewSupply = new javax.swing.JLabel();
        cbSupplies = new javax.swing.JComboBox<>();
        btDeleteSupply = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbNewSupplyTitle1 = new java.awt.Label();
        lbNewSupplyTitle2 = new java.awt.Label();
        lbAdvert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(320, 190));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(35, 35, 35));
        bg.setMaximumSize(new java.awt.Dimension(320, 190));
        bg.setMinimumSize(new java.awt.Dimension(320, 190));
        bg.setPreferredSize(new java.awt.Dimension(320, 190));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanelRound.setBackground(new java.awt.Color(51, 51, 51));
        bgPanelRound.setRoundBottomLeft(15);
        bgPanelRound.setRoundBottomRight(15);
        bgPanelRound.setRoundTopLeft(15);
        bgPanelRound.setRoundTopRight(15);
        bgPanelRound.setLayout(null);

        jbNameNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNameNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbNameNewSupply.setText("Nombre:");
        bgPanelRound.add(jbNameNewSupply);
        jbNameNewSupply.setBounds(10, 25, 70, 16);

        cbSupplies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        cbSupplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSuppliesActionPerformed(evt);
            }
        });
        bgPanelRound.add(cbSupplies);
        cbSupplies.setBounds(90, 20, 180, 22);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 70));

        btDeleteSupply.setBackground(new java.awt.Color(69, 106, 48));
        btDeleteSupply.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btDeleteSupply.setForeground(new java.awt.Color(242, 242, 242));
        btDeleteSupply.setText("-");
        btDeleteSupply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeleteSupply.setFocusPainted(false);
        btDeleteSupply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeleteSupplyMouseClicked(evt);
            }
        });
        btDeleteSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteSupplyActionPerformed(evt);
            }
        });
        btDeleteSupply.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btDeleteSupplyKeyTyped(evt);
            }
        });
        bg.add(btDeleteSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 50, 30));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2, 90, 45));

        lbNewSupplyTitle1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNewSupplyTitle1.setForeground(new java.awt.Color(255, 153, 0));
        lbNewSupplyTitle1.setText("Eliminar");
        bg.add(lbNewSupplyTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, -1));

        lbNewSupplyTitle2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNewSupplyTitle2.setForeground(new java.awt.Color(69, 106, 48));
        lbNewSupplyTitle2.setText("Suplemento");
        bg.add(lbNewSupplyTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, -1));

        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 30));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDeleteSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteSupplyActionPerformed
        if (cbSupplies.getSelectedItem().equals("Seleccionar...")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            File file = new File("rom/Supply.xlsx");
            String sheetName = "Supplys";
            AdExcel.deleteRow(cbSupplies.getSelectedItem().toString(), file, sheetName, 1);
            LO2 jf = new LO2();
            jf.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btDeleteSupplyActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        LO2 jf = new LO2();
        jf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btDeleteSupplyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btDeleteSupplyKeyTyped
        
    }//GEN-LAST:event_btDeleteSupplyKeyTyped

    private void btDeleteSupplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteSupplyMouseClicked

    }//GEN-LAST:event_btDeleteSupplyMouseClicked

    private void cbSuppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSuppliesActionPerformed
        
    }//GEN-LAST:event_cbSuppliesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {

        }
        java.awt.EventQueue.invokeLater(() -> {
            new LO2Delete().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btDeleteSupply;
    private javax.swing.JComboBox<String> cbSupplies;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jbNameNewSupply;
    private javax.swing.JLabel lbAdvert;
    private java.awt.Label lbNewSupplyTitle1;
    private java.awt.Label lbNewSupplyTitle2;
    private javax.swing.JLabel lbZooLogo;
    // End of variables declaration//GEN-END:variables
}
