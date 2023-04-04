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
public class LO1Minor extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public LO1Minor() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup(); // Sets the FlatLaf LookAndFeel as the main theme for the JFrame.
        initComponents();
        
        this.setLocationRelativeTo(null); //Centers the window on-screen.
        this.setTitle("Reportes"); // Set the title for the JFrame.
        
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconAdminZOO.png"));
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
        tbMinorAnimals = new javax.swing.JTable();
        lbDietAnimal = new java.awt.Label();
        lbWildAnimalsHeadLine = new java.awt.Label();
        lbHabitatStatic = new java.awt.Label();
        lbHabitatMinorAnimal = new java.awt.Label();
        lbNameStatic = new java.awt.Label();
        lbNameMinorAnimal = new java.awt.Label();
        lbBreedStatic = new java.awt.Label();
        lbBreedMinorAnimal = new java.awt.Label();
        lbGenderStatic = new java.awt.Label();
        lbGenderMinorAnimal = new java.awt.Label();
        sbDietDomesticAnimal = new javax.swing.JScrollPane();
        taDietMinorAnimal = new javax.swing.JTextArea();
        btRemoveMinorAnimal = new javax.swing.JButton();
        lbAnimalType = new java.awt.Label();
        lbManageMinorAnimals = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        btSearchMinorAnimal = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        txSearchMinorAnimal = new javax.swing.JTextField();
        btAddMinorAnimal = new javax.swing.JButton();

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

        tbMinorAnimals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbMinorAnimals);

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
        lbWildAnimalsHeadLine.setText("Animales Menores");
        bgPanelRound.add(lbWildAnimalsHeadLine);
        lbWildAnimalsHeadLine.setBounds(10, 0, 296, 32);

        lbHabitatStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbHabitatStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbHabitatStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbHabitatStatic.setText("Hábitat:");
        bgPanelRound.add(lbHabitatStatic);
        lbHabitatStatic.setBounds(540, 280, 70, 32);

        lbHabitatMinorAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbHabitatMinorAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbHabitatMinorAnimal.setForeground(new java.awt.Color(69, 106, 48));
        lbHabitatMinorAnimal.setText("Acuático");
        bgPanelRound.add(lbHabitatMinorAnimal);
        lbHabitatMinorAnimal.setBounds(620, 280, 70, 32);

        lbNameStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbNameStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbNameStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbNameStatic.setText("Nombre:");
        bgPanelRound.add(lbNameStatic);
        lbNameStatic.setBounds(10, 280, 80, 32);

        lbNameMinorAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbNameMinorAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNameMinorAnimal.setForeground(new java.awt.Color(69, 106, 48));
        lbNameMinorAnimal.setText("Pedro");
        bgPanelRound.add(lbNameMinorAnimal);
        lbNameMinorAnimal.setBounds(90, 280, 100, 32);

        lbBreedStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbBreedStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbBreedStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbBreedStatic.setText("Raza:");
        bgPanelRound.add(lbBreedStatic);
        lbBreedStatic.setBounds(190, 280, 53, 32);

        lbBreedMinorAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbBreedMinorAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbBreedMinorAnimal.setForeground(new java.awt.Color(69, 106, 48));
        lbBreedMinorAnimal.setText("Allobates");
        bgPanelRound.add(lbBreedMinorAnimal);
        lbBreedMinorAnimal.setBounds(250, 280, 120, 32);

        lbGenderStatic.setBackground(new java.awt.Color(51, 51, 51));
        lbGenderStatic.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbGenderStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbGenderStatic.setText("Sexo:");
        bgPanelRound.add(lbGenderStatic);
        lbGenderStatic.setBounds(370, 280, 56, 32);

        lbGenderMinorAnimal.setBackground(new java.awt.Color(51, 51, 51));
        lbGenderMinorAnimal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbGenderMinorAnimal.setForeground(new java.awt.Color(69, 106, 48));
        lbGenderMinorAnimal.setText("Hembra");
        bgPanelRound.add(lbGenderMinorAnimal);
        lbGenderMinorAnimal.setBounds(430, 280, 70, 32);

        taDietMinorAnimal.setColumns(20);
        taDietMinorAnimal.setRows(5);
        sbDietDomesticAnimal.setViewportView(taDietMinorAnimal);

        bgPanelRound.add(sbDietDomesticAnimal);
        sbDietDomesticAnimal.setBounds(90, 320, 450, 30);

        btRemoveMinorAnimal.setText("Eliminar animal");
        bgPanelRound.add(btRemoveMinorAnimal);
        btRemoveMinorAnimal.setBounds(560, 320, 120, 23);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 700, 360));

        lbAnimalType.setBackground(new java.awt.Color(35, 35, 35));
        lbAnimalType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbAnimalType.setForeground(new java.awt.Color(255, 255, 255));
        lbAnimalType.setText("Animal");
        bg.add(lbAnimalType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        lbManageMinorAnimals.setBackground(new java.awt.Color(35, 35, 35));
        lbManageMinorAnimals.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbManageMinorAnimals.setForeground(new java.awt.Color(69, 106, 48));
        lbManageMinorAnimals.setText("Administrar animales menores");
        bg.add(lbManageMinorAnimals, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        btSearchMinorAnimal.setText("Buscar");
        bg.add(btSearchMinorAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 70, -1));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));

        txSearchMinorAnimal.setText("Buscar por nombre");
        bg.add(txSearchMinorAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 490, -1));

        btAddMinorAnimal.setText("Añadir animal");
        btAddMinorAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddMinorAnimalActionPerformed(evt);
            }
        });
        bg.add(btAddMinorAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 110, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        ILS1 MainScreen = new ILS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btAddMinorAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddMinorAnimalActionPerformed
       LOAMinorAdd MainScreen = new LOAMinorAdd();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_btAddMinorAnimalActionPerformed

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
                new LO1Minor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddMinorAnimal;
    private javax.swing.JButton btRemoveMinorAnimal;
    private javax.swing.JButton btSearchMinorAnimal;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label lbAnimalType;
    private java.awt.Label lbBreedMinorAnimal;
    private java.awt.Label lbBreedStatic;
    private java.awt.Label lbDietAnimal;
    private java.awt.Label lbGenderMinorAnimal;
    private java.awt.Label lbGenderStatic;
    private java.awt.Label lbHabitatMinorAnimal;
    private java.awt.Label lbHabitatStatic;
    private java.awt.Label lbManageMinorAnimals;
    private java.awt.Label lbNameMinorAnimal;
    private java.awt.Label lbNameStatic;
    private java.awt.Label lbWildAnimalsHeadLine;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JScrollPane sbDietDomesticAnimal;
    private javax.swing.JTextArea taDietMinorAnimal;
    private javax.swing.JTable tbMinorAnimals;
    private javax.swing.JTextField txSearchMinorAnimal;
    // End of variables declaration//GEN-END:variables
}
