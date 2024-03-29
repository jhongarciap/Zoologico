package View.Logistc;

import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import static View.Logistc.LO1Domestic.tbDomesticAnimals;
import static View.Logistc.LO1Minor.tbMinorAnimals;
import static View.Logistc.LO1Wild.tbWildAnimals;
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
public class ILS1 extends javax.swing.JFrame {

    public ILS1() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Logístico");
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconLogiZOO.png"));
        this.setIconImage(faviconX1);
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/animals@3x.png"));
        lbAnimals.setIcon(new ImageIcon(logoZV.getScaledInstance(lbAnimals.getWidth(), lbAnimals.getHeight(), Image.SCALE_AREA_AVERAGING)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        btMinor = new javax.swing.JButton();
        btWild = new javax.swing.JButton();
        lbAnimals = new javax.swing.JLabel();
        btDomestic = new javax.swing.JButton();
        LbAnimalsTitle = new java.awt.Label();
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

        btMinor.setBackground(new java.awt.Color(69, 106, 48));
        btMinor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btMinor.setForeground(new java.awt.Color(242, 242, 242));
        btMinor.setText("Menores");
        btMinor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMinor.setFocusPainted(false);
        btMinor.setMaximumSize(new java.awt.Dimension(123, 49));
        btMinor.setMinimumSize(new java.awt.Dimension(123, 49));
        btMinor.setOpaque(true);
        btMinor.setPreferredSize(new java.awt.Dimension(123, 49));
        btMinor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMinorActionPerformed(evt);
            }
        });
        bgPanelRound.add(btMinor);
        btMinor.setBounds(30, 230, 220, 40);

        btWild.setBackground(new java.awt.Color(69, 106, 48));
        btWild.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btWild.setForeground(new java.awt.Color(242, 242, 242));
        btWild.setText("Salvajes");
        btWild.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btWild.setFocusPainted(false);
        btWild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWildActionPerformed(evt);
            }
        });
        bgPanelRound.add(btWild);
        btWild.setBounds(30, 110, 220, 40);

        lbAnimals.setMaximumSize(new java.awt.Dimension(549, 267));
        bgPanelRound.add(lbAnimals);
        lbAnimals.setBounds(30, 20, 220, 70);

        btDomestic.setBackground(new java.awt.Color(69, 106, 48));
        btDomestic.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btDomestic.setForeground(new java.awt.Color(242, 242, 242));
        btDomestic.setText("Domesticos");
        btDomestic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDomestic.setFocusPainted(false);
        btDomestic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDomesticActionPerformed(evt);
            }
        });
        bgPanelRound.add(btDomestic);
        btDomestic.setBounds(30, 170, 220, 40);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 300));

        LbAnimalsTitle.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LbAnimalsTitle.setForeground(new java.awt.Color(69, 106, 48));
        LbAnimalsTitle.setText("Animales");
        bg.add(LbAnimalsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

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

    private void btMinorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinorActionPerformed
        LO1Minor minorTab = new LO1Minor();
        this.dispose();
        minorTab.setVisible(true);
        File file = new File("rom/Animals/Minors.xlsx");
        updateTableFromExcel(tbMinorAnimals, file);

    }//GEN-LAST:event_btMinorActionPerformed

    private void btWildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWildActionPerformed
        LO1Wild WildTab = new LO1Wild();
        this.dispose();
        WildTab.setVisible(true);
        File file = new File("rom/Animals/Wilds.xlsx");
        updateTableFromExcel(tbWildAnimals, file);
    }//GEN-LAST:event_btWildActionPerformed

    private void btDomesticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDomesticActionPerformed
        LO1Domestic domesticTab = new LO1Domestic();
        this.dispose();
        domesticTab.setVisible(true);
        File file = new File("rom/Animals/Domestics.xlsx");
        updateTableFromExcel(tbDomesticAnimals, file);
    }//GEN-LAST:event_btDomesticActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS3 MainScreen = new IS3();
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
                new ILS1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label LbAnimalsTitle;
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btDomestic;
    private javax.swing.JButton btMinor;
    private javax.swing.JButton btWild;
    private javax.swing.JLabel lbAnimals;
    private javax.swing.JLabel lbZooLogo;
    // End of variables declaration//GEN-END:variables
}
