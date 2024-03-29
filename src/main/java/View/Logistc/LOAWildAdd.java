package View.Logistc;

import Control.LogisticDepartment.ArrayListWild;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import Model.Wild;
import java.io.File;
import static View.Logistc.LO1Wild.tbWildAnimals;

/**
 *
 * @author juan.castro17
 */
public class LOAWildAdd extends javax.swing.JFrame {

    ArrayListWild wilds = new ArrayListWild();

    public LOAWildAdd() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Logístico");
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
        jbNameWild = new javax.swing.JLabel();
        txNameWild = new javax.swing.JTextField();
        jbRaceWild = new javax.swing.JLabel();
        txRaceWild = new javax.swing.JTextField();
        jbSexWild = new javax.swing.JLabel();
        jbBirthhabitatWild = new javax.swing.JLabel();
        txBirthhabitatWild = new javax.swing.JTextField();
        jbDangerousnessWild = new javax.swing.JLabel();
        jbHabitadWild = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDietWild = new javax.swing.JTextArea();
        cbDangerousnessWild = new javax.swing.JComboBox<>();
        cbSexWild = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        cbHabitadWild = new javax.swing.JComboBox<>();
        jbDietWild1 = new javax.swing.JLabel();
        btLogisticAnimals = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbWildTitle1 = new java.awt.Label();
        lbWildTitle2 = new java.awt.Label();
        lbWildTitle3 = new java.awt.Label();
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

        jbNameWild.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNameWild.setForeground(new java.awt.Color(242, 242, 242));
        jbNameWild.setText("Nombre:");
        bgPanelRound.add(jbNameWild);
        jbNameWild.setBounds(10, 25, 70, 16);

        txNameWild.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txNameWild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameWildActionPerformed(evt);
            }
        });
        bgPanelRound.add(txNameWild);
        txNameWild.setBounds(90, 20, 180, 22);

        jbRaceWild.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbRaceWild.setForeground(new java.awt.Color(242, 242, 242));
        jbRaceWild.setText("Raza:");
        bgPanelRound.add(jbRaceWild);
        jbRaceWild.setBounds(10, 50, 70, 16);

        txRaceWild.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txRaceWild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRaceWildActionPerformed(evt);
            }
        });
        bgPanelRound.add(txRaceWild);
        txRaceWild.setBounds(90, 50, 180, 22);

        jbSexWild.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSexWild.setForeground(new java.awt.Color(242, 242, 242));
        jbSexWild.setText("Sexo:");
        bgPanelRound.add(jbSexWild);
        jbSexWild.setBounds(10, 80, 70, 16);

        jbBirthhabitatWild.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbBirthhabitatWild.setForeground(new java.awt.Color(242, 242, 242));
        jbBirthhabitatWild.setText("Hábitat de Nacimiento:");
        bgPanelRound.add(jbBirthhabitatWild);
        jbBirthhabitatWild.setBounds(10, 140, 190, 16);

        txBirthhabitatWild.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txBirthhabitatWild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBirthhabitatWildActionPerformed(evt);
            }
        });
        bgPanelRound.add(txBirthhabitatWild);
        txBirthhabitatWild.setBounds(10, 160, 260, 22);

        jbDangerousnessWild.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDangerousnessWild.setForeground(new java.awt.Color(242, 242, 242));
        jbDangerousnessWild.setText("Peligrosidad:");
        bgPanelRound.add(jbDangerousnessWild);
        jbDangerousnessWild.setBounds(10, 190, 110, 20);

        jbHabitadWild.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbHabitadWild.setForeground(new java.awt.Color(242, 242, 242));
        jbHabitadWild.setText("Hábitat:");
        bgPanelRound.add(jbHabitadWild);
        jbHabitadWild.setBounds(10, 110, 70, 16);

        txDietWild.setColumns(20);
        txDietWild.setRows(5);
        txDietWild.setText("\n");
        jScrollPane1.setViewportView(txDietWild);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 260, 130);

        cbDangerousnessWild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peligrosidad 1", "Peligrosidad 2", "Peligrosidad 3" }));
        bgPanelRound.add(cbDangerousnessWild);
        cbDangerousnessWild.setBounds(120, 190, 150, 22);

        cbSexWild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        bgPanelRound.add(cbSexWild);
        cbSexWild.setBounds(90, 80, 180, 22);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bgPanelRound.add(jComboBox3);
        jComboBox3.setBounds(90, 80, 180, 22);

        cbHabitadWild.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hábitat 1", "Hábitat 2", "Hábitat 3" }));
        bgPanelRound.add(cbHabitadWild);
        cbHabitadWild.setBounds(90, 110, 180, 22);

        jbDietWild1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDietWild1.setForeground(new java.awt.Color(242, 242, 242));
        jbDietWild1.setText("Dieta:");
        bgPanelRound.add(jbDietWild1);
        jbDietWild1.setBounds(10, 220, 70, 16);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 380));

        btLogisticAnimals.setBackground(new java.awt.Color(69, 106, 48));
        btLogisticAnimals.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btLogisticAnimals.setForeground(new java.awt.Color(242, 242, 242));
        btLogisticAnimals.setText("+");
        btLogisticAnimals.setActionCommand("Añadir");
        btLogisticAnimals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogisticAnimals.setFocusPainted(false);
        btLogisticAnimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogisticAnimalsActionPerformed(evt);
            }
        });
        bg.add(btLogisticAnimals, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 50, 30));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2, 90, 45));

        lbWildTitle1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbWildTitle1.setForeground(new java.awt.Color(255, 153, 0));
        lbWildTitle1.setText("Nuevo ");
        bg.add(lbWildTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        lbWildTitle2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbWildTitle2.setForeground(new java.awt.Color(69, 106, 48));
        lbWildTitle2.setText("Animal");
        bg.add(lbWildTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 20, 62, -1));

        lbWildTitle3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbWildTitle3.setForeground(new java.awt.Color(188, 38, 73));
        lbWildTitle3.setText("Salvaje");
        bg.add(lbWildTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));

        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        lbAdvert.setRequestFocusEnabled(false);
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 20));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogisticAnimalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogisticAnimalsActionPerformed
        if (txNameWild.getText().equals("")
                || txRaceWild.getText().equals("")
                || txBirthhabitatWild.getText().equals("")
                || txDietWild.getText().equals("")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            Wild wild = new Wild(txNameWild.getText(), txRaceWild.getText(), cbSexWild.getSelectedItem().toString(), cbHabitadWild.getSelectedItem().toString(), txBirthhabitatWild.getText(), cbDangerousnessWild.getSelectedItem().toString(), txDietWild.getText());
            wilds.add(wild);
            wilds.saveExcel();
            LO1Wild MainScreen = new LO1Wild();
            this.dispose();
            MainScreen.setVisible(true);
            File file = new File("rom/Animals/Wilds.xlsx");
            updateTableFromExcel(tbWildAnimals, file);
        }

    }//GEN-LAST:event_btLogisticAnimalsActionPerformed

    private void txNameWildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameWildActionPerformed
        
    }//GEN-LAST:event_txNameWildActionPerformed

    private void txRaceWildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRaceWildActionPerformed
        
    }//GEN-LAST:event_txRaceWildActionPerformed

    private void txBirthhabitatWildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBirthhabitatWildActionPerformed
        
    }//GEN-LAST:event_txBirthhabitatWildActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        LO1Wild MainScreen = new LO1Wild();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        }catch (Exception e){
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOAWildAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btLogisticAnimals;
    private javax.swing.JComboBox<String> cbDangerousnessWild;
    private javax.swing.JComboBox<String> cbHabitadWild;
    private javax.swing.JComboBox<String> cbSexWild;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jbBirthhabitatWild;
    private javax.swing.JLabel jbDangerousnessWild;
    private javax.swing.JLabel jbDietWild1;
    private javax.swing.JLabel jbHabitadWild;
    private javax.swing.JLabel jbNameWild;
    private javax.swing.JLabel jbRaceWild;
    private javax.swing.JLabel jbSexWild;
    private javax.swing.JLabel lbAdvert;
    private java.awt.Label lbWildTitle1;
    private java.awt.Label lbWildTitle2;
    private java.awt.Label lbWildTitle3;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JTextField txBirthhabitatWild;
    private javax.swing.JTextArea txDietWild;
    private javax.swing.JTextField txNameWild;
    private javax.swing.JTextField txRaceWild;
    // End of variables declaration//GEN-END:variables
}
