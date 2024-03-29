package View.Logistc;

import View.X1;
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
public class IS3 extends javax.swing.JFrame {

    public IS3() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Logístico");
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconLogiZOO.png"));
        this.setIconImage(faviconX1);
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/logistic.png"));
        lbLogistic.setIcon(new ImageIcon(logoZV.getScaledInstance(lbLogistic.getWidth(), lbLogistic.getHeight(), Image.SCALE_AREA_AVERAGING)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        btLogisticSupply = new javax.swing.JButton();
        btLogisticAnimals = new javax.swing.JButton();
        lbLogistic = new javax.swing.JLabel();
        lbLogisticTitle = new java.awt.Label();
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

        btLogisticSupply.setBackground(new java.awt.Color(69, 106, 48));
        btLogisticSupply.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btLogisticSupply.setForeground(new java.awt.Color(242, 242, 242));
        btLogisticSupply.setText("Suplementos");
        btLogisticSupply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogisticSupply.setFocusPainted(false);
        btLogisticSupply.setMaximumSize(new java.awt.Dimension(123, 49));
        btLogisticSupply.setMinimumSize(new java.awt.Dimension(123, 49));
        btLogisticSupply.setOpaque(true);
        btLogisticSupply.setPreferredSize(new java.awt.Dimension(123, 49));
        btLogisticSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogisticSupplyActionPerformed(evt);
            }
        });
        bgPanelRound.add(btLogisticSupply);
        btLogisticSupply.setBounds(20, 230, 240, 40);

        btLogisticAnimals.setBackground(new java.awt.Color(69, 106, 48));
        btLogisticAnimals.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btLogisticAnimals.setForeground(new java.awt.Color(242, 242, 242));
        btLogisticAnimals.setText("Animales");
        btLogisticAnimals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogisticAnimals.setFocusPainted(false);
        btLogisticAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogisticAnimalsActionPerformed(evt);
            }
        });
        bgPanelRound.add(btLogisticAnimals);
        btLogisticAnimals.setBounds(20, 170, 240, 40);

        lbLogistic.setMaximumSize(new java.awt.Dimension(549, 267));
        bgPanelRound.add(lbLogistic);
        lbLogistic.setBounds(20, -30, 240, 240);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 300));

        lbLogisticTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbLogisticTitle.setForeground(new java.awt.Color(69, 106, 48));
        lbLogisticTitle.setText("Logístico");
        bg.add(lbLogisticTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

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

    private void btLogisticSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogisticSupplyActionPerformed
        LO2 MainScreen = new LO2();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_btLogisticSupplyActionPerformed

    private void btLogisticAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogisticAnimalsActionPerformed
        ILS1 MainScreen = new ILS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_btLogisticAnimalsActionPerformed

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
                new IS3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btLogisticAnimals;
    private javax.swing.JButton btLogisticSupply;
    private javax.swing.JLabel lbLogistic;
    private java.awt.Label lbLogisticTitle;
    private javax.swing.JLabel lbZooLogo;
    // End of variables declaration//GEN-END:variables
}
