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
public class LOADomesticAdd extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public LOADomesticAdd() {
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
        lbNameDomestic = new javax.swing.JLabel();
        txNameDomestic = new javax.swing.JTextField();
        lbRaceDomestic = new javax.swing.JLabel();
        txPsycheDomestic = new javax.swing.JTextField();
        lbsexDomestic = new javax.swing.JLabel();
        lbDietDomestic = new javax.swing.JLabel();
        lbOriginDomestic = new javax.swing.JLabel();
        lbPsycheDomestic = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txlDietDomestic = new javax.swing.JTextArea();
        cbOriginDomestic = new javax.swing.JComboBox<>();
        cbSexDomestic = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        txRaceDomestic = new javax.swing.JTextField();
        btAddDomestic = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbDomesticTitle1 = new java.awt.Label();
        lbDomesticTitle2 = new java.awt.Label();
        lbDomesticTitle3 = new java.awt.Label();

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

        lbNameDomestic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNameDomestic.setForeground(new java.awt.Color(242, 242, 242));
        lbNameDomestic.setText("Nombre:");
        bgPanelRound.add(lbNameDomestic);
        lbNameDomestic.setBounds(10, 25, 70, 16);

        txNameDomestic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txNameDomestic.setText("Ingresa el nombre del animal");
        txNameDomestic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameDomesticActionPerformed(evt);
            }
        });
        bgPanelRound.add(txNameDomestic);
        txNameDomestic.setBounds(90, 20, 180, 22);

        lbRaceDomestic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbRaceDomestic.setForeground(new java.awt.Color(242, 242, 242));
        lbRaceDomestic.setText("Raza:");
        bgPanelRound.add(lbRaceDomestic);
        lbRaceDomestic.setBounds(10, 50, 70, 16);

        txPsycheDomestic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txPsycheDomestic.setText("Ingresa la psique del animal");
        txPsycheDomestic.setToolTipText("");
        txPsycheDomestic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPsycheDomesticActionPerformed(evt);
            }
        });
        bgPanelRound.add(txPsycheDomestic);
        txPsycheDomestic.setBounds(90, 170, 180, 22);

        lbsexDomestic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbsexDomestic.setForeground(new java.awt.Color(242, 242, 242));
        lbsexDomestic.setText("Sexo:");
        bgPanelRound.add(lbsexDomestic);
        lbsexDomestic.setBounds(10, 80, 70, 16);

        lbDietDomestic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbDietDomestic.setForeground(new java.awt.Color(242, 242, 242));
        lbDietDomestic.setText("Dieta:");
        bgPanelRound.add(lbDietDomestic);
        lbDietDomestic.setBounds(10, 200, 70, 16);

        lbOriginDomestic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbOriginDomestic.setForeground(new java.awt.Color(242, 242, 242));
        lbOriginDomestic.setText("Origen:");
        bgPanelRound.add(lbOriginDomestic);
        lbOriginDomestic.setBounds(10, 140, 190, 20);

        lbPsycheDomestic.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbPsycheDomestic.setForeground(new java.awt.Color(242, 242, 242));
        lbPsycheDomestic.setText("Psique:");
        bgPanelRound.add(lbPsycheDomestic);
        lbPsycheDomestic.setBounds(10, 170, 90, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("Hábitad:");
        bgPanelRound.add(jLabel7);
        jLabel7.setBounds(10, 110, 70, 16);

        txlDietDomestic.setColumns(20);
        txlDietDomestic.setRows(5);
        txlDietDomestic.setText("Ingresa la dieta del animal");
        jScrollPane1.setViewportView(txlDietDomestic);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 260, 150);

        cbOriginDomestic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rescate", "Entregado", "Zoológico" }));
        bgPanelRound.add(cbOriginDomestic);
        cbOriginDomestic.setBounds(90, 140, 180, 22);

        cbSexDomestic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Femenino", "Masculino" }));
        bgPanelRound.add(cbSexDomestic);
        cbSexDomestic.setBounds(90, 80, 180, 22);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bgPanelRound.add(jComboBox3);
        jComboBox3.setBounds(90, 80, 180, 22);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hábitad 1", "Hábitad 2", "Hábitad 3" }));
        bgPanelRound.add(jComboBox4);
        jComboBox4.setBounds(90, 110, 180, 22);

        txRaceDomestic.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txRaceDomestic.setText("Ingresa la raza del animal");
        txRaceDomestic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRaceDomesticActionPerformed(evt);
            }
        });
        bgPanelRound.add(txRaceDomestic);
        txRaceDomestic.setBounds(90, 50, 180, 22);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 380));

        btAddDomestic.setBackground(new java.awt.Color(69, 106, 48));
        btAddDomestic.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btAddDomestic.setForeground(new java.awt.Color(242, 242, 242));
        btAddDomestic.setText("+");
        btAddDomestic.setActionCommand("Añadir");
        btAddDomestic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btAddDomestic.setFocusPainted(false);
        btAddDomestic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddDomesticActionPerformed(evt);
            }
        });
        bg.add(btAddDomestic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 50, 30));

        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 2, 90, 45));

        lbDomesticTitle1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbDomesticTitle1.setForeground(new java.awt.Color(255, 153, 0));
        lbDomesticTitle1.setText("Nuevo ");
        bg.add(lbDomesticTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        lbDomesticTitle2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbDomesticTitle2.setForeground(new java.awt.Color(69, 106, 48));
        lbDomesticTitle2.setText("Animal");
        bg.add(lbDomesticTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 62, -1));

        lbDomesticTitle3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbDomesticTitle3.setForeground(new java.awt.Color(188, 38, 73));
        lbDomesticTitle3.setText("Doméstico");
        bg.add(lbDomesticTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 20, 100, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddDomesticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddDomesticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddDomesticActionPerformed

    private void txNameDomesticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameDomesticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNameDomesticActionPerformed

    private void txPsycheDomesticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPsycheDomesticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPsycheDomesticActionPerformed

    private void txRaceDomesticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRaceDomesticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txRaceDomesticActionPerformed

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
                new LOADomesticAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddDomestic;
    private javax.swing.JComboBox<String> cbOriginDomestic;
    private javax.swing.JComboBox<String> cbSexDomestic;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbDietDomestic;
    private java.awt.Label lbDomesticTitle1;
    private java.awt.Label lbDomesticTitle2;
    private java.awt.Label lbDomesticTitle3;
    private javax.swing.JLabel lbNameDomestic;
    private javax.swing.JLabel lbOriginDomestic;
    private javax.swing.JLabel lbPsycheDomestic;
    private javax.swing.JLabel lbRaceDomestic;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JLabel lbsexDomestic;
    private javax.swing.JTextField txNameDomestic;
    private javax.swing.JTextField txPsycheDomestic;
    private javax.swing.JTextField txRaceDomestic;
    private javax.swing.JTextArea txlDietDomestic;
    // End of variables declaration//GEN-END:variables
}
