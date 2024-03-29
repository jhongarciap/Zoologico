package View.Administrative;

import Control.AdministrativeDepartment.ArrayListPlan;
import Model.Plan;
import Utilities.Checker;
import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author juan.castro17
 */
public class PAAdd extends javax.swing.JFrame {

    ArrayListPlan plans = new ArrayListPlan();

    public PAAdd() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Añadir plan");
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconAdminZOO.png"));
        this.setIconImage(faviconX1);
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        lbPlan = new javax.swing.JLabel();
        txValue = new javax.swing.JTextField();
        lbValue = new javax.swing.JLabel();
        lbDetails = new javax.swing.JLabel();
        txDetails = new javax.swing.JScrollPane();
        txPlanDetail = new javax.swing.JTextArea();
        txPlanName = new javax.swing.JTextField();
        btLogisticPlan = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbPlanTitle = new java.awt.Label();
        lbAdvert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(320, 370));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(35, 35, 35));
        bg.setMaximumSize(new java.awt.Dimension(320, 370));
        bg.setMinimumSize(new java.awt.Dimension(320, 370));
        bg.setPreferredSize(new java.awt.Dimension(320, 370));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanelRound.setBackground(new java.awt.Color(51, 51, 51));
        bgPanelRound.setRoundBottomLeft(15);
        bgPanelRound.setRoundBottomRight(15);
        bgPanelRound.setRoundTopLeft(15);
        bgPanelRound.setRoundTopRight(15);
        bgPanelRound.setLayout(null);

        lbPlan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbPlan.setForeground(new java.awt.Color(242, 242, 242));
        lbPlan.setText("Plan:");
        bgPanelRound.add(lbPlan);
        lbPlan.setBounds(10, 10, 70, 16);

        txValue.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txValueActionPerformed(evt);
            }
        });
        bgPanelRound.add(txValue);
        txValue.setBounds(80, 40, 190, 22);

        lbValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbValue.setForeground(new java.awt.Color(242, 242, 242));
        lbValue.setText("Valor:");
        bgPanelRound.add(lbValue);
        lbValue.setBounds(10, 40, 70, 16);

        lbDetails.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbDetails.setForeground(new java.awt.Color(242, 242, 242));
        lbDetails.setText("Especificaciones:");
        bgPanelRound.add(lbDetails);
        lbDetails.setBounds(10, 73, 170, 16);

        txPlanDetail.setColumns(20);
        txPlanDetail.setLineWrap(true);
        txPlanDetail.setRows(5);
        txPlanDetail.setWrapStyleWord(true);
        txDetails.setViewportView(txPlanDetail);

        bgPanelRound.add(txDetails);
        txDetails.setBounds(10, 100, 260, 150);

        txPlanName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txPlanName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPlanNameActionPerformed(evt);
            }
        });
        bgPanelRound.add(txPlanName);
        txPlanName.setBounds(80, 10, 190, 22);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 260));

        btLogisticPlan.setBackground(new java.awt.Color(255, 153, 0));
        btLogisticPlan.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btLogisticPlan.setForeground(new java.awt.Color(242, 242, 242));
        btLogisticPlan.setText("+");
        btLogisticPlan.setActionCommand("Añadir");
        btLogisticPlan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogisticPlan.setFocusPainted(false);
        btLogisticPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogisticPlanActionPerformed(evt);
            }
        });
        bg.add(btLogisticPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 325, 50, 30));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2, 90, 45));

        lbPlanTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPlanTitle.setForeground(new java.awt.Color(255, 153, 0));
        lbPlanTitle.setText("Nuevo Plan");
        bg.add(lbPlanTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, -1));

        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 110, 20));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogisticPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogisticPlanActionPerformed
        if (txPlanName.getText().equals("")
                || txValue.getText().equals("")
                || txPlanDetail.getText().equals("")) {

            lbAdvert.setText("Hay campos vacios");
        } else {
            if (Checker.FloatChecker(txValue.getText())) {
                Plan newPlan = new Plan("", txPlanName.getText(), Float.valueOf(txValue.getText()), txPlanDetail.getText());
                plans.add(newPlan);
                plans.saveExcel();
                AD3 MainScreen = new AD3();
                this.dispose();
                MainScreen.setVisible(true);
                File file = new File("rom/Plans/Plans.xlsx");
                updateTableFromExcel(AD3.tbPlans, file);
            } else {
                lbAdvert.setText("El valor no es válido");
            }

        }
    }//GEN-LAST:event_btLogisticPlanActionPerformed

    private void txValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txValueActionPerformed

    }//GEN-LAST:event_txValueActionPerformed

    private void txPlanNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPlanNameActionPerformed

    }//GEN-LAST:event_txPlanNameActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        AD3 ReportWindow = new AD3();
        this.dispose();
        ReportWindow.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {

        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btLogisticPlan;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbAdvert;
    private javax.swing.JLabel lbDetails;
    private javax.swing.JLabel lbPlan;
    private java.awt.Label lbPlanTitle;
    private javax.swing.JLabel lbValue;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JScrollPane txDetails;
    private javax.swing.JTextArea txPlanDetail;
    private javax.swing.JTextField txPlanName;
    private javax.swing.JTextField txValue;
    // End of variables declaration//GEN-END:variables
}
