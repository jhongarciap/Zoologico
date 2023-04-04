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
public class AD2 extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public AD2() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup(); // Sets the FlatLaf LookAndFeel as the main theme for the JFrame.
        initComponents();
        
        this.setLocationRelativeTo(null); //Centers the window on-screen.
        this.setTitle("Trabajadores"); // Set the title for the JFrame.
        
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
        spTableWorkers = new javax.swing.JScrollPane();
        tbGeneratedReports = new javax.swing.JTable();
        lbPro = new java.awt.Label();
        lbWorkers = new java.awt.Label();
        lbProWorker = new java.awt.Label();
        lbName = new java.awt.Label();
        lbNameWorker = new java.awt.Label();
        btNewWorker = new javax.swing.JButton();
        btDeleteWorker = new javax.swing.JButton();
        lbIDworker = new java.awt.Label();
        lbWorkersTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        txIDWorker = new javax.swing.JTextField();
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

        tbGeneratedReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Fecha", "Sueldo", "Puesto", "Surcusal"
            }
        ));
        spTableWorkers.setViewportView(tbGeneratedReports);

        bgPanelRound.add(spTableWorkers);
        spTableWorkers.setBounds(10, 35, 680, 280);

        lbPro.setBackground(new java.awt.Color(51, 51, 51));
        lbPro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbPro.setForeground(new java.awt.Color(255, 255, 255));
        lbPro.setText("Profesional:");
        bgPanelRound.add(lbPro);
        lbPro.setBounds(20, 350, 140, 32);

        lbWorkers.setBackground(new java.awt.Color(51, 51, 51));
        lbWorkers.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbWorkers.setForeground(new java.awt.Color(255, 255, 255));
        lbWorkers.setText("Trabajadores");
        bgPanelRound.add(lbWorkers);
        lbWorkers.setBounds(10, 0, 296, 32);

        lbProWorker.setBackground(new java.awt.Color(51, 51, 51));
        lbProWorker.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbProWorker.setForeground(new java.awt.Color(255, 153, 0));
        bgPanelRound.add(lbProWorker);
        lbProWorker.setBounds(160, 350, 140, 32);

        lbName.setBackground(new java.awt.Color(51, 51, 51));
        lbName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Nombre:");
        bgPanelRound.add(lbName);
        lbName.setBounds(20, 320, 150, 32);

        lbNameWorker.setBackground(new java.awt.Color(51, 51, 51));
        lbNameWorker.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbNameWorker.setForeground(new java.awt.Color(255, 153, 0));
        bgPanelRound.add(lbNameWorker);
        lbNameWorker.setBounds(160, 320, 140, 32);

        btNewWorker.setBackground(new java.awt.Color(51, 51, 51));
        btNewWorker.setForeground(new java.awt.Color(255, 255, 255));
        btNewWorker.setText("Agregar Empleado");
        bgPanelRound.add(btNewWorker);
        btNewWorker.setBounds(550, 330, 130, 23);

        btDeleteWorker.setBackground(new java.awt.Color(51, 51, 51));
        btDeleteWorker.setForeground(new java.awt.Color(255, 255, 255));
        btDeleteWorker.setText("Eliminar Empleado");
        bgPanelRound.add(btDeleteWorker);
        btDeleteWorker.setBounds(550, 360, 130, 23);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 390));

        lbIDworker.setBackground(new java.awt.Color(35, 35, 35));
        lbIDworker.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbIDworker.setForeground(new java.awt.Color(255, 255, 255));
        lbIDworker.setText("Trabajador:");
        bg.add(lbIDworker, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        lbWorkersTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbWorkersTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbWorkersTitle.setForeground(new java.awt.Color(255, 153, 0));
        lbWorkersTitle.setText("Recursos Humanos");
        bg.add(lbWorkersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        btSearch.setText("Buscar");
        bg.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 70, 20));

        txIDWorker.setText("Ingrese el ID del trabajador");
        bg.add(txIDWorker, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 280, -1));

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
    private java.awt.Label lbIDworker;
    private java.awt.Label lbName;
    private java.awt.Label lbNameWorker;
    private java.awt.Label lbPro;
    private java.awt.Label lbProWorker;
    private java.awt.Label lbWorkers;
    private java.awt.Label lbWorkersTitle;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JScrollPane spTableWorkers;
    private javax.swing.JTable tbGeneratedReports;
    private javax.swing.JTextField txIDWorker;
    // End of variables declaration//GEN-END:variables
}
