package View;

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
public class LO2Add extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public LO2Add() {
        //define tamaño
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup(); // Sets the FlatLaf LookAndFeel as the main theme for the JFrame.
        initComponents();
        //ubica el nombre de la ventana 
        this.setLocationRelativeTo(null); //Centers the window on-screen.
        this.setTitle("Departamento Logístico"); // Set the title for the JFrame.
        //icono de la ventana 
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconLogiZOO.png"));
        this.setIconImage(faviconX1);
        //logo del recadro debajo del logo
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jbNameNewSupply = new javax.swing.JLabel();
        txNameNewSupply = new javax.swing.JTextField();
        jbTypeNewSupply = new javax.swing.JLabel();
        jbSpecificationsNewSupply = new javax.swing.JLabel();
        jbAnimalNewSupply = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txSpecificationsNewSupply = new javax.swing.JTextArea();
        cbTypeNewSupply = new javax.swing.JComboBox<>();
        cbAnimalNewSupply = new javax.swing.JComboBox<>();
        cbHabitaMinor = new javax.swing.JComboBox<>();
        btAddNewSupply = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbNewSupplyTitle1 = new java.awt.Label();
        lbNewSupplyTitle2 = new java.awt.Label();

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

        jbNameNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNameNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbNameNewSupply.setText("Nombre:");
        bgPanelRound.add(jbNameNewSupply);
        jbNameNewSupply.setBounds(10, 25, 70, 16);

        txNameNewSupply.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txNameNewSupply.setText("Ingresa el Nombre del supl");
        txNameNewSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameNewSupplyActionPerformed(evt);
            }
        });
        bgPanelRound.add(txNameNewSupply);
        txNameNewSupply.setBounds(90, 20, 180, 22);

        jbTypeNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbTypeNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbTypeNewSupply.setText("Tipo:");
        bgPanelRound.add(jbTypeNewSupply);
        jbTypeNewSupply.setBounds(10, 50, 70, 16);

        jbSpecificationsNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSpecificationsNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbSpecificationsNewSupply.setText("Especificaciones:");
        bgPanelRound.add(jbSpecificationsNewSupply);
        jbSpecificationsNewSupply.setBounds(10, 110, 150, 16);

        jbAnimalNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbAnimalNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbAnimalNewSupply.setText("Animal:");
        bgPanelRound.add(jbAnimalNewSupply);
        jbAnimalNewSupply.setBounds(10, 80, 70, 16);

        txSpecificationsNewSupply.setColumns(20);
        txSpecificationsNewSupply.setRows(5);
        txSpecificationsNewSupply.setText("Ingresa la dieta del animal");
        jScrollPane1.setViewportView(txSpecificationsNewSupply);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 260, 130);

        cbTypeNewSupply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Femenino", "Masculino" }));
        bgPanelRound.add(cbTypeNewSupply);
        cbTypeNewSupply.setBounds(90, 50, 180, 22);

        cbAnimalNewSupply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bgPanelRound.add(cbAnimalNewSupply);
        cbAnimalNewSupply.setBounds(90, 80, 180, 22);

        cbHabitaMinor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hábitad 1", "Hábitad 2", "Hábitad 3" }));
        bgPanelRound.add(cbHabitaMinor);
        cbHabitaMinor.setBounds(90, 80, 180, 22);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 270));

        btAddNewSupply.setBackground(new java.awt.Color(69, 106, 48));
        btAddNewSupply.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btAddNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        btAddNewSupply.setText("+");
        btAddNewSupply.setActionCommand("Añadir");
        btAddNewSupply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btAddNewSupply.setFocusPainted(false);
        btAddNewSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddNewSupplyActionPerformed(evt);
            }
        });
        bg.add(btAddNewSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 50, 30));

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
        lbNewSupplyTitle1.setText("Nuevo ");
        bg.add(lbNewSupplyTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        lbNewSupplyTitle2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNewSupplyTitle2.setForeground(new java.awt.Color(69, 106, 48));
        lbNewSupplyTitle2.setText("Suplemento");
        bg.add(lbNewSupplyTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 20, 120, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddNewSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddNewSupplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddNewSupplyActionPerformed

    private void txNameNewSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameNewSupplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNameNewSupplyActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
       ILS1 MainScreen = new ILS1();
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LO2Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddNewSupply;
    private javax.swing.JComboBox<String> cbAnimalNewSupply;
    private javax.swing.JComboBox<String> cbHabitaMinor;
    private javax.swing.JComboBox<String> cbTypeNewSupply;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jbAnimalNewSupply;
    private javax.swing.JLabel jbNameNewSupply;
    private javax.swing.JLabel jbSpecificationsNewSupply;
    private javax.swing.JLabel jbTypeNewSupply;
    private java.awt.Label lbNewSupplyTitle1;
    private java.awt.Label lbNewSupplyTitle2;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JTextField txNameNewSupply;
    private javax.swing.JTextArea txSpecificationsNewSupply;
    // End of variables declaration//GEN-END:variables
}
