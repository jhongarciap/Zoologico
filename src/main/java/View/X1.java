package View;

import View.Logistc.IS3;
import View.Administrative.IS1;
import View.Cormercial.IS2;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author juan.castro17
 */
public class X1 extends javax.swing.JFrame {

    public X1() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("by NeoSolutions Inc.");

        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconZOO.png"));
        this.setIconImage(faviconX1);

        Image logoZoo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbzooLogo.setIcon(new ImageIcon(logoZoo.getScaledInstance(lbzooLogo.getWidth(), lbzooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/ZRVC@3x.png"));
        lbZRVLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZRVLogo.getWidth(), lbZRVLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoNS = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/NS_W@3x.png"));
        lbNSLogo.setIcon(new ImageIcon(logoNS.getScaledInstance(lbNSLogo.getWidth(), lbNSLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lbNSLogo = new javax.swing.JLabel();
        lbzooLogo = new javax.swing.JLabel();
        bgPanelRound = new Clases.PanelRound();
        btLogisticDept = new javax.swing.JButton();
        btAdministrativeDept = new javax.swing.JButton();
        btCommercialDept = new javax.swing.JButton();
        lbZRVLogo = new javax.swing.JLabel();
        lbDept = new javax.swing.JLabel();
        lbNeoSolutions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(720, 480));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(35, 35, 35));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNSLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbNSLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, 306, 40));

        lbzooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbzooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 135, 306, 150));

        bgPanelRound.setBackground(new java.awt.Color(51, 51, 51));
        bgPanelRound.setRoundBottomLeft(15);
        bgPanelRound.setRoundBottomRight(15);
        bgPanelRound.setRoundTopLeft(15);
        bgPanelRound.setRoundTopRight(15);
        bgPanelRound.setLayout(null);

        btLogisticDept.setBackground(new java.awt.Color(69, 106, 48));
        btLogisticDept.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btLogisticDept.setForeground(new java.awt.Color(255, 255, 255));
        btLogisticDept.setText("Logístico");
        btLogisticDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogisticDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogisticDeptActionPerformed(evt);
            }
        });
        bgPanelRound.add(btLogisticDept);
        btLogisticDept.setBounds(20, 250, 220, 30);

        btAdministrativeDept.setBackground(new java.awt.Color(255, 153, 0));
        btAdministrativeDept.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btAdministrativeDept.setForeground(new java.awt.Color(255, 255, 255));
        btAdministrativeDept.setText("Administrativo");
        btAdministrativeDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdministrativeDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdministrativeDeptActionPerformed(evt);
            }
        });
        bgPanelRound.add(btAdministrativeDept);
        btAdministrativeDept.setBounds(20, 200, 220, 29);

        btCommercialDept.setBackground(new java.awt.Color(188, 38, 73));
        btCommercialDept.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btCommercialDept.setForeground(new java.awt.Color(255, 255, 255));
        btCommercialDept.setText("Comercial");
        btCommercialDept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCommercialDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCommercialDeptActionPerformed(evt);
            }
        });
        bgPanelRound.add(btCommercialDept);
        btCommercialDept.setBounds(20, 150, 220, 29);

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bgPanelRound.add(lbZRVLogo);
        lbZRVLogo.setBounds(35, 20, 190, 80);

        lbDept.setBackground(new java.awt.Color(0, 0, 0));
        lbDept.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbDept.setForeground(new java.awt.Color(255, 255, 255));
        lbDept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDept.setText("Seleccione su departamento:");
        bgPanelRound.add(lbDept);
        lbDept.setBounds(20, 110, 220, 30);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 260, 300));

        lbNeoSolutions.setForeground(new java.awt.Color(153, 153, 153));
        lbNeoSolutions.setText("© NeoSolutions Inc. - 2023");
        bg.add(lbNeoSolutions, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogisticDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogisticDeptActionPerformed
        IS3 AdminMainWindow = new IS3();
        this.dispose();
        AdminMainWindow.setVisible(true);
    }//GEN-LAST:event_btLogisticDeptActionPerformed

    private void btAdministrativeDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdministrativeDeptActionPerformed
        IS1 AdminMainWindow = new IS1();
        this.dispose();
        AdminMainWindow.setVisible(true);
    }//GEN-LAST:event_btAdministrativeDeptActionPerformed

    private void btCommercialDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCommercialDeptActionPerformed
        IS2 AdminMainWindow = new IS2();
        this.dispose();
        AdminMainWindow.setVisible(true);
    }//GEN-LAST:event_btCommercialDeptActionPerformed

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
                new X1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAdministrativeDept;
    private javax.swing.JButton btCommercialDept;
    private javax.swing.JButton btLogisticDept;
    private javax.swing.JLabel lbDept;
    private javax.swing.JLabel lbNSLogo;
    private javax.swing.JLabel lbNeoSolutions;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbzooLogo;
    // End of variables declaration//GEN-END:variables
}
