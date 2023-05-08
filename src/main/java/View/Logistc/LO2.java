package View.Logistc;

import Utilities.AdExcel;
import Utilities.loadExcelDataToTable;
import View.Administrative.IS1;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author juan.castro17
 */
public class LO2 extends javax.swing.JFrame {

    public LO2() {
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

        generalTable();
        comboboxType();
        comboboxAnimal();
    }

    private void comboboxType() {
        AdExcel excel = new AdExcel();
        File file = new File("rom/Supply.xlsx");
        if (file.exists()) {
            ArrayList<String> columns = excel.getColumn(file, 0);
            for (String column : columns) {
                ArrayList<String> types = new ArrayList();
                for (int i = 0; i < cbSupplementType.getItemCount(); i++) {
                    types.add(cbSupplementType.getItemAt(i));
                }
                if (!types.contains(column)) {
                    cbSupplementType.addItem(column);
                }
            }
        }
    }

    private void comboboxAnimal() {
        AdExcel excel = new AdExcel();
        File file = new File("rom/Supply.xlsx");
        if (file.exists()) {
            ArrayList<String> columns = excel.getColumn(file, 2);
            for (String column : columns) {
                ArrayList<String> types = new ArrayList();
                for (int i = 0; i < cbSupplementAnimal.getItemCount(); i++) {
                    types.add(cbSupplementAnimal.getItemAt(i));
                }
                if (!types.contains(column)) {
                    cbSupplementAnimal.addItem(column);
                }
            }
        }
    }

    private void comboxAnimalType(String value) throws FileNotFoundException, IOException {
        cbSupplementAnimal.removeAllItems();
        cbSupplementAnimal.addItem("Todos");
        File file = new File("rom/Supply.xlsx");
        ArrayList<Row> typeRows = new ArrayList();
        ArrayList<String> columns = new ArrayList();
        if (file.exists()) {
            XSSFWorkbook workbook;
            try ( FileInputStream fis = new FileInputStream(file)) {
                workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheet("Supplys");
                for (int i = 0; i <= sheet.getLastRowNum(); i++) {
                    XSSFRow row = sheet.getRow(i);
                    if (row.getCell(0).getStringCellValue().equals(value)) {
                        typeRows.add(row);
                    }
                }
                for (Row row : typeRows) {
                    String nameValue = row.getCell(2).getStringCellValue();
                    columns.add(nameValue);
                }
                for (String column : columns) {
                    ArrayList<String> animals = new ArrayList();
                    for (int i = 0; i < cbSupplementAnimal.getItemCount(); i++) {
                        animals.add(cbSupplementAnimal.getItemAt(i));
                    }
                    if (!animals.contains(column) && true) {
                        cbSupplementAnimal.addItem(column);
                    }
                }
            }
        }
    }

    private void generalTable() {
        File file = new File("rom/Supply.xlsx");
        loadExcelDataToTable.updateTableFromExcel(tbGeneratedSupplements, file);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGeneratedSupplements = new javax.swing.JTable();
        lbGeneratedSupplements = new java.awt.Label();
        lbAnimalSupplementStatic = new java.awt.Label();
        btDeleteSupplement = new javax.swing.JButton();
        btCreateSupplement = new javax.swing.JButton();
        lbSupplementsSpecificationsStatic = new java.awt.Label();
        lbSupplementTypeStatic = new java.awt.Label();
        lbSuplementHeadLine = new java.awt.Label();
        lbSupplementTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        cbSupplementAnimal = new javax.swing.JComboBox<>();
        lbZooLogo = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        cbSupplementType = new javax.swing.JComboBox<>();

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

        tbGeneratedSupplements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Nombre", "Animal", "Cantidad", "Especificaciones"
            }
        ));
        jScrollPane1.setViewportView(tbGeneratedSupplements);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 35, 680, 230);

        lbGeneratedSupplements.setBackground(new java.awt.Color(51, 51, 51));
        lbGeneratedSupplements.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbGeneratedSupplements.setForeground(new java.awt.Color(69, 106, 48));
        lbGeneratedSupplements.setText("Suplementos");
        bgPanelRound.add(lbGeneratedSupplements);
        lbGeneratedSupplements.setBounds(10, 0, 296, 32);

        lbAnimalSupplementStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbAnimalSupplementStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbAnimalSupplementStatic.setForeground(new java.awt.Color(255, 255, 255));
        bgPanelRound.add(lbAnimalSupplementStatic);
        lbAnimalSupplementStatic.setBounds(18, 310, 4, 32);

        btDeleteSupplement.setBackground(new java.awt.Color(69, 106, 48));
        btDeleteSupplement.setForeground(new java.awt.Color(255, 255, 255));
        btDeleteSupplement.setText("Eliminar Suplemento");
        btDeleteSupplement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeleteSupplement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteSupplementActionPerformed(evt);
            }
        });
        bgPanelRound.add(btDeleteSupplement);
        btDeleteSupplement.setBounds(280, 320, 150, 23);

        btCreateSupplement.setBackground(new java.awt.Color(69, 106, 48));
        btCreateSupplement.setForeground(new java.awt.Color(255, 255, 255));
        btCreateSupplement.setText("Crear Suplemento");
        btCreateSupplement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCreateSupplement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateSupplementActionPerformed(evt);
            }
        });
        bgPanelRound.add(btCreateSupplement);
        btCreateSupplement.setBounds(280, 280, 150, 23);

        lbSupplementsSpecificationsStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbSupplementsSpecificationsStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSupplementsSpecificationsStatic.setForeground(new java.awt.Color(255, 255, 255));
        bgPanelRound.add(lbSupplementsSpecificationsStatic);
        lbSupplementsSpecificationsStatic.setBounds(250, 280, 4, 32);

        lbSupplementTypeStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbSupplementTypeStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSupplementTypeStatic.setForeground(new java.awt.Color(255, 255, 255));
        bgPanelRound.add(lbSupplementTypeStatic);
        lbSupplementTypeStatic.setBounds(20, 280, 50, 32);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 700, 360));

        lbSuplementHeadLine.setBackground(new java.awt.Color(35, 35, 35));
        lbSuplementHeadLine.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSuplementHeadLine.setForeground(new java.awt.Color(255, 255, 255));
        lbSuplementHeadLine.setText("Suplemento");
        bg.add(lbSuplementHeadLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 20));

        lbSupplementTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbSupplementTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbSupplementTitle.setForeground(new java.awt.Color(69, 106, 48));
        lbSupplementTitle.setText("Suplementos");
        bg.add(lbSupplementTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        cbSupplementAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        cbSupplementAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSupplementAnimalActionPerformed(evt);
            }
        });
        bg.add(cbSupplementAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 240, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));

        btSearch.setBackground(new java.awt.Color(69, 106, 48));
        btSearch.setText("Buscar");
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        bg.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 70, -1));

        cbSupplementType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        cbSupplementType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSupplementTypeActionPerformed(evt);
            }
        });
        bg.add(cbSupplementType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 240, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS1 MainScreen = new IS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btCreateSupplementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateSupplementActionPerformed
        LO2Add MainScreen = new LO2Add();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_btCreateSupplementActionPerformed

    private void cbSupplementAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSupplementAnimalActionPerformed
        
    }//GEN-LAST:event_cbSupplementAnimalActionPerformed

    private void cbSupplementTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSupplementTypeActionPerformed
        if (cbSupplementType.getSelectedItem().toString().equals("Todos")) {
            comboboxAnimal();
        } else {
            try {
                comboxAnimalType(cbSupplementType.getSelectedItem().toString());
            } catch (IOException ex) {
                Logger.getLogger(LO2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cbSupplementTypeActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        File file = new File("rom/Supply.xlsx");
        if (cbSupplementType.getSelectedItem().toString().equals("Todos") && cbSupplementAnimal.getSelectedItem().toString().equals("Todos")) {
            generalTable();
        } else if (cbSupplementType.getSelectedItem().toString().equals("Todos")) {
            loadExcelDataToTable.updateTableFromExcelOneAtribute(tbGeneratedSupplements, file, cbSupplementAnimal.getSelectedItem().toString(), 2);
        } else if (cbSupplementAnimal.getSelectedItem().toString().equals("Todos")) {
            loadExcelDataToTable.updateTableFromExcelOneAtribute(tbGeneratedSupplements, file, cbSupplementType.getSelectedItem().toString(), 0);
        } else {
            loadExcelDataToTable.updateTableFromExcelTwoAtribute(tbGeneratedSupplements, file, cbSupplementType.getSelectedItem().toString(), 0, cbSupplementAnimal.getSelectedItem().toString(), 2);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void btDeleteSupplementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteSupplementActionPerformed
        LO2Delete jf = new LO2Delete();
        jf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btDeleteSupplementActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {

        }
        java.awt.EventQueue.invokeLater(() -> {
            new LO2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btCreateSupplement;
    private javax.swing.JButton btDeleteSupplement;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbSupplementAnimal;
    private javax.swing.JComboBox<String> cbSupplementType;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lbAnimalSupplementStatic;
    private java.awt.Label lbGeneratedSupplements;
    private java.awt.Label lbSuplementHeadLine;
    private java.awt.Label lbSupplementTitle;
    private java.awt.Label lbSupplementTypeStatic;
    private java.awt.Label lbSupplementsSpecificationsStatic;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    public static javax.swing.JTable tbGeneratedSupplements;
    // End of variables declaration//GEN-END:variables
}
