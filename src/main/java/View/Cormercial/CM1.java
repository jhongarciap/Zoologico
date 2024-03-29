package View.Cormercial;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import Model.SaleBill;
import static Utilities.CurrentDate.currentDate;
import Control.ComercialDepartment.ArrayListBillSale;
import Utilities.AdExcel;
import static Utilities.AdExcel.getRow;
import static Utilities.AdExcel.rowToVector;
import Utilities.Checker;
import java.io.File;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author juan.castro17
 */
public class CM1 extends javax.swing.JFrame {

    ArrayListBillSale billSale = new ArrayListBillSale();
    ArrayList<SaleBill> sales = new ArrayList<>();
    File file = new File("rom/Plans/Plans.xlsx");
    AdExcel utils = new AdExcel();

    ArrayList<String> productIdColumn = utils.getColumn(file, 0);
    ArrayList<String> productColumn = utils.getColumn(file, 1);
    ArrayList<Float> valueColumn = utils.getColumnFloat(file, 2);

    public CM1() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Ventas");

        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconCommZOO.png"));
        this.setIconImage(faviconX1);

        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/ZRVC@3x.png"));
        lbZRVLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZRVLogo.getWidth(), lbZRVLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZoo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZoo.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        for (int i = 0; i < productColumn.size(); i++) {
            cbProduct.addItem(productColumn.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducts = new javax.swing.JTable();
        lbTotalSaleValue = new java.awt.Label();
        btNewSale = new javax.swing.JButton();
        lbTotalSale2 = new java.awt.Label();
        LbVentas = new javax.swing.JLabel();
        lbPlan = new javax.swing.JLabel();
        txDelete = new javax.swing.JTextField();
        btDeleteProduct = new javax.swing.JButton();
        lbProducto = new java.awt.Label();
        lbSalesTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        cbProduct = new javax.swing.JComboBox<>();
        lbClient = new java.awt.Label();
        spAmount = new javax.swing.JSpinner();
        lbZooLogo = new javax.swing.JLabel();
        lbDiscount = new java.awt.Label();
        txDiscount = new javax.swing.JTextField();
        lbAmount = new java.awt.Label();
        lbAdvertise = new javax.swing.JLabel();
        txClient = new javax.swing.JTextField();
        btAddProduct = new javax.swing.JButton();

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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Cod", "Valor", "Descuento", "Cantidad", "Total Value", "Cliente", "Producto", "ID"
            }
        ));
        jScrollPane1.setViewportView(tbProducts);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 680, 180);

        lbTotalSaleValue.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalSaleValue.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbTotalSaleValue.setForeground(new java.awt.Color(188, 38, 73));
        lbTotalSaleValue.setText("$0,0");
        bgPanelRound.add(lbTotalSaleValue);
        lbTotalSaleValue.setBounds(130, 270, 140, 40);

        btNewSale.setBackground(new java.awt.Color(51, 51, 51));
        btNewSale.setForeground(new java.awt.Color(255, 255, 255));
        btNewSale.setText("Nueva venta");
        btNewSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNewSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewSaleActionPerformed(evt);
            }
        });
        bgPanelRound.add(btNewSale);
        btNewSale.setBounds(560, 270, 130, 23);

        lbTotalSale2.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalSale2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbTotalSale2.setForeground(new java.awt.Color(255, 255, 255));
        lbTotalSale2.setText("Valor total");
        bgPanelRound.add(lbTotalSale2);
        lbTotalSale2.setBounds(10, 270, 110, 40);

        LbVentas.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        LbVentas.setForeground(new java.awt.Color(188, 38, 73));
        bgPanelRound.add(LbVentas);
        LbVentas.setBounds(20, 16, 270, 20);

        lbPlan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPlan.setForeground(new java.awt.Color(242, 242, 242));
        bgPanelRound.add(lbPlan);
        lbPlan.setBounds(20, 40, 670, 20);
        bgPanelRound.add(txDelete);
        txDelete.setBounds(390, 270, 160, 22);

        btDeleteProduct.setText("Eliminar");
        btDeleteProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteProductActionPerformed(evt);
            }
        });
        bgPanelRound.add(btDeleteProduct);
        btDeleteProduct.setBounds(310, 270, 73, 23);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 700, 320));

        lbProducto.setBackground(new java.awt.Color(35, 35, 35));
        lbProducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbProducto.setForeground(new java.awt.Color(255, 255, 255));
        lbProducto.setText("Producto");
        bg.add(lbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 20));

        lbSalesTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbSalesTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbSalesTitle.setForeground(new java.awt.Color(188, 38, 73));
        lbSalesTitle.setText("Ventas");
        bg.add(lbSalesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        cbProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un producto" }));
        cbProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductActionPerformed(evt);
            }
        });
        bg.add(cbProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        lbClient.setBackground(new java.awt.Color(35, 35, 35));
        lbClient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbClient.setForeground(new java.awt.Color(255, 255, 255));
        lbClient.setText("Cliente");
        bg.add(lbClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 50, 20));
        bg.add(spAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 50, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));

        lbDiscount.setBackground(new java.awt.Color(35, 35, 35));
        lbDiscount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lbDiscount.setText("Descuento");
        bg.add(lbDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        txDiscount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txDiscount.setForeground(new java.awt.Color(188, 38, 73));
        bg.add(txDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 130, 20));

        lbAmount.setBackground(new java.awt.Color(35, 35, 35));
        lbAmount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbAmount.setForeground(new java.awt.Color(255, 255, 255));
        lbAmount.setText("Cantidad");
        bg.add(lbAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        lbAdvertise.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvertise, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 130, 20));
        bg.add(txClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 160, -1));

        btAddProduct.setText("Añadir");
        btAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddProductActionPerformed(evt);
            }
        });
        bg.add(btAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS2 MainScreen = new IS2();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btNewSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewSaleActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbProducts.getModel();
        model.setRowCount(0);
        billSale.clearAllBillsSales();

    }//GEN-LAST:event_btNewSaleActionPerformed

    private void cbProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductActionPerformed
        if (cbProduct.getSelectedIndex() != 0) {
            Row row = getRow(cbProduct.getSelectedItem().toString(), file, "Plans", 1);
            String[] vector = rowToVector(row);
            LbVentas.setText("Informacion de la venta:");
            lbPlan.setText("El producto " + vector[1] + " con ID " + vector[0] + ", tiene un valor de: $" + vector[2]);
        }
    }//GEN-LAST:event_cbProductActionPerformed

    private void btAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddProductActionPerformed
        int x = (Integer) spAmount.getValue();
        if (txDiscount.getText().equals("")
                || txClient.getText().equals("")
                || x <= 0
                || cbProduct.getSelectedIndex() == 0
                || !Checker.FloatChecker(txDiscount.getText())) {
            lbAdvertise.setText("Hay campos inválidos.");
        } else {
            lbAdvertise.setText("");

            float y = 0;

            Float value = valueColumn.get(cbProduct.getSelectedIndex() - 1);
            String productId = productIdColumn.get(cbProduct.getSelectedIndex() - 1);
            String product = productColumn.get(cbProduct.getSelectedIndex() - 1);
            float discount = Float.parseFloat(txDiscount.getText());

            SaleBill newSaleBill = new SaleBill("213123", currentDate(), value, discount, x, TOP_ALIGNMENT, txClient.getText(), product, productId);
            billSale.add(newSaleBill);
            billSale.saveExcel();
            billSale.printBillsToTable(tbProducts);
            String total = billSale.getTotalSales();
            lbTotalSaleValue.setText(total);
            txDiscount.setText("");
            txClient.setText("");
            LbVentas.setText("");
            lbPlan.setText("");
        }
    }//GEN-LAST:event_btAddProductActionPerformed

    private void btDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteProductActionPerformed
        if (txDelete.getText().equals("")) {
            lbAdvertise.setText("Hay campos vacios");
        } else {
            lbAdvertise.setText("");
            File file = new File("rom/Bills/BillSale.xlsx");
            String sheetName = "BillSale";
            AdExcel.deleteRow(txDelete.getText(), file, sheetName, 1);
            billSale.removeBillSaleCode(txDelete.getText());
            billSale.printBillsToTable(tbProducts);
            String total = billSale.getTotalSales();
            lbTotalSaleValue.setText(total);
        }
    }//GEN-LAST:event_btDeleteProductActionPerformed

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
                new CM1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbVentas;
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddProduct;
    private javax.swing.JButton btDeleteProduct;
    private javax.swing.JButton btNewSale;
    private javax.swing.JComboBox<String> cbProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAdvertise;
    private java.awt.Label lbAmount;
    private java.awt.Label lbClient;
    private java.awt.Label lbDiscount;
    private javax.swing.JLabel lbPlan;
    private java.awt.Label lbProducto;
    private java.awt.Label lbSalesTitle;
    private java.awt.Label lbTotalSale2;
    private java.awt.Label lbTotalSaleValue;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JSpinner spAmount;
    public static javax.swing.JTable tbProducts;
    private javax.swing.JTextField txClient;
    private javax.swing.JTextField txDelete;
    private javax.swing.JTextField txDiscount;
    // End of variables declaration//GEN-END:variables
}
