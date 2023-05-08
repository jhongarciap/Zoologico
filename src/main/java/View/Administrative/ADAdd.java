package View.Administrative;

import Control.AdministrativeDepartment.ArrayListEmployee;
import Model.Employee;
import static Utilities.loadExcelDataToTable.updateTableFromExcel;
import static View.Administrative.AD2.tbGeneratedReports;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author juan.castro17
 */
public class ADAdd extends javax.swing.JFrame {

    ArrayListEmployee employee = new ArrayListEmployee();

    public ADAdd() {
        System.setProperty("sun.java2d.uiScale", "1.0");
        FlatDarkLaf.setup();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Departamento Administrativo");
        Image faviconX1 = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/View_IconAdminZOO.png"));
        this.setIconImage(faviconX1);
        Image logoZRV = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Resources/zoo!Logo.png"));
        lbZooLogo.setIcon(new ImageIcon(logoZRV.getScaledInstance(lbZooLogo.getWidth(), lbZooLogo.getHeight(), Image.SCALE_AREA_AVERAGING)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        bg = new javax.swing.JPanel();
        bgPanelRound = new Clases.PanelRound();
        lbName = new javax.swing.JLabel();
        txName = new javax.swing.JTextField();
        lbLastName = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        lbFunction = new javax.swing.JLabel();
        txLastName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txFuntion = new javax.swing.JTextArea();
        btAdd = new javax.swing.JButton();
        lbZooLogo = new javax.swing.JLabel();
        lWorkerTitle2 = new java.awt.Label();
        lWorkerTitle1 = new java.awt.Label();
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

        lbName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbName.setForeground(new java.awt.Color(242, 242, 242));
        lbName.setText("Nombre:");
        bgPanelRound.add(lbName);
        lbName.setBounds(10, 10, 70, 16);

        txName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameActionPerformed(evt);
            }
        });
        bgPanelRound.add(txName);
        txName.setBounds(80, 10, 190, 22);

        lbLastName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbLastName.setForeground(new java.awt.Color(242, 242, 242));
        lbLastName.setText("Apellido:");
        bgPanelRound.add(lbLastName);
        lbLastName.setBounds(10, 40, 70, 16);

        txId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIdActionPerformed(evt);
            }
        });
        bgPanelRound.add(txId);
        txId.setBounds(80, 70, 190, 22);

        lbId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbId.setForeground(new java.awt.Color(242, 242, 242));
        lbId.setText("ID:");
        bgPanelRound.add(lbId);
        lbId.setBounds(10, 70, 70, 16);

        lbFunction.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbFunction.setForeground(new java.awt.Color(242, 242, 242));
        lbFunction.setText("Función:");
        bgPanelRound.add(lbFunction);
        lbFunction.setBounds(10, 100, 70, 16);

        txLastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLastNameActionPerformed(evt);
            }
        });
        bgPanelRound.add(txLastName);
        txLastName.setBounds(80, 40, 190, 22);

        txFuntion.setColumns(20);
        txFuntion.setLineWrap(true);
        txFuntion.setRows(5);
        txFuntion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txFuntion);

        bgPanelRound.add(jScrollPane1);
        jScrollPane1.setBounds(14, 126, 250, 120);

        bg.add(bgPanelRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 280, 260));

        btAdd.setBackground(new java.awt.Color(255, 153, 0));
        btAdd.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btAdd.setForeground(new java.awt.Color(242, 242, 242));
        btAdd.setText("+");
        btAdd.setActionCommand("Añadir");
        btAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdd.setFocusPainted(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        bg.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 50, 30));

        lbZooLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbZooLogo.setMaximumSize(new java.awt.Dimension(549, 267));
        lbZooLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbZooLogoMouseClicked(evt);
            }
        });
        bg.add(lbZooLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 2, 90, 45));

        lWorkerTitle2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lWorkerTitle2.setForeground(new java.awt.Color(255, 153, 0));
        lWorkerTitle2.setText("Nuevo ");
        bg.add(lWorkerTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, -1));

        lWorkerTitle1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lWorkerTitle1.setForeground(new java.awt.Color(69, 106, 48));
        lWorkerTitle1.setText("Empleado");
        bg.add(lWorkerTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        lbAdvert.setForeground(new java.awt.Color(255, 0, 0));
        bg.add(lbAdvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 110, 20));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed

        if (txName.getText().equals("")
                || txLastName.getText().equals("")
                || txId.getText().equals("")
                || txFuntion.getText().equals("")) {
            lbAdvert.setText("Hay campos vacios");
        } else {
            lbAdvert.setText("");
            Employee newEmployee = new Employee(txId.getText(), txName.getText(), txLastName.getText(), txFuntion.getText());
            employee.add(newEmployee);
            employee.saveExcel();
            AD2 MainScreen = new AD2();
            this.dispose();
            MainScreen.setVisible(true);
            File file = new File("rom/Employees/Employees.xlsx");
            updateTableFromExcel(tbGeneratedReports, file);
        }

    }//GEN-LAST:event_btAddActionPerformed

    private void txNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameActionPerformed

    }//GEN-LAST:event_txNameActionPerformed

    private void txIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIdActionPerformed

    }//GEN-LAST:event_txIdActionPerformed

    private void txLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLastNameActionPerformed

    }//GEN-LAST:event_txLastNameActionPerformed

    private void lbZooLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbZooLogoMouseClicked
        AD2 MainScreen = new AD2();
        this.dispose();
        MainScreen.setVisible(true);
    }//GEN-LAST:event_lbZooLogoMouseClicked

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
                new ADAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private Clases.PanelRound bgPanelRound;
    private javax.swing.JButton btAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private java.awt.Label lWorkerTitle1;
    private java.awt.Label lWorkerTitle2;
    private javax.swing.JLabel lbAdvert;
    private javax.swing.JLabel lbFunction;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbZooLogo;
    private javax.swing.JTextArea txFuntion;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txLastName;
    private javax.swing.JTextField txName;
    // End of variables declaration//GEN-END:variables
}
