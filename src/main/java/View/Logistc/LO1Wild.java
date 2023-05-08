package View.Logistc;

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
public class LO1Wild extends javax.swing.JFrame {

    File file = new File("rom/Animals/Wilds.xlsx");
    String sheetName = "Wilds";

    public LO1Wild() {
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
        tbWildAnimals = new javax.swing.JTable();
        lbDietAnimal = new java.awt.Label();
        lbWildAnimalsHeadLine = new java.awt.Label();
        lbHabitatStatic = new java.awt.Label();
        lbHabitatWildAnimal = new java.awt.Label();
        lbNameStatic = new java.awt.Label();
        lbNameWildAnimal = new java.awt.Label();
        lbBreedStatic = new java.awt.Label();
        lbBreedWildAnimal = new java.awt.Label();
        lbGenderStatic = new java.awt.Label();
        lbGenderWildAnimal = new java.awt.Label();
        sbDietDomesticAnimal = new javax.swing.JScrollPane();
        taDietWildAnimal = new javax.swing.JTextArea();
        btRemoveWildAnimal = new javax.swing.JButton();
        lbAdvert = new java.awt.Label();
        lbManageWildAnimals = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        btSearchWildAnimal = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        txSearchWildAnimal = new javax.swing.JTextField();
        btAddWildAnimal = new javax.swing.JButton();
        lbAnimalType1 = new java.awt.Label();

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

        tbWildAnimals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Raza", "Sexo", "Hábitat", "Hábitat de nacimiento", "Peligrosidad"
            }
        ));
        jScrollPane1.setViewportView(tbWildAnimals);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 35, 680, 240);

        lbDietAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbDietAnimal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbDietAnimal.setForeground(new java.awt.Color(255, 255, 255));
        lbDietAnimal.setText("Dieta:");
        bgPanelRound.add(lbDietAnimal);
        lbDietAnimal.setBounds(20, 320, 70, 32);

        lbWildAnimalsHeadLine.setBackground(new java.awt.Color(51, 51, 51));
        lbWildAnimalsHeadLine.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbWildAnimalsHeadLine.setForeground(new java.awt.Color(255, 255, 255));
        lbWildAnimalsHeadLine.setText("Animales Salvajes");
        bgPanelRound.add(lbWildAnimalsHeadLine);
        lbWildAnimalsHeadLine.setBounds(10, 0, 296, 32);

        lbHabitatStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbHabitatStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbHabitatStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbHabitatStatic.setText("Hábitat:");
        bgPanelRound.add(lbHabitatStatic);
        lbHabitatStatic.setBounds(540, 280, 70, 32);

        lbHabitatWildAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbHabitatWildAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbHabitatWildAnimal.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbHabitatWildAnimal);
        lbHabitatWildAnimal.setBounds(620, 280, 70, 32);

        lbNameStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbNameStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNameStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbNameStatic.setText("Nombre:");
        bgPanelRound.add(lbNameStatic);
        lbNameStatic.setBounds(10, 280, 80, 32);

        lbNameWildAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbNameWildAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNameWildAnimal.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbNameWildAnimal);
        lbNameWildAnimal.setBounds(90, 280, 100, 32);

        lbBreedStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbBreedStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbBreedStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbBreedStatic.setText("Raza:");
        bgPanelRound.add(lbBreedStatic);
        lbBreedStatic.setBounds(190, 280, 53, 32);

        lbBreedWildAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbBreedWildAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbBreedWildAnimal.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbBreedWildAnimal);
        lbBreedWildAnimal.setBounds(250, 280, 120, 32);

        lbGenderStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbGenderStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbGenderStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbGenderStatic.setText("Sexo:");
        bgPanelRound.add(lbGenderStatic);
        lbGenderStatic.setBounds(370, 280, 56, 32);

        lbGenderWildAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbGenderWildAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbGenderWildAnimal.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbGenderWildAnimal);
        lbGenderWildAnimal.setBounds(430, 280, 70, 32);

        taDietWildAnimal.setColumns(20);
        taDietWildAnimal.setRows(5);
        sbDietDomesticAnimal.setViewportView(taDietWildAnimal);

        bgPanelRound.add(sbDietDomesticAnimal);
        sbDietDomesticAnimal.setBounds(90, 320, 450, 30);

        btRemoveWildAnimal.setText("Eliminar animal");
        btRemoveWildAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRemoveWildAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveWildAnimalActionPerformed(evt);
            }
        });
        bgPanelRound.add(btRemoveWildAnimal);
        btRemoveWildAnimal.setBounds(560, 320, 120, 23);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 700, 360));

        lbAdvert.setBackground(new java.awt.Color(35, 35, 35));
        lbAdvert.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, 20));

        lbManageWildAnimals.setBackground(new java.awt.Color(35, 35, 35));
        lbManageWildAnimals.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbManageWildAnimals.setForeground(new java.awt.Color(69, 106, 48));
        lbManageWildAnimals.setText("Administrar animales salvajes");
        bg.add(lbManageWildAnimals, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        btSearchWildAnimal.setText("Buscar");
        btSearchWildAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearchWildAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchWildAnimalActionPerformed(evt);
            }
        });
        bg.add(btSearchWildAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 70, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));
        bg.add(txSearchWildAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 490, -1));

        btAddWildAnimal.setText("Añadir animal");
        btAddWildAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddWildAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddWildAnimalActionPerformed(evt);
            }
        });
        bg.add(btAddWildAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 110, -1));

        lbAnimalType1.setBackground(new java.awt.Color(35, 35, 35));
        lbAnimalType1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbAnimalType1.setForeground(new java.awt.Color(255, 255, 255));
        lbAnimalType1.setText("Animal");
        bg.add(lbAnimalType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        ILS1 MainScreen = new ILS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btAddWildAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddWildAnimalActionPerformed
        LOAWildAdd MainScreen = new LOAWildAdd();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_btAddWildAnimalActionPerformed

    private void btRemoveWildAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveWildAnimalActionPerformed
        String name = txSearchWildAnimal.getText();
        String tex = "";
        lbNameWildAnimal.setText(tex);
        lbBreedWildAnimal.setText(tex);
        lbGenderWildAnimal.setText(tex);
        lbHabitatWildAnimal.setText(tex);
        taDietWildAnimal.setText(tex);
        deleteRow(name, file, sheetName, 0);
        updateTableFromExcel(tbWildAnimals, file);
    }//GEN-LAST:event_btRemoveWildAnimalActionPerformed

    private void btSearchWildAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchWildAnimalActionPerformed
        if (txSearchWildAnimal.getText().equals("")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            String name = txSearchWildAnimal.getText();
            Row row = getRow(name, file, sheetName, 0);
            String[] vector = rowToVector(row);
            lbNameWildAnimal.setText(vector[0]);
            lbBreedWildAnimal.setText(vector[1]);
            lbGenderWildAnimal.setText(vector[2]);
            lbHabitatWildAnimal.setText(vector[3]);
            taDietWildAnimal.setText(vector[6]);
        }
    }//GEN-LAST:event_btSearchWildAnimalActionPerformed

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
                new LO1Wild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddWildAnimal;
    private javax.swing.JButton btRemoveWildAnimal;
    private javax.swing.JButton btSearchWildAnimal;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lbAdvert;
    private java.awt.Label lbAnimalType1;
    private java.awt.Label lbBreedStatic;
    private java.awt.Label lbBreedWildAnimal;
    private java.awt.Label lbDietAnimal;
    private java.awt.Label lbGenderStatic;
    private java.awt.Label lbGenderWildAnimal;
    private java.awt.Label lbHabitatStatic;
    private java.awt.Label lbHabitatWildAnimal;
    private java.awt.Label lbManageWildAnimals;
    private java.awt.Label lbNameStatic;
    private java.awt.Label lbNameWildAnimal;
    private java.awt.Label lbWildAnimalsHeadLine;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JScrollPane sbDietDomesticAnimal;
    private javax.swing.JTextArea taDietWildAnimal;
    public static javax.swing.JTable tbWildAnimals;
    private javax.swing.JTextField txSearchWildAnimal;
    // End of variables declaration//GEN-END:variables
}
