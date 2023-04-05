package com.zoosantafe.zoologico;

import View.Cormercial.CM1;
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
public class CMProAdd extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public CMProAdd() {
        //define tamaño
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup(); // Sets the FlatLaf LookAndFeel as the main theme for the JFrame.
        initComponents();
        //ubica el nombre de la ventana 
        this.setLocationRelativeTo(null); //Centers the window on-screen.
        this.setTitle("Departamento Comercial"); // Set the title for the JFrame.
        //icono de la ventana 
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconCommZOO.png"));
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
        lbName = new javax.swing.JLabel();
        txName = new javax.swing.JTextField();
        lbType = new javax.swing.JLabel();
        txAnimal = new javax.swing.JTextField();
        lbAnimal = new javax.swing.JLabel();
        lbDetails = new javax.swing.JLabel();
        spDetails = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txType = new javax.swing.JTextField();
        btLogisticSell = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbSellTitle = new java.awt.Label();

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

        lbName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(242, 242, 242));
        lbName.setText("Nombre:");
        bgPanelRound.add(lbName);
        lbName.setBounds(10, 10, 70, 16);

        txName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txName.setText("Ingrese el nombre de la venta");
        txName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameActionPerformed(evt);
            }
        });
        bgPanelRound.add(txName);
        txName.setBounds(90, 10, 180, 22);

        lbType.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbType.setForeground(new java.awt.Color(242, 242, 242));
        lbType.setText("Tipo:");
        bgPanelRound.add(lbType);
        lbType.setBounds(10, 40, 70, 16);

        txAnimal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txAnimal.setText("Ingrese el animal de la venta");
        txAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txAnimalActionPerformed(evt);
            }
        });
        bgPanelRound.add(txAnimal);
        txAnimal.setBounds(90, 70, 180, 22);

        lbAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbAnimal.setForeground(new java.awt.Color(242, 242, 242));
        lbAnimal.setText("Animal:");
        bgPanelRound.add(lbAnimal);
        lbAnimal.setBounds(10, 70, 70, 16);

        lbDetails.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbDetails.setForeground(new java.awt.Color(242, 242, 242));
        lbDetails.setText("Especificaciones:");
        bgPanelRound.add(lbDetails);
        lbDetails.setBounds(10, 100, 160, 16);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Ingresa especificaciones de la venta");
        spDetails.setViewportView(jTextArea1);

        bgPanelRound.add(spDetails);
        spDetails.setBounds(10, 120, 260, 130);

        txType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txType.setText("Ingrese el tipo de venta");
        txType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTypeActionPerformed(evt);
            }
        });
        bgPanelRound.add(txType);
        txType.setBounds(90, 40, 180, 22);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 260));

        btLogisticSell.setBackground(new java.awt.Color(188, 38, 73));
        btLogisticSell.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btLogisticSell.setForeground(new java.awt.Color(242, 242, 242));
        btLogisticSell.setText("+");
        btLogisticSell.setActionCommand("Añadir");
        btLogisticSell.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLogisticSell.setFocusPainted(false);
        btLogisticSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogisticSellActionPerformed(evt);
            }
        });
        bg.add(btLogisticSell, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 50, 30));

        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2, 90, 45));

        lbSellTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSellTitle.setForeground(new java.awt.Color(188, 38, 73));
        lbSellTitle.setText("Nueva Venta");
        bg.add(lbSellTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogisticSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogisticSellActionPerformed
        CM1 MainScreen = new CM1();
        this.dispose();
        MainScreen.setVisible(true);                                
    }//GEN-LAST:event_btLogisticSellActionPerformed

    private void txNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNameActionPerformed

    private void txAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txAnimalActionPerformed

    private void txTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTypeActionPerformed

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
                new CMProAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btLogisticSell;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbAnimal;
    private javax.swing.JLabel lbDetails;
    private javax.swing.JLabel lbName;
    private java.awt.Label lbSellTitle;
    private javax.swing.JLabel lbType;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JScrollPane spDetails;
    private javax.swing.JTextField txAnimal;
    private javax.swing.JTextField txName;
    private javax.swing.JTextField txType;
    // End of variables declaration//GEN-END:variables
}