package View.Administrative;

import static Utilities.AdExcel.deleteRow;
import static Utilities.AdExcel.getRow;
import static Utilities.AdExcel.rowToVector;
import Utilities.loadExcelDataToTable;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author juan.castro17
 */
public class AD3 extends javax.swing.JFrame {

    File file = new File("rom/Plans/Plans.xlsx");

    public AD3() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Planes");

        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconAdminZOO.png"));
        this.setIconImage(faviconX1);

        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/ZRVC@3x.png"));
        lbZRVLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZRVLogo.getWidth(), lbZRVLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZoo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZoo.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        enableDeleteButton();

    }

    private void enableDeleteButton() {
        if (!txSpecificationsPlan.getText().equals("")) {
            btDeletePlan.setEnabled(true);
        } else {
            btDeletePlan.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlans = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txSpecificationsPlan = new javax.swing.JTextArea();
        lbShowPlans = new java.awt.Label();
        lbDisplayPlanName = new java.awt.Label();
        btDeletePlan = new javax.swing.JButton();
        lbSpecificationsPlan1 = new java.awt.Label();
        lbPlanPrice = new java.awt.Label();
        txSearchPlans = new javax.swing.JTextField();
        lbSearchPlans = new java.awt.Label();
        lbPlansTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        btSearchPlan = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        btAddPlan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(35, 35, 35));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanelRound.setBackground(new java.awt.Color(51, 51, 51));
        bgPanelRound.setRoundBottomLeft(15);
        bgPanelRound.setRoundBottomRight(15);
        bgPanelRound.setRoundTopLeft(15);
        bgPanelRound.setRoundTopRight(15);
        bgPanelRound.setLayout(null);

        tbPlans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Plan", "Valor", "Especificaciones"
            }
        ));
        jScrollPane1.setViewportView(tbPlans);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 35, 680, 200);

        txSpecificationsPlan.setEditable(false);
        txSpecificationsPlan.setColumns(20);
        txSpecificationsPlan.setLineWrap(true);
        txSpecificationsPlan.setRows(5);
        txSpecificationsPlan.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txSpecificationsPlan);

        bgPanelRound.add(jScrollPane2);
        jScrollPane2.setBounds(10, 290, 680, 50);

        lbShowPlans.setBackground(new java.awt.Color(51, 51, 51));
        lbShowPlans.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbShowPlans.setForeground(new java.awt.Color(255, 255, 255));
        lbShowPlans.setText("Planes existentes");
        bgPanelRound.add(lbShowPlans);
        lbShowPlans.setBounds(10, 0, 296, 32);

        lbDisplayPlanName.setBackground(new java.awt.Color(51, 51, 51));
        lbDisplayPlanName.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbDisplayPlanName.setForeground(new java.awt.Color(255, 255, 255));
        bgPanelRound.add(lbDisplayPlanName);
        lbDisplayPlanName.setBounds(10, 240, 440, 50);

        btDeletePlan.setBackground(new java.awt.Color(51, 51, 51));
        btDeletePlan.setForeground(new java.awt.Color(255, 255, 255));
        btDeletePlan.setText("Eliminar Plan");
        btDeletePlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletePlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletePlanActionPerformed(evt);
            }
        });
        bgPanelRound.add(btDeletePlan);
        btDeletePlan.setBounds(560, 355, 130, 23);

        lbSpecificationsPlan1.setBackground(new java.awt.Color(51, 51, 51));
        lbSpecificationsPlan1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSpecificationsPlan1.setForeground(new java.awt.Color(255, 255, 255));
        lbSpecificationsPlan1.setText("Especificaciones del plan");
        bgPanelRound.add(lbSpecificationsPlan1);
        lbSpecificationsPlan1.setBounds(460, 250, 230, 32);

        lbPlanPrice.setBackground(new java.awt.Color(51, 51, 51));
        lbPlanPrice.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbPlanPrice.setForeground(new java.awt.Color(255, 153, 0));
        bgPanelRound.add(lbPlanPrice);
        lbPlanPrice.setBounds(10, 340, 230, 50);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 390));
        bg.add(txSearchPlans, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 340, -1));

        lbSearchPlans.setBackground(new java.awt.Color(35, 35, 35));
        lbSearchPlans.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSearchPlans.setForeground(new java.awt.Color(255, 255, 255));
        lbSearchPlans.setText("ID del Plan");
        bg.add(lbSearchPlans, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lbPlansTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbPlansTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbPlansTitle.setForeground(new java.awt.Color(255, 153, 0));
        lbPlansTitle.setText("Planes");
        bg.add(lbPlansTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        btSearchPlan.setText("Buscar");
        btSearchPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearchPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchPlanActionPerformed(evt);
            }
        });
        bg.add(btSearchPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, 20));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));

        btAddPlan.setBackground(new java.awt.Color(51, 51, 51));
        btAddPlan.setForeground(new java.awt.Color(255, 255, 255));
        btAddPlan.setText("+");
        btAddPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPlanActionPerformed(evt);
            }
        });
        bg.add(btAddPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 30, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS1 MainScreen = new IS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btAddPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPlanActionPerformed
        PAAdd ReportWindow = new PAAdd();
        ReportWindow.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btAddPlanActionPerformed

    private void btDeletePlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletePlanActionPerformed
        String planId = txSearchPlans.getText();
        txSpecificationsPlan.setText("");
        txSearchPlans.setText("");
        lbPlanPrice.setText("");
        lbDisplayPlanName.setText("");
        deleteRow(planId, file, "Plans", 0);
        loadExcelDataToTable.updateTableFromExcel(tbPlans, file);
        enableDeleteButton();
    }//GEN-LAST:event_btDeletePlanActionPerformed

    private void btSearchPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchPlanActionPerformed
        String planId = txSearchPlans.getText();

        if ("".equals(planId)) {
            lbDisplayPlanName.setText("Digite un ID");
        } else {
            Row row = getRow(planId, file, "Plans", 0);
            if (row == null) {
                lbDisplayPlanName.setText("ID no existe");
            } else {
                String[] vector = rowToVector(row);
                lbDisplayPlanName.setText(vector[1]);
                lbPlanPrice.setText("$" + vector[2]);
                txSpecificationsPlan.setText(vector[3]);
            }

        }

        enableDeleteButton();
    }//GEN-LAST:event_btSearchPlanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AD3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddPlan;
    private javax.swing.JButton btDeletePlan;
    private javax.swing.JButton btSearchPlan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lbDisplayPlanName;
    private java.awt.Label lbPlanPrice;
    private java.awt.Label lbPlansTitle;
    private java.awt.Label lbSearchPlans;
    private java.awt.Label lbShowPlans;
    private java.awt.Label lbSpecificationsPlan1;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    public static javax.swing.JTable tbPlans;
    private javax.swing.JTextField txSearchPlans;
    private javax.swing.JTextArea txSpecificationsPlan;
    // End of variables declaration//GEN-END:variables
}
