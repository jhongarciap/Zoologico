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
public class LO1Domestic extends javax.swing.JFrame {

    File file = new File("rom/Animals/Domestics.xlsx");
    String sheetName = "Domestics";

    public LO1Domestic() {
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
        tbDomesticAnimals = new javax.swing.JTable();
        lbDietAnimal = new java.awt.Label();
        lbDomesticAnimalsHeadLine = new java.awt.Label();
        lbNameStatic = new java.awt.Label();
        lbNameDomesticAnimal = new java.awt.Label();
        lbBreedStatic = new java.awt.Label();
        lbBreedDomesticAnimal = new java.awt.Label();
        lbGenderStatic = new java.awt.Label();
        lbGenderDomesticAnimal = new java.awt.Label();
        sbDietDomesticAnimal = new javax.swing.JScrollPane();
        taDietDomesticAnimal = new javax.swing.JTextArea();
        btRemoveDomesticAnimal = new javax.swing.JButton();
        lbHabitatStatic2 = new java.awt.Label();
        lbHabitatDomesticAnimal2 = new java.awt.Label();
        lbAdvert = new java.awt.Label();
        lbManageDomesticAnimals = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        btSearchDomesticAnimal = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        txSearchDomesticAnimal = new javax.swing.JTextField();
        btAddDomesticAnimal = new javax.swing.JButton();
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

        tbDomesticAnimals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Raza", "Sexo", "Hábitat", "Origen", "Psique"
            }
        ));
        jScrollPane1.setViewportView(tbDomesticAnimals);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 35, 680, 240);

        lbDietAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbDietAnimal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbDietAnimal.setForeground(new java.awt.Color(255, 255, 255));
        lbDietAnimal.setText("Dieta:");
        bgPanelRound.add(lbDietAnimal);
        lbDietAnimal.setBounds(20, 320, 70, 32);

        lbDomesticAnimalsHeadLine.setBackground(new java.awt.Color(51, 51, 51));
        lbDomesticAnimalsHeadLine.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbDomesticAnimalsHeadLine.setForeground(new java.awt.Color(255, 255, 255));
        lbDomesticAnimalsHeadLine.setText("Animales Domésticos");
        bgPanelRound.add(lbDomesticAnimalsHeadLine);
        lbDomesticAnimalsHeadLine.setBounds(10, 0, 296, 32);

        lbNameStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbNameStatic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNameStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbNameStatic.setText("Nombre:");
        bgPanelRound.add(lbNameStatic);
        lbNameStatic.setBounds(10, 280, 80, 32);

        lbNameDomesticAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbNameDomesticAnimal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNameDomesticAnimal.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbNameDomesticAnimal);
        lbNameDomesticAnimal.setBounds(90, 280, 100, 32);

        lbBreedStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbBreedStatic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbBreedStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbBreedStatic.setText("Raza:");
        bgPanelRound.add(lbBreedStatic);
        lbBreedStatic.setBounds(200, 280, 41, 32);

        lbBreedDomesticAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbBreedDomesticAnimal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbBreedDomesticAnimal.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbBreedDomesticAnimal);
        lbBreedDomesticAnimal.setBounds(250, 280, 100, 32);

        lbGenderStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbGenderStatic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGenderStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbGenderStatic.setText("Sexo:");
        bgPanelRound.add(lbGenderStatic);
        lbGenderStatic.setBounds(350, 280, 43, 32);

        lbGenderDomesticAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbGenderDomesticAnimal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbGenderDomesticAnimal.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbGenderDomesticAnimal);
        lbGenderDomesticAnimal.setBounds(400, 280, 90, 32);

        taDietDomesticAnimal.setColumns(20);
        taDietDomesticAnimal.setRows(5);
        sbDietDomesticAnimal.setViewportView(taDietDomesticAnimal);

        bgPanelRound.add(sbDietDomesticAnimal);
        sbDietDomesticAnimal.setBounds(90, 320, 450, 30);

        btRemoveDomesticAnimal.setText("Eliminar animal");
        btRemoveDomesticAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRemoveDomesticAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveDomesticAnimalActionPerformed(evt);
            }
        });
        bgPanelRound.add(btRemoveDomesticAnimal);
        btRemoveDomesticAnimal.setBounds(560, 320, 120, 23);

        lbHabitatStatic2.setBackground(new java.awt.Color(51, 51, 51));
        lbHabitatStatic2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbHabitatStatic2.setForeground(new java.awt.Color(255, 255, 255));
        lbHabitatStatic2.setText("Hábitat:");
        bgPanelRound.add(lbHabitatStatic2);
        lbHabitatStatic2.setBounds(500, 280, 70, 32);

        lbHabitatDomesticAnimal2.setBackground(new java.awt.Color(51, 51, 51));
        lbHabitatDomesticAnimal2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbHabitatDomesticAnimal2.setForeground(new java.awt.Color(69, 106, 48));
        bgPanelRound.add(lbHabitatDomesticAnimal2);
        lbHabitatDomesticAnimal2.setBounds(570, 280, 120, 32);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 700, 360));

        lbAdvert.setBackground(new java.awt.Color(35, 35, 35));
        lbAdvert.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, 20));

        lbManageDomesticAnimals.setBackground(new java.awt.Color(35, 35, 35));
        lbManageDomesticAnimals.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbManageDomesticAnimals.setForeground(new java.awt.Color(69, 106, 48));
        lbManageDomesticAnimals.setText("Administrar animales domésticos");
        bg.add(lbManageDomesticAnimals, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        btSearchDomesticAnimal.setText("Buscar");
        btSearchDomesticAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearchDomesticAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchDomesticAnimalActionPerformed(evt);
            }
        });
        bg.add(btSearchDomesticAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 70, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));
        bg.add(txSearchDomesticAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 490, -1));

        btAddDomesticAnimal.setText("Añadir animal");
        btAddDomesticAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAddDomesticAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddDomesticAnimalActionPerformed(evt);
            }
        });
        bg.add(btAddDomesticAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 110, -1));

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

    private void btAddDomesticAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddDomesticAnimalActionPerformed
        LOADomesticAdd MainScreen = new LOADomesticAdd();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_btAddDomesticAnimalActionPerformed

    private void btRemoveDomesticAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveDomesticAnimalActionPerformed
        String id = txSearchDomesticAnimal.getText();
        String tex = "";
        lbNameDomesticAnimal.setText(tex);
        lbBreedDomesticAnimal.setText(tex);
        lbGenderDomesticAnimal.setText(tex);

        lbHabitatDomesticAnimal2.setText(tex);
        taDietDomesticAnimal.setText(tex);
        deleteRow(id, file, sheetName, 0);
        updateTableFromExcel(tbDomesticAnimals, file);
    }//GEN-LAST:event_btRemoveDomesticAnimalActionPerformed

    private void btSearchDomesticAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchDomesticAnimalActionPerformed
        if (txSearchDomesticAnimal.getText().equals("")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            String name = txSearchDomesticAnimal.getText();
            Row row = getRow(name, file, sheetName, 0);
            String[] vector = rowToVector(row);
            lbNameDomesticAnimal.setText(vector[0]);
            lbBreedDomesticAnimal.setText(vector[1]);
            lbGenderDomesticAnimal.setText(vector[2]);
            lbHabitatDomesticAnimal2.setText(vector[3]);
            taDietDomesticAnimal.setText(vector[6]);
        }
    }//GEN-LAST:event_btSearchDomesticAnimalActionPerformed

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
                new LO1Domestic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddDomesticAnimal;
    private javax.swing.JButton btRemoveDomesticAnimal;
    private javax.swing.JButton btSearchDomesticAnimal;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lbAdvert;
    private java.awt.Label lbAnimalType1;
    private java.awt.Label lbBreedDomesticAnimal;
    private java.awt.Label lbBreedStatic;
    private java.awt.Label lbDietAnimal;
    private java.awt.Label lbDomesticAnimalsHeadLine;
    private java.awt.Label lbGenderDomesticAnimal;
    private java.awt.Label lbGenderStatic;
    private java.awt.Label lbHabitatDomesticAnimal2;
    private java.awt.Label lbHabitatStatic2;
    private java.awt.Label lbManageDomesticAnimals;
    private java.awt.Label lbNameDomesticAnimal;
    private java.awt.Label lbNameStatic;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JScrollPane sbDietDomesticAnimal;
    private javax.swing.JTextArea taDietDomesticAnimal;
    public static javax.swing.JTable tbDomesticAnimals;
    private javax.swing.JTextField txSearchDomesticAnimal;
    // End of variables declaration//GEN-END:variables
}
