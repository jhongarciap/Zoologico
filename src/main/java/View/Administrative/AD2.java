package View.Administrative;

import static Utilities.AdExcel.deleteRow;
import static Utilities.AdExcel.getRow;
import static Utilities.AdExcel.rowToVector;
import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author juan.castro17
 */
public class AD2 extends javax.swing.JFrame {

    File file = new File("rom/Employees/Employees.xlsx");
    String sheetName = "Employees";

    public AD2() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();

        this.setLocationRelativeTo(null);
        this.setTitle("Trabajadores");

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
        spTableWorkers = new javax.swing.JScrollPane();
        tbGeneratedReports = new javax.swing.JTable();
        lbPro = new java.awt.Label();
        lbWorkers = new java.awt.Label();
        lbName = new java.awt.Label();
        lbFullNameWorker = new java.awt.Label();
        btNewWorker = new javax.swing.JButton();
        btDeleteWorker = new javax.swing.JButton();
        lbIDWorker = new java.awt.Label();
        lbName1 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbFuntionWorker = new javax.swing.JTextArea();
        lbIDworker = new java.awt.Label();
        lbWorkersTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        txIDWorker = new javax.swing.JTextField();
        lbZooLogo = new javax.swing.JLabel();
        lbAdvert = new javax.swing.JLabel();

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

        tbGeneratedReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "Apellido", "Funciones"
            }
        ));
        spTableWorkers.setViewportView(tbGeneratedReports);
        tbGeneratedReports.getAccessibleContext().setAccessibleDescription("");

        bgPanelRound.add(spTableWorkers);
        spTableWorkers.setBounds(10, 35, 680, 240);

        lbPro.setBackground(new java.awt.Color(51, 51, 51));
        lbPro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPro.setForeground(new java.awt.Color(255, 255, 255));
        lbPro.setText("ID:");
        bgPanelRound.add(lbPro);
        lbPro.setBounds(20, 280, 30, 32);

        lbWorkers.setBackground(new java.awt.Color(51, 51, 51));
        lbWorkers.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbWorkers.setForeground(new java.awt.Color(255, 255, 255));
        lbWorkers.setText("Trabajadores");
        bgPanelRound.add(lbWorkers);
        lbWorkers.setBounds(10, 0, 296, 32);

        lbName.setBackground(new java.awt.Color(51, 51, 51));
        lbName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Nombre Completo:");
        bgPanelRound.add(lbName);
        lbName.setBounds(210, 280, 171, 32);

        lbFullNameWorker.setBackground(new java.awt.Color(51, 51, 51));
        lbFullNameWorker.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbFullNameWorker.setForeground(new java.awt.Color(255, 153, 0));
        bgPanelRound.add(lbFullNameWorker);
        lbFullNameWorker.setBounds(380, 280, 310, 32);

        btNewWorker.setBackground(new java.awt.Color(51, 51, 51));
        btNewWorker.setForeground(new java.awt.Color(255, 255, 255));
        btNewWorker.setText("Agregar Empleado");
        btNewWorker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNewWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewWorkerActionPerformed(evt);
            }
        });
        bgPanelRound.add(btNewWorker);
        btNewWorker.setBounds(550, 330, 130, 23);

        btDeleteWorker.setBackground(new java.awt.Color(51, 51, 51));
        btDeleteWorker.setForeground(new java.awt.Color(255, 255, 255));
        btDeleteWorker.setText("Eliminar Empleado");
        btDeleteWorker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeleteWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteWorkerActionPerformed(evt);
            }
        });
        bgPanelRound.add(btDeleteWorker);
        btDeleteWorker.setBounds(550, 360, 130, 23);

        lbIDWorker.setBackground(new java.awt.Color(51, 51, 51));
        lbIDWorker.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbIDWorker.setForeground(new java.awt.Color(255, 153, 0));
        bgPanelRound.add(lbIDWorker);
        lbIDWorker.setBounds(60, 280, 130, 32);

        lbName1.setBackground(new java.awt.Color(51, 51, 51));
        lbName1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbName1.setForeground(new java.awt.Color(255, 255, 255));
        lbName1.setText("Funciones:");
        bgPanelRound.add(lbName1);
        lbName1.setBounds(20, 330, 110, 32);

        lbFuntionWorker.setEditable(false);
        lbFuntionWorker.setBackground(new java.awt.Color(51, 51, 51));
        lbFuntionWorker.setColumns(20);
        lbFuntionWorker.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbFuntionWorker.setForeground(new java.awt.Color(255, 153, 0));
        lbFuntionWorker.setRows(5);
        lbFuntionWorker.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane2.setViewportView(lbFuntionWorker);

        bgPanelRound.add(jScrollPane2);
        jScrollPane2.setBounds(140, 316, 400, 70);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 390));

        lbIDworker.setBackground(new java.awt.Color(35, 35, 35));
        lbIDworker.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbIDworker.setForeground(new java.awt.Color(255, 255, 255));
        lbIDworker.setText("Trabajador ID:");
        bg.add(lbIDworker, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        lbWorkersTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbWorkersTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbWorkersTitle.setForeground(new java.awt.Color(255, 153, 0));
        lbWorkersTitle.setText("Recursos Humanos");
        bg.add(lbWorkersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        btSearch.setText("Buscar");
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        bg.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 70, 20));

        txIDWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDWorkerActionPerformed(evt);
            }
        });
        bg.add(txIDWorker, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));

        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 110, 20));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS1 MainScreen = new IS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btNewWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewWorkerActionPerformed
        ADAdd MainScreen = new ADAdd();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_btNewWorkerActionPerformed

    private void btDeleteWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteWorkerActionPerformed
        String id = txIDWorker.getText();
        String tex = "";
        lbIDWorker.setText(tex);
        lbFullNameWorker.setText(tex);
        lbFuntionWorker.setText(tex);
        deleteRow(id, file, sheetName, 0);
        updateTableFromExcel(tbGeneratedReports, file);

    }//GEN-LAST:event_btDeleteWorkerActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        if (txIDWorker.getText().equals("")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            String id = txIDWorker.getText();
            Row row = getRow(id, file, sheetName, 0);
            String[] vector = rowToVector(row);
            lbIDWorker.setText(vector[0]);
            lbFullNameWorker.setText(vector[1] + " " + vector[2]);
            lbFuntionWorker.setText(vector[3]);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void txIDWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDWorkerActionPerformed

    }//GEN-LAST:event_txIDWorkerActionPerformed

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
                new AD2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btDeleteWorker;
    private javax.swing.JButton btNewWorker;
    private javax.swing.JButton btSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAdvert;
    private java.awt.Label lbFullNameWorker;
    private javax.swing.JTextArea lbFuntionWorker;
    private java.awt.Label lbIDWorker;
    private java.awt.Label lbIDworker;
    private java.awt.Label lbName;
    private java.awt.Label lbName1;
    private java.awt.Label lbPro;
    private java.awt.Label lbWorkers;
    private java.awt.Label lbWorkersTitle;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JScrollPane spTableWorkers;
    public static javax.swing.JTable tbGeneratedReports;
    private javax.swing.JTextField txIDWorker;
    // End of variables declaration//GEN-END:variables
}
