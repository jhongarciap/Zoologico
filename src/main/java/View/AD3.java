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
public class AD3 extends javax.swing.JFrame {

    /**
     * Creates new form X1
     */
    public AD3() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlans = new javax.swing.JTable();
        lbShowPlans = new java.awt.Label();
        lbTotalExpensesValue = new java.awt.Label();
        lbSpecificationsPlan = new java.awt.Label();
        btDeletePlan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txSpecificationsPlan = new javax.swing.JTextArea();
        lbSearchPlans = new java.awt.Label();
        lbPlansTitle = new java.awt.Label();
        lbZRVLogo = new javax.swing.JLabel();
        btSearchPlan = new javax.swing.JButton();
        txSearchPlans = new javax.swing.JTextField();
        lbZooLogo = new javax.swing.JLabel();
        btAddPlan = new javax.swing.JButton();

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

        tbPlans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Plan", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tbPlans);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(10, 35, 680, 200);

        lbShowPlans.setBackground(new java.awt.Color(51, 51, 51));
        lbShowPlans.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lbShowPlans.setForeground(new java.awt.Color(255, 255, 255));
        lbShowPlans.setText("Planes");
        bgPanelRound.add(lbShowPlans);
        lbShowPlans.setBounds(10, 0, 296, 32);

        lbTotalExpensesValue.setBackground(new java.awt.Color(51, 51, 51));
        lbTotalExpensesValue.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbTotalExpensesValue.setForeground(new java.awt.Color(255, 153, 0));
        bgPanelRound.add(lbTotalExpensesValue);
        lbTotalExpensesValue.setBounds(160, 350, 140, 32);

        lbSpecificationsPlan.setBackground(new java.awt.Color(51, 51, 51));
        lbSpecificationsPlan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbSpecificationsPlan.setForeground(new java.awt.Color(255, 255, 255));
        lbSpecificationsPlan.setText("Especificaciones del plan:");
        bgPanelRound.add(lbSpecificationsPlan);
        lbSpecificationsPlan.setBounds(10, 240, 230, 32);

        btDeletePlan.setBackground(new java.awt.Color(51, 51, 51));
        btDeletePlan.setForeground(new java.awt.Color(255, 255, 255));
        btDeletePlan.setText("Eliminar Plan");
        btDeletePlan.setActionCommand("Eliminar Plan");
        bgPanelRound.add(btDeletePlan);
        btDeletePlan.setBounds(560, 350, 130, 23);

        txSpecificationsPlan.setColumns(20);
        txSpecificationsPlan.setRows(5);
        jScrollPane2.setViewportView(txSpecificationsPlan);

        bgPanelRound.add(jScrollPane2);
        jScrollPane2.setBounds(250, 250, 440, 86);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 390));

        lbSearchPlans.setBackground(new java.awt.Color(35, 35, 35));
        lbSearchPlans.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbSearchPlans.setForeground(new java.awt.Color(255, 255, 255));
        lbSearchPlans.setText("Planes Existentes");
        bg.add(lbSearchPlans, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lbPlansTitle.setBackground(new java.awt.Color(35, 35, 35));
        lbPlansTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbPlansTitle.setForeground(new java.awt.Color(255, 153, 0));
        lbPlansTitle.setText("Planes");
        bg.add(lbPlansTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lbZRVLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        bg.add(lbZRVLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 140, 60));

        btSearchPlan.setText("Buscar");
        bg.add(btSearchPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 70, 20));

        txSearchPlans.setText("Ingresa el Id el plan a buscar");
        bg.add(txSearchPlans, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 280, -1));

        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, 90, 45));

        btAddPlan.setBackground(new java.awt.Color(51, 51, 51));
        btAddPlan.setForeground(new java.awt.Color(255, 255, 255));
        btAddPlan.setText("+");
        btAddPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPlanActionPerformed(evt);
            }
        });
        bg.add(btAddPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 30, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        IS1 MainScreen = new IS1();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

    private void btAddPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPlanActionPerformed
       PAAdd ReportWindow = new PAAdd();
       //this.dispose();
       ReportWindow.setVisible(true);
    }//GEN-LAST:event_btAddPlanActionPerformed

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
                new AD3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAddPlan;
    private javax.swing.JButton btDeletePlan;
    private javax.swing.JButton btSearchPlan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lbPlansTitle;
    private java.awt.Label lbSearchPlans;
    private java.awt.Label lbShowPlans;
    private java.awt.Label lbSpecificationsPlan;
    private java.awt.Label lbTotalExpensesValue;
    private javax.swing.JLabel lbZRVLogo;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JTable tbPlans;
    private javax.swing.JTextField txSearchPlans;
    private javax.swing.JTextArea txSpecificationsPlan;
    // End of variables declaration//GEN-END:variables
}
