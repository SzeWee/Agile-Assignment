package D;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI
 */
public class TrackingShippingProduct extends javax.swing.JFrame {

    /**
     * Creates new form ProductPurchasing
     */
    
    private OrderInfoArrayList number;
    
    public TrackingShippingProduct() {
        initComponents();
        addRowToJTable();
    }/*
    //a
        public class ProductPurchase{
        public int id;
        public String purchaseDate;
        public String paymentType;
        public String shippingDate;
        public String productStatus;
        
        public ProductPurchase(int id, String purchaseDate, String shippingDate, String paymentType, String productStatus){
            this.id = id;
            this.purchaseDate = purchaseDate;
            this.paymentType = paymentType;
            this.shippingDate = shippingDate;
            this.productStatus = productStatus;
        }
    }
        
        public ArrayList ListProductPurchase(){
        ArrayList<ProductPurchase> list = new ArrayList<ProductPurchase>();
        ProductPurchase pp1 = new ProductPurchase(0001,"14/10/2020","17/10/2020","Credit-Card","Delivered");
        ProductPurchase pp2 = new ProductPurchase(0002,"18/10/2020","21/10/2020","Debit-Card","Delivered");
        ProductPurchase pp3 = new ProductPurchase(0003,"21/10/2020","27/10/2020","Debit-Card","Delivering");
        ProductPurchase pp4 = new ProductPurchase(0004,"01/11/2020","05/11/2020","Credit-Card","Processing");
        ProductPurchase pp5 = new ProductPurchase(0005,"12/11/2020","17/11/2020","Debit-Card","Processing");
        list.add(pp1);
        list.add(pp2);
        list.add(pp3);
        list.add(pp4);
        list.add(pp5);
        return list;
    }
        
        public void addRowToJTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        ArrayList<ProductPurchase> list = ListProductPurchase();
        Object rowData[] = new Object[5];
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).id;
            rowData[1] = list.get(i).purchaseDate;
            rowData[2] = list.get(i).shippingDate;
            rowData[3] = list.get(i).paymentType;
            rowData[4] = list.get(i).productStatus;
            model.addRow(rowData);
        }
    }*/
    
    public void addRowToJTable(){
        
        number = new OrderInfoArrayList();
        ArrayList<OrderInfo> list = number.listofOrder();
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object rowData[] = new Object[10];
        jTable1.setRowHeight(40);
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).orderID;
            rowData[1] = list.get(i).customerAddress;
            rowData[2] = list.get(i).shippingDate;
            rowData[3] = list.get(i).productStatus;
            model.addRow(rowData);
        }
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Shipping Address", "Shipping Date", "Product Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tracking Shipping Product");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:a
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TrackingShippingProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrackingShippingProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrackingShippingProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrackingShippingProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrackingShippingProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
