package View.Logistc;

import Control.LogisticDepartment.ArrayListMinor;
import Model.Minor;
import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.io.File;
import static View.Logistc.LO1Minor.tbMinorAnimals;

/**
 *
 * @author juan.castro17
 */
public class LOAMinorAdd extends javax.swing.JFrame {

    ArrayListMinor minors = new ArrayListMinor();

    public LOAMinorAdd() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Logístico");
        //icono de la ventana 
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconLogiZOO.png"));
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
        jbNameMinor = new javax.swing.JLabel();
        txNameMinor = new javax.swing.JTextField();
        jbRaceMinor = new javax.swing.JLabel();
        txRaceMinor = new javax.swing.JTextField();
        jbSexMinor = new javax.swing.JLabel();
        jbDiseasesMinor = new javax.swing.JLabel();
        txDiseasesMinor = new javax.swing.JTextField();
        jbNativeClimateMinor = new javax.swing.JLabel();
        jbHabitaMinor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDietMinor = new javax.swing.JTextArea();
        cbNativeClimateMinor = new javax.swing.JComboBox<>();
        cbSexMinor = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        cbHabitaMinor = new javax.swing.JComboBox<>();
        jbDietMinor1 = new javax.swing.JLabel();
        btAddMinor = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbMinorTitle1 = new java.awt.Label();
        lbMinorTitle2 = new java.awt.Label();
        lbMinorTitle3 = new java.awt.Label();
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

        jbNameMinor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNameMinor.setForeground(new java.awt.Color(242, 242, 242));
        jbNameMinor.setText("Nombre:");
        bgPanelRound.add(jbNameMinor);
        jbNameMinor.setBounds(10, 25, 70, 16);

        txNameMinor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txNameMinor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameMinorActionPerformed(evt);
            }
        });
        bgPanelRound.add(txNameMinor);
        txNameMinor.setBounds(90, 20, 180, 22);

        jbRaceMinor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbRaceMinor.setForeground(new java.awt.Color(242, 242, 242));
        jbRaceMinor.setText("Raza:");
        bgPanelRound.add(jbRaceMinor);
        jbRaceMinor.setBounds(10, 50, 70, 16);

        txRaceMinor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txRaceMinor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRaceMinorActionPerformed(evt);
            }
        });
        bgPanelRound.add(txRaceMinor);
        txRaceMinor.setBounds(90, 50, 180, 22);

        jbSexMinor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSexMinor.setForeground(new java.awt.Color(242, 242, 242));
        jbSexMinor.setText("Sexo:");
        bgPanelRound.add(jbSexMinor);
        jbSexMinor.setBounds(10, 80, 70, 16);

        jbDiseasesMinor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDiseasesMinor.setForeground(new java.awt.Color(242, 242, 242));
        jbDiseasesMinor.setText("Enfermedades a transmitir:");
        bgPanelRound.add(jbDiseasesMinor);
        jbDiseasesMinor.setBounds(10, 140, 220, 16);

        txDiseasesMinor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txDiseasesMinor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDiseasesMinorActionPerformed(evt);
            }
        });
        bgPanelRound.add(txDiseasesMinor);
        txDiseasesMinor.setBounds(10, 160, 260, 22);

        jbNativeClimateMinor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNativeClimateMinor.setForeground(new java.awt.Color(242, 242, 242));
        jbNativeClimateMinor.setText("Clima Nativo:");
        bgPanelRound.add(jbNativeClimateMinor);
        jbNativeClimateMinor.setBounds(10, 190, 110, 20);

        jbHabitaMinor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbHabitaMinor.setForeground(new java.awt.Color(242, 242, 242));
        jbHabitaMinor.setText("Hábitat:");
        bgPanelRound.add(jbHabitaMinor);
        jbHabitaMinor.setBounds(10, 110, 70, 16);

        txDietMinor.setColumns(20);
        txDietMinor.setRows(5);
        jScrollPane1.setViewportView(txDietMinor);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 260, 130);

        cbNativeClimateMinor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clima 1", "Clima 2", "Clima 3" }));
        bgPanelRound.add(cbNativeClimateMinor);
        cbNativeClimateMinor.setBounds(120, 190, 150, 22);

        cbSexMinor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        bgPanelRound.add(cbSexMinor);
        cbSexMinor.setBounds(90, 80, 180, 22);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bgPanelRound.add(jComboBox3);
        jComboBox3.setBounds(90, 80, 180, 22);

        cbHabitaMinor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hábitat 1", "Hábitat 2", "Hábitat 3" }));
        bgPanelRound.add(cbHabitaMinor);
        cbHabitaMinor.setBounds(90, 110, 180, 22);

        jbDietMinor1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDietMinor1.setForeground(new java.awt.Color(242, 242, 242));
        jbDietMinor1.setText("Dieta:");
        bgPanelRound.add(jbDietMinor1);
        jbDietMinor1.setBounds(10, 220, 70, 16);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 380));

        btAddMinor.setBackground(new java.awt.Color(69, 106, 48));
        btAddMinor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btAddMinor.setForeground(new java.awt.Color(242, 242, 242));
        btAddMinor.setText("+");
        btAddMinor.setActionCommand("Añadir");
        btAddMinor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddMinor.setFocusPainted(false);
        btAddMinor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMinorActionPerformed(evt);
            }
        });
        bg.add(btAddMinor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 50, 30));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2, 90, 45));

        lbMinorTitle1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMinorTitle1.setForeground(new java.awt.Color(255, 153, 0));
        lbMinorTitle1.setText("Nuevo ");
        bg.add(lbMinorTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        lbMinorTitle2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMinorTitle2.setForeground(new java.awt.Color(69, 106, 48));
        lbMinorTitle2.setText("Animal");
        bg.add(lbMinorTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 20, 62, -1));

        lbMinorTitle3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbMinorTitle3.setForeground(new java.awt.Color(188, 38, 73));
        lbMinorTitle3.setText("Menor");
        bg.add(lbMinorTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));

        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 30));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddMinorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMinorActionPerformed
        if (txNameMinor.getText().equals("")
                || txRaceMinor.getText().equals("")
                || txDiseasesMinor.getText().equals("")
                || txDietMinor.getText().equals("")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            Minor minor = new Minor(txNameMinor.getText(), txRaceMinor.getText(), cbSexMinor.getSelectedItem().toString(), cbHabitaMinor.getSelectedItem().toString(), txDiseasesMinor.getText(), cbNativeClimateMinor.getSelectedItem().toString(), txDietMinor.getText());
            minors.add(minor);
            minors.saveExcel();
            LO1Minor MainScreen = new LO1Minor();
            this.dispose();
            MainScreen.setVisible(true);
            File file = new File("rom/Animals/Minors.xlsx");
            updateTableFromExcel(tbMinorAnimals, file);
        }

        
    }//GEN-LAST:event_btAddMinorActionPerformed

    private void txNameMinorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameMinorActionPerformed
        
    }//GEN-LAST:event_txNameMinorActionPerformed

    private void txRaceMinorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRaceMinorActionPerformed
        
    }//GEN-LAST:event_txRaceMinorActionPerformed

    private void txDiseasesMinorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDiseasesMinorActionPerformed
        
    }//GEN-LAST:event_txDiseasesMinorActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        LO1Minor MainScreen = new LO1Minor();
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
                new LOAMinorAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddMinor;
    private javax.swing.JComboBox<String> cbHabitaMinor;
    private javax.swing.JComboBox<String> cbNativeClimateMinor;
    private javax.swing.JComboBox<String> cbSexMinor;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jbDietMinor1;
    private javax.swing.JLabel jbDiseasesMinor;
    private javax.swing.JLabel jbHabitaMinor;
    private javax.swing.JLabel jbNameMinor;
    private javax.swing.JLabel jbNativeClimateMinor;
    private javax.swing.JLabel jbRaceMinor;
    private javax.swing.JLabel jbSexMinor;
    private javax.swing.JLabel lbAdvert;
    private java.awt.Label lbMinorTitle1;
    private java.awt.Label lbMinorTitle2;
    private java.awt.Label lbMinorTitle3;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JTextArea txDietMinor;
    private javax.swing.JTextField txDiseasesMinor;
    private javax.swing.JTextField txNameMinor;
    private javax.swing.JTextField txRaceMinor;
    // End of variables declaration//GEN-END:variables
}
