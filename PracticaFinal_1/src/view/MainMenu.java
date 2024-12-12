package view;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        PrducteMenuItem = new javax.swing.JMenu();
        ManageProductItem = new javax.swing.JMenuItem();
        SaleMenuItem = new javax.swing.JMenu();
        NewSaleItem = new javax.swing.JMenu();
        ListSaleItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrducteMenuItem.setText("Product");

        ManageProductItem.setText("Mange Product");
        ManageProductItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageProductItemActionPerformed(evt);
            }
        });
        PrducteMenuItem.add(ManageProductItem);

        jMenuBar2.add(PrducteMenuItem);

        SaleMenuItem.setText("Sales");

        NewSaleItem.setText("New Sale");
        SaleMenuItem.add(NewSaleItem);

        ListSaleItem.setText("List Sale");
        SaleMenuItem.add(ListSaleItem);

        jMenuBar2.add(SaleMenuItem);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ManageProductItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageProductItemActionPerformed
        ProductMainView productMainView = new ProductMainView();
        productMainView.setVisible(true);
    }//GEN-LAST:event_ManageProductItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ListSaleItem;
    private javax.swing.JMenuItem ManageProductItem;
    private javax.swing.JMenu NewSaleItem;
    private javax.swing.JMenu PrducteMenuItem;
    private javax.swing.JMenu SaleMenuItem;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
