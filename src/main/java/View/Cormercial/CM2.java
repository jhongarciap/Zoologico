package View.Cormercial;

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
public class CM2 extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public CM2() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup(); // Sets the FlatLaf LookAndFeel as the main theme for the JFrame.
        initComponents();
        
        this.setLocationRelativeTo(null); //Centers the window on-screen.
        this.setTitle("Compras"); // Set the title for the JFrame.
        
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconCommZOO.png"));
        this.setIconImage(faviconX1);
        
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/ZRVC@3x.png"));
        lbZRVLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZRVLogo.getWidth(), lbZRVLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZoo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZoo.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducts = new javax.swing.JTable();
        lbTotalPurchase = new java.awt.Label();
        lbTotalPurchaseValue = new java.awt.Label();
        btNewPurchase = new javax.swing.JButton();
        btBill = new javax.swing.JButton();
        lbProduct = new java.awt.Label();
        lbPurchasesTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        cbProduct = new javax.swing.JComboBox<>();
        btAddProduct = new javax.swing.JButton();
        lbAmount = new java.awt.Label();
        spAmount = new javax.swing.JSpinner();
        lbZooLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(35, 35, 35));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgPanelRound.setBackground(new java.awt.Color(51, 51, 51));
        bgPanelRound.setRoundBottomLeft(15);
        bgPanelRound.setRoundBottomRight(15);
        bgPanelRound.setRoundTopLeft(15);
        bgPanelRound.setRoundTopRight(15);
        bgPanelRound.setLayout(null);

        tbProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod", "Producto", "Cantidad", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tbProducts);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 15, 680, 300);

        lbTotalPurchase.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalPurchase.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbTotalPurchase.setForeground(new java.awt.Color(255, 255, 255));
        lbTotalPurchase.setText("Valor total de compra");
        bgPanelRound.add(lbTotalPurchase);
        lbTotalPurchase.setBounds(10, 330, 220, 40);

        lbTotalPurchaseValue.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalPurchaseValue.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbTotalPurchaseValue.setForeground(new java.awt.Color(188, 38, 73));
        lbTotalPurchaseValue.setText("$00.000,00");
        bgPanelRound.add(lbTotalPurchaseValue);
        lbTotalPurchaseValue.setBounds(240, 330, 160, 40);

        btNewPurchase.setBackground(new java.awt.Color(51, 51, 51));
        btNewPurchase.setForeground(new java.awt.Color(255, 255, 255));
        btNewPurchase.setText("Nueva compra");
        btNewPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewPurchaseActionPerformed(evt);
            }
        });
        bgPanelRound.add(btNewPurchase);
        btNewPurchase.setBounds(560, 357, 130, 23);

        btBill.setBackground(new java.awt.Color(51, 51, 51));
        btBill.setForeground(new java.awt.Color(255, 255, 255));
        btBill.setText("Facturar");
        bgPanelRound.add(btBill);
        btBill.setBounds(560, 325, 130, 23);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 390));

        lbProduct.setBackground(new java.awt.Color(35, 35, 35));
        lbProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbProduct.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct.setText("Producto");
        bg.add(lbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        lbPurchasesTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbPurchasesTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbPurchasesTitle.setForeground(new java.awt.Color(188, 38, 73));
        lbPurchasesTitle.setText("Compras");
        bg.add(lbPurchasesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        cbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bg.add(cbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, -1));

        btAddProduct.setText("Agregar producto");
        btAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductActionPerformed(evt);
            }
        });
        bg.add(btAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 130, -1));

        lbAmount.setBackground(new java.awt.Color(35, 35, 35));
        lbAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbAmount.setForeground(new java.awt.Color(255, 255, 255));
        lbAmount.setText("Cantidad");
        bg.add(lbAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 70, 20));
        bg.add(spAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 50, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAddProductActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS2 MainScreen = new IS2();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btNewPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewPurchaseActionPerformed

    }//GEN-LAST:event_btNewPurchaseActionPerformed

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
                new CM2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddProduct;
    private javax.swing.JButton btBill;
    private javax.swing.JButton btNewPurchase;
    private javax.swing.JComboBox<String> cbProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lbAmount;
    private java.awt.Label lbProduct;
    private java.awt.Label lbPurchasesTitle;
    private java.awt.Label lbTotalPurchase;
    private java.awt.Label lbTotalPurchaseValue;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JSpinner spAmount;
    private javax.swing.JTable tbProducts;
    // End of variables declaration//GEN-END:variables
}
