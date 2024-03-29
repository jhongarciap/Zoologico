package View.Logistc;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import Model.Supply;
import Control.LogisticDepartment.ArrayListSupply;
import Utilities.AdExcel;
import static Utilities.AdExcel.getRowsExcel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author juan.castro17
 */
public class LO2Add extends javax.swing.JFrame {

    public LO2Add() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Logístico");
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconLogiZOO.png"));
        this.setIconImage(faviconX1);
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));
        ComboBoxDinamico();
    }

    private void ComboBoxDinamico() {
        String[] urls = new String[3];
        urls[0] = "rom/Animals/Wilds.xlsx";
        urls[1] = "rom/Animals/Minors.xlsx";
        urls[2] = "rom/Animals/Domestics.xlsx";
        AdExcel column = new AdExcel();
        for (String url : urls) {
            File file = new File(url);
            if (file.exists()) {
                ArrayList<String> columns = column.getColumn(file, 1);
                for (int i = 0; i < columns.size(); i++) {
                    cbAnimalNewSupply.addItem(columns.get(i));
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jbNameNewSupply = new javax.swing.JLabel();
        txQuantityNewSupply = new javax.swing.JTextField();
        jbTypeNewSupply = new javax.swing.JLabel();
        jbSpecificationsNewSupply = new javax.swing.JLabel();
        jbQuantityNewSupply = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txSpecificationsNewSupply = new javax.swing.JTextArea();
        cbTypeNewSupply = new javax.swing.JComboBox<>();
        cbAnimalNewSupply = new javax.swing.JComboBox<>();
        cbHabitaMinor = new javax.swing.JComboBox<>();
        jbAnimalNewSupply1 = new javax.swing.JLabel();
        txNameNewSupply = new javax.swing.JTextField();
        btAddNewSupply = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lbNewSupplyTitle1 = new java.awt.Label();
        lbNewSupplyTitle2 = new java.awt.Label();
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

        jbNameNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbNameNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbNameNewSupply.setText("Nombre:");
        bgPanelRound.add(jbNameNewSupply);
        jbNameNewSupply.setBounds(10, 25, 70, 16);

        txQuantityNewSupply.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txQuantityNewSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txQuantityNewSupplyActionPerformed(evt);
            }
        });
        bgPanelRound.add(txQuantityNewSupply);
        txQuantityNewSupply.setBounds(90, 110, 180, 22);

        jbTypeNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbTypeNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbTypeNewSupply.setText("Tipo:");
        bgPanelRound.add(jbTypeNewSupply);
        jbTypeNewSupply.setBounds(10, 50, 70, 16);

        jbSpecificationsNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSpecificationsNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbSpecificationsNewSupply.setText("Especificaciones:");
        bgPanelRound.add(jbSpecificationsNewSupply);
        jbSpecificationsNewSupply.setBounds(10, 140, 150, 16);

        jbQuantityNewSupply.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbQuantityNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        jbQuantityNewSupply.setText("Cantidad:");
        bgPanelRound.add(jbQuantityNewSupply);
        jbQuantityNewSupply.setBounds(10, 110, 80, 16);

        txSpecificationsNewSupply.setColumns(20);
        txSpecificationsNewSupply.setRows(5);
        jScrollPane1.setViewportView(txSpecificationsNewSupply);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 260, 100);

        cbTypeNewSupply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Analgésicos", "Anestésicos", "Antibióticos", "Antifúngicos", "Antiinflamatorios", "Antiparasitarios", "Antivirales", "Alimento", "Hormonas", "Oftálmicos", "Suplementos", "Vitaminas", "Otro" }));
        bgPanelRound.add(cbTypeNewSupply);
        cbTypeNewSupply.setBounds(90, 50, 180, 22);

        cbAnimalNewSupply.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "León", "Jirafa" }));
        bgPanelRound.add(cbAnimalNewSupply);
        cbAnimalNewSupply.setBounds(90, 80, 180, 22);

        cbHabitaMinor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hábitad 1", "Hábitad 2", "Hábitad 3" }));
        bgPanelRound.add(cbHabitaMinor);
        cbHabitaMinor.setBounds(90, 80, 180, 22);

        jbAnimalNewSupply1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbAnimalNewSupply1.setForeground(new java.awt.Color(242, 242, 242));
        jbAnimalNewSupply1.setText("Animal:");
        bgPanelRound.add(jbAnimalNewSupply1);
        jbAnimalNewSupply1.setBounds(10, 80, 70, 16);

        txNameNewSupply.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txNameNewSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameNewSupplyActionPerformed(evt);
            }
        });
        bgPanelRound.add(txNameNewSupply);
        txNameNewSupply.setBounds(90, 20, 180, 22);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 270));

        btAddNewSupply.setBackground(new java.awt.Color(69, 106, 48));
        btAddNewSupply.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btAddNewSupply.setForeground(new java.awt.Color(242, 242, 242));
        btAddNewSupply.setText("+");
        btAddNewSupply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddNewSupply.setFocusPainted(false);
        btAddNewSupply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAddNewSupplyMouseClicked(evt);
            }
        });
        btAddNewSupply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddNewSupplyActionPerformed(evt);
            }
        });
        btAddNewSupply.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btAddNewSupplyKeyTyped(evt);
            }
        });
        bg.add(btAddNewSupply, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 50, 30));

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

        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 110, 20));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddNewSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddNewSupplyActionPerformed
        if (txQuantityNewSupply.getText().equals("")
                || cbTypeNewSupply.getSelectedItem().toString().equals("Seleccionar...")
                || cbAnimalNewSupply.getSelectedItem().toString().equals("Seleccionar...")
                || txSpecificationsNewSupply.getText().equals("")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            File file = new File("rom/Supply.xlsx");
            ArrayList<Row> data = getRowsExcel(file);
            boolean same = false;
            int r = 0;
            int num = 0;
            for (int rowIndex = 1; rowIndex < data.size(); rowIndex++) {
                Row row = data.get(rowIndex);
                Object[] rowData = new Object[row.getLastCellNum()];
                for (int i = 0; i < rowData.length; i++) {
                    if (row.getCell(0).getStringCellValue().equals(cbTypeNewSupply.getSelectedItem().toString())
                            && row.getCell(1).getStringCellValue().equals(txNameNewSupply.getText())
                            && row.getCell(2).getStringCellValue().equals(cbAnimalNewSupply.getSelectedItem().toString())
                            && row.getCell(4).getStringCellValue().equals(txSpecificationsNewSupply.getText())) {
                        r = i;
                        num = Integer.parseInt(row.getCell(3).getStringCellValue());
                        same = true;
                    }
                }
            }
            if (same == true) {
                XSSFWorkbook workbook = null;
                try ( FileInputStream fis = new FileInputStream(file)) {
                    workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheet("Supplys");
                    XSSFRow row = sheet.getRow(r);
                    if (row != null) {
                        XSSFCell cell = row.getCell(3);
                        if (cell != null) {
                            cell.setCellValue(String.valueOf(num + Integer.parseInt(txQuantityNewSupply.getText()))); // Set the new value
                        }
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LO2Add.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LO2Add.class.getName()).log(Level.SEVERE, null, ex);
                }
                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LO2Add.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(LO2Add.class.getName()).log(Level.SEVERE, null, ex);
                }
                LO2 MainScreen = new LO2();
                this.dispose();
                MainScreen.setVisible(true);
            } else {
                Supply supply = new Supply(cbTypeNewSupply.getSelectedItem().toString(),
                        txNameNewSupply.getText(),
                        cbAnimalNewSupply.getSelectedItem().toString(),
                        txQuantityNewSupply.getText(),
                        txSpecificationsNewSupply.getText());
                ArrayListSupply list = new ArrayListSupply();
                list.add(supply);
                list.saveExcel();
                LO2 MainScreen = new LO2();
                this.dispose();
                MainScreen.setVisible(true);
            }
        }
    }//GEN-LAST:event_btAddNewSupplyActionPerformed

    private void txQuantityNewSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txQuantityNewSupplyActionPerformed
        
    }//GEN-LAST:event_txQuantityNewSupplyActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        ILS1 MainScreen = new ILS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btAddNewSupplyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAddNewSupplyKeyTyped
        
    }//GEN-LAST:event_btAddNewSupplyKeyTyped

    private void btAddNewSupplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAddNewSupplyMouseClicked

    }//GEN-LAST:event_btAddNewSupplyMouseClicked

    private void txNameNewSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameNewSupplyActionPerformed
        
    }//GEN-LAST:event_txNameNewSupplyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {

        }
        java.awt.EventQueue.invokeLater(() -> {
            new LO2Add().setVisible(true);
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
    private javax.swing.JLabel jbAnimalNewSupply1;
    private javax.swing.JLabel jbNameNewSupply;
    private javax.swing.JLabel jbQuantityNewSupply;
    private javax.swing.JLabel jbSpecificationsNewSupply;
    private javax.swing.JLabel jbTypeNewSupply;
    private javax.swing.JLabel lbAdvert;
    private java.awt.Label lbNewSupplyTitle1;
    private java.awt.Label lbNewSupplyTitle2;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JTextField txNameNewSupply;
    private javax.swing.JTextField txQuantityNewSupply;
    private javax.swing.JTextArea txSpecificationsNewSupply;
    // End of variables declaration//GEN-END:variables
}
