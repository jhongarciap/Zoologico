package View.Administrative;

import static Utilities.AdExcel.sumBillExcel;
import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import static Utilities.loadExcelDataToTable.updateTableFromTwoExcelFiles;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.UIManager;

/**
 *
 * @author juan.castro17
 */
public class AD1 extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public AD1() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Reportes");

        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconAdminZOO.png"));
        this.setIconImage(faviconX1);

        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/ZRVC@3x.png"));
        lbZRVLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZRVLogo.getWidth(), lbZRVLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

        Image logoZoo = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZoo.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGeneratedReports1 = new javax.swing.JTable();
        lbTotalExpenses = new java.awt.Label();
        lbGeneratedReports = new java.awt.Label();
        lbTotalExpensesValue = new java.awt.Label();
        lbTotalIncomes = new java.awt.Label();
        lbTotalIncomesValue = new java.awt.Label();
        lbTotal = new java.awt.Label();
        lbTotalValue = new java.awt.Label();
        btGeneratePDF1 = new javax.swing.JButton();
        lbReportType = new java.awt.Label();
        lbReportTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
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

        tbGeneratedReports1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "FECHA", "CÓDIGO", "VALOR", "DESCUENTO", "CANTIDAD", "VALOR TOTAL", "Cliente", "ID PRODUCTO", "PRODUCTO"
            }
        ));
        jScrollPane1.setViewportView(tbGeneratedReports1);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 35, 680, 280);

        lbTotalExpenses.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalExpenses.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTotalExpenses.setForeground(new java.awt.Color(255, 255, 255));
        lbTotalExpenses.setText("Gastos totales");
        lbTotalExpenses.setVisible(false);
        bgPanelRound.add(lbTotalExpenses);
        lbTotalExpenses.setBounds(10, 350, 140, 32);

        lbGeneratedReports.setBackground(new java.awt.Color(51, 51, 51));
        lbGeneratedReports.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbGeneratedReports.setForeground(new java.awt.Color(255, 255, 255));
        lbGeneratedReports.setText("Reportes Generados");
        bgPanelRound.add(lbGeneratedReports);
        lbGeneratedReports.setBounds(10, 0, 240, 32);

        lbTotalExpensesValue.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalExpensesValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbTotalExpensesValue.setForeground(new java.awt.Color(255, 153, 0));
        lbTotalExpensesValue.setText("$00.000,00");
        lbTotalExpensesValue.setVisible(false);
        bgPanelRound.add(lbTotalExpensesValue);
        lbTotalExpensesValue.setBounds(160, 350, 140, 32);

        lbTotalIncomes.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalIncomes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTotalIncomes.setForeground(new java.awt.Color(255, 255, 255));
        lbTotalIncomes.setText("Ingresos totales");
        lbTotalIncomes.setVisible(false);
        bgPanelRound.add(lbTotalIncomes);
        lbTotalIncomes.setBounds(10, 320, 150, 32);

        lbTotalIncomesValue.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalIncomesValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbTotalIncomesValue.setForeground(new java.awt.Color(255, 153, 0));
        lbTotalIncomesValue.setText("$00.000,00");
        lbTotalIncomesValue.setVisible(false);
        bgPanelRound.add(lbTotalIncomesValue);
        lbTotalIncomesValue.setBounds(160, 320, 140, 32);

        lbTotal.setBackground(new java.awt.Color(51, 51, 51));
        lbTotal.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTotal.setText("Total");
        bgPanelRound.add(lbTotal);
        lbTotal.setBounds(30, 330, 60, 40);

        lbTotalValue.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalValue.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        lbTotalValue.setForeground(new java.awt.Color(255, 153, 0));
        lbTotalValue.setText("$00.000,00");
        bgPanelRound.add(lbTotalValue);
        lbTotalValue.setBounds(100, 330, 160, 40);

        btGeneratePDF1.setText("Generar PDF");
        btGeneratePDF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeneratePDF1ActionPerformed(evt);
            }
        });
        bgPanelRound.add(btGeneratePDF1);
        btGeneratePDF1.setBounds(550, 340, 130, 23);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 390));

        lbReportType.setBackground(new java.awt.Color(35, 35, 35));
        lbReportType.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbReportType.setForeground(new java.awt.Color(255, 255, 255));
        lbReportType.setText("Ventas Totales");
        bg.add(lbReportType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 20));

        lbReportTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbReportTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbReportTitle.setForeground(new java.awt.Color(255, 153, 0));
        lbReportTitle.setText("Reportes de Contabilidad");
        bg.add(lbReportTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

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

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS1 MainScreen = new IS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked
    File file1 = new File("rom/Bills/BillSale.xlsx");
    File file2 = new File("rom/Bills/BillShopping.xlsx");

    private void btGeneratePDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeneratePDF1ActionPerformed
        updateTableFromExcel(tbGeneratedReports1, file1);
        Float sales = sumBillExcel(file1);
        lbTotalValue.setText("$" + sales);
    }//GEN-LAST:event_btGeneratePDF1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {

        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AD1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btGeneratePDF1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lbGeneratedReports;
    private java.awt.Label lbReportTitle;
    private java.awt.Label lbReportType;
    private java.awt.Label lbTotal;
    private java.awt.Label lbTotalExpenses;
    private java.awt.Label lbTotalExpensesValue;
    private java.awt.Label lbTotalIncomes;
    private java.awt.Label lbTotalIncomesValue;
    public static java.awt.Label lbTotalValue;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    public static javax.swing.JTable tbGeneratedReports1;
    // End of variables declaration//GEN-END:variables
}
