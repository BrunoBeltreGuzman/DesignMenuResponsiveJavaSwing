/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Colores.Colores;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author diosl
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    private Colores colores;
    
    public Ventana() {
        
        colores = new Colores();
        
        initComponents();
        initComponents2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Logo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Items = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        color = new javax.swing.JLabel();
        btnhome = new javax.swing.JLabel();
        color1 = new javax.swing.JLabel();
        btnBar = new javax.swing.JLabel();
        color2 = new javax.swing.JLabel();
        btnHistory = new javax.swing.JLabel();
        color3 = new javax.swing.JLabel();
        btnFile = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 650));

        jPanel1.setLayout(new java.awt.BorderLayout());

        Menu.setBackground(new java.awt.Color(235, 235, 235));
        Menu.setForeground(new java.awt.Color(234, 234, 234));
        Menu.setMinimumSize(new java.awt.Dimension(0, 0));
        Menu.setPreferredSize(new java.awt.Dimension(1100, 60));
        Menu.setLayout(new java.awt.BorderLayout());

        Logo.setMinimumSize(new java.awt.Dimension(0, 0));
        Logo.setOpaque(false);
        Logo.setPreferredSize(new java.awt.Dimension(220, 60));
        Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("S");
        Logo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 5, 30, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("S");
        Logo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 8, 30, 50));

        jLabel1.setBackground(colores.getColorPrymary());
        jLabel1.setOpaque(true);
        Logo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 50, 50));

        Menu.add(Logo, java.awt.BorderLayout.WEST);

        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(880, 60));
        jPanel2.setLayout(new java.awt.BorderLayout());

        Items.setBackground(new java.awt.Color(102, 204, 0));
        Items.setMinimumSize(new java.awt.Dimension(0, 0));
        Items.setOpaque(false);
        Items.setPreferredSize(new java.awt.Dimension(660, 60));
        Items.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 0));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(660, 60));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        color.setBackground(colores.getColorPrymary2());
        color.setForeground(new java.awt.Color(102, 102, 102));
        color.setOpaque(true);
        jPanel4.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 90, 3));

        btnhome.setBackground(new java.awt.Color(0, 255, 0));
        btnhome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home1.png"))); // NOI18N
        jPanel4.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 16, 90, 35));

        color1.setBackground(colores.getGris1());
        color1.setForeground(new java.awt.Color(102, 102, 102));
        color1.setOpaque(true);
        jPanel4.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 90, 3));

        btnBar.setBackground(new java.awt.Color(228, 230, 232));
        btnBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bar2.png"))); // NOI18N
        jPanel4.add(btnBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 16, 90, 35));

        color2.setBackground(colores.getGris1());
        color2.setForeground(new java.awt.Color(102, 102, 102));
        color2.setOpaque(true);
        jPanel4.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 90, 3));

        btnHistory.setBackground(new java.awt.Color(0, 255, 0));
        btnHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/history2.png"))); // NOI18N
        jPanel4.add(btnHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 16, 90, 35));

        color3.setBackground(colores.getGris1());
        color3.setForeground(new java.awt.Color(102, 102, 102));
        color3.setOpaque(true);
        jPanel4.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 90, 3));

        btnFile.setBackground(new java.awt.Color(0, 255, 0));
        btnFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/file2.png"))); // NOI18N
        jPanel4.add(btnFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 16, 90, 35));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 780;
        gridBagConstraints.ipady = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Items.add(jPanel4, gridBagConstraints);

        jPanel2.add(Items, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(220, 60));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 15, 40, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(130, 130, 130));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("BrunoDev");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 12, 140, 40));

        jPanel2.add(jPanel3, java.awt.BorderLayout.EAST);

        Menu.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(Menu, java.awt.BorderLayout.PAGE_START);

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jPanel1.add(Home, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void initComponents2() {
        this.setLocationRelativeTo(null);
        this.setTitle("BrunoDev - Menu UI UX Java Swing");
        this.setSize(1100, 650);
        
        ImageIcon ima = new ImageIcon(getClass().getResource("/Icons/images.png"));
        Icon ico = new ImageIcon(ima.getImage().getScaledInstance(lbUser.getWidth(), lbUser.getHeight(), Image.SCALE_DEFAULT));
        lbUser.setIcon(ico);
    }

    public JLabel getBtnBar() {
        return btnBar;
    }

    public JLabel getBtnFile() {
        return btnFile;
    }

    public JLabel getBtnHistory() {
        return btnHistory;
    }

    public JLabel getBtnHome() {
        return btnhome;
    }

    public JLabel getColor() {
        return color;
    }

    public JLabel getColor1() {
        return color1;
    }

    public JLabel getColor2() {
        return color2;
    }

    public JLabel getColor3() {
        return color3;
    }

     
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Items;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel btnBar;
    private javax.swing.JLabel btnFile;
    private javax.swing.JLabel btnHistory;
    private javax.swing.JLabel btnhome;
    private javax.swing.JLabel color;
    private javax.swing.JLabel color1;
    private javax.swing.JLabel color2;
    private javax.swing.JLabel color3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbUser;
    // End of variables declaration//GEN-END:variables
}
