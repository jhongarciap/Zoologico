package View.Administrative;

import static Utilities.AdExcel.sumBillExcel;
import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import static View.Administrative.AD1.lbTotalValue;
import static View.Administrative.AD2.tbGeneratedReports;
import View.X1;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import static View.Administrative.AD1.tbGeneratedReports1;

/**
 *
 * @author juan.castro17
 */
public class IS1 extends javax.swing.JFrame {

    public IS1() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Administrativo");

        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconAdminZOO.png"));
        this.setIconImage(faviconX1);

        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/Administrative@3x.png"));
        lbAdmin.setIcon(new ImageIcon(logoZV.getScaledInstance(lbAdmin.getWidth(), lbAdmin.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        btComercialSale = new javax.swing.JButton();
        btComercialShopping = new javax.swing.JButton();
        btComercialSale1 = new javax.swing.JButton();
        lbAdmin = new javax.swing.JLabel();
        LbComercialTitle = new java.awt.Label();
        lbZooLogo = new javax.swing.JLabel();

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

        btComercialSale.setBackground(new java.awt.Color(255, 153, 0));
        btComercialSale.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btComercialSale.setForeground(new java.awt.Color(242, 242, 242));
        btComercialSale.setText("Reportes");
        btComercialSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btComercialSale.setFocusPainted(false);
        btComercialSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComercialSaleActionPerformed(evt);
            }
        });
        bgPanelRound.add(btComercialSale);
        btComercialSale.setBounds(30, 150, 220, 30);

        btComercialShopping.setBackground(new java.awt.Color(255, 153, 0));
        btComercialShopping.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btComercialShopping.setForeground(new java.awt.Color(242, 242, 242));
        btComercialShopping.setText("Planes");
        btComercialShopping.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btComercialShopping.setFocusPainted(false);
        btComercialShopping.setMaximumSize(new java.awt.Dimension(123, 49));
        btComercialShopping.setMinimumSize(new java.awt.Dimension(123, 49));
        btComercialShopping.setOpaque(true);
        btComercialShopping.setPreferredSize(new java.awt.Dimension(123, 49));
        btComercialShopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComercialShoppingActionPerformed(evt);
            }
        });
        bgPanelRound.add(btComercialShopping);
        btComercialShopping.setBounds(30, 250, 220, 30);

        btComercialSale1.setBackground(new java.awt.Color(255, 153, 0));
        btComercialSale1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btComercialSale1.setForeground(new java.awt.Color(242, 242, 242));
        btComercialSale1.setText("Empleados");
        btComercialSale1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btComercialSale1.setFocusPainted(false);
        btComercialSale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComercialSale1ActionPerformed(evt);
            }
        });
        bgPanelRound.add(btComercialSale1);
        btComercialSale1.setBounds(30, 200, 220, 30);

        lbAdmin.setMaximumSize(new java.awt.Dimension(549, 267));
        bgPanelRound.add(lbAdmin);
        lbAdmin.setBounds(35, 15, 210, 120);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 300));

        LbComercialTitle.setBackground(new java.awt.Color(35, 35, 35));
        LbComercialTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LbComercialTitle.setForeground(new java.awt.Color(255, 153, 0));
        LbComercialTitle.setText("Administrativo");
        bg.add(LbComercialTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2, 90, 45));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btComercialSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComercialSaleActionPerformed
        AD1 ReportWindow = new AD1();
        this.dispose();
        ReportWindow.setVisible(true);
        File file = new File("rom/Bills/BillSale.xlsx");
        updateTableFromExcel(tbGeneratedReports1, file);
        Float sales = sumBillExcel(file);
        lbTotalValue.setText("$" + sales);
    }//GEN-LAST:event_btComercialSaleActionPerformed

    private void btComercialShoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComercialShoppingActionPerformed
        AD3 ReportWindow = new AD3();
        this.dispose();
        ReportWindow.setVisible(true);
        File file = new File("rom/Plans/Plans.xlsx");
        updateTableFromExcel(AD3.tbPlans, file);
    }//GEN-LAST:event_btComercialShoppingActionPerformed

    private void btComercialSale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComercialSale1ActionPerformed
        AD2 MainScreen = new AD2();
        this.dispose();
        MainScreen.setVisible(true);
        File file = new File("rom/Employees/Employees.xlsx");
        updateTableFromExcel(tbGeneratedReports, file);
    }//GEN-LAST:event_btComercialSale1ActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        X1 MainScreen = new X1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

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
                new IS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label LbComercialTitle;
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btComercialSale;
    private javax.swing.JButton btComercialSale1;
    private javax.swing.JButton btComercialShopping;
    private javax.swing.JLabel lbAdmin;
    private javax.swing.JLabel lbZooLogo;
    // End of variables declaration//GEN-END:variables
}
