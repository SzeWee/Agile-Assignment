package C;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CatalogOrdersForm extends javax.swing.JFrame {

    public CatalogOrdersForm() {
        initComponents();
    }

    ArrayList<Double> priceArray = new ArrayList<>();

    public double calTotalPrice(double Price) {
        //add all prices in my order into arraylist
        priceArray.add(Price);

        double TotalPrice = 0;
        for (int i = 0; i < priceArray.size(); i++) {
            TotalPrice += priceArray.get(i);

        }
        return TotalPrice;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selectionComboBox = new javax.swing.JComboBox<>();
        lblUnitPrice = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMyOrder = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblOrderID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catalog Order");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Catalog Order");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("My Orders");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText(" Select an item :");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Select quantity :");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Unit Price (RM) :");
        jLabel6.setToolTipText("");

        selectionComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rose", "Tulip", "Sunflower", "Orchid", "Daisy" }));
        selectionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionComboBoxActionPerformed(evt);
            }
        });

        lblUnitPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUnitPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnAddOrder.setText("Add to Order");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        tblMyOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Unit Price (RM)", "Price (RM)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMyOrder);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Total Price (RM) :");

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTotalPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnConfirm.setText("Confirm Order");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("OrderID :");

        lblOrderID.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConfirm))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtQuantity))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(14, 14, 14))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel4))
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(selectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAddOrder)
                                                .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblOrderID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddOrder)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void selectionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionComboBoxActionPerformed
        double RosePrice = 12.00;
        double TulipPrice = 5.00;
        double SunflowerPrice = 7.00;
        double OrchidPrice = 10.00;
        double DaisyPrice = 4.00;

        switch (selectionComboBox.getSelectedIndex()) {
            case 0:
                lblUnitPrice.setText("" + String.format("%.2f", RosePrice));
                break;
            case 1:
                lblUnitPrice.setText("" + String.format("%.2f", TulipPrice));
                break;
            case 2:
                lblUnitPrice.setText("" + String.format("%.2f", SunflowerPrice));
                break;
            case 3:
                lblUnitPrice.setText("" + String.format("%.2f", OrchidPrice));
                break;
            case 4:
                lblUnitPrice.setText("" + String.format("%.2f", DaisyPrice));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_selectionComboBoxActionPerformed
    public static double itemcount1 = 0;
    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        int qtySelected;

        try {
            qtySelected = Integer.parseInt(this.txtQuantity.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter a positive integer", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (qtySelected <= 0) {
            JOptionPane.showMessageDialog(this, "Enter a positive integer", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (lblUnitPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Select an item again", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            {
                //Many units of the same item
                double Price = qtySelected * parseDouble(lblUnitPrice.getText());

                //store entered data into String array
                String orderData[] = {selectionComboBox.getSelectedItem().toString(), txtQuantity.getText(), lblUnitPrice.getText(), String.format("%.2f", Price)};

                boolean isDuplicated = false;
                DefaultTableModel tblModel = (DefaultTableModel) tblMyOrder.getModel();
                for (int i = 0; i < tblModel.getRowCount(); i++) {                      //check for each row in the table model
                    if (tblModel.getValueAt(i, 0).toString().equals(selectionComboBox.getSelectedItem().toString())) {   //if the value of the first column(item name) is same with the current order item added in...
                        isDuplicated = true;
                        int tempoQuantity = Integer.parseInt(tblModel.getValueAt(i, 1).toString()) + Integer.parseInt(txtQuantity.getText()); //take the value of the second column(old item quantity) add with the current new entered order item quantity
                        double tempoUnitPrice = Double.parseDouble(tblModel.getValueAt(i, 2).toString());   //take the value of the third column(old item unit price) ,no need take current one cause this is fixed
                        double tempoItemTotalPrice = Double.parseDouble(tblModel.getValueAt(i, 3).toString()) + Price;  //take the value of the forth column(old item total price) add with the current newly entered item total price
                        String tempoOrderData[] = {selectionComboBox.getSelectedItem().toString(), String.valueOf(tempoQuantity), String.valueOf(tempoUnitPrice), String.format("%.2f", tempoItemTotalPrice)}; //initalise a new array to put updated row of data
                        tblModel.removeRow(i); //delete the old row of data
                        tblModel.addRow(tempoOrderData); //add updated row of data into tabel model
                    }
                }
                if (!isDuplicated) {
                    tblModel.addRow(orderData);//row added
                }

                JOptionPane.showMessageDialog(this, "Order is added.");

                //clear textfield for new entry
                txtQuantity.setText("");

                double FinalTotalPrice = (calTotalPrice(Price));
                lblTotalPrice.setText(String.format("%.2f", FinalTotalPrice));

                itemcount1 = itemcount1 + 1;
            }
        }


    }//GEN-LAST:event_btnAddOrderActionPerformed

    String OrderID2;

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (itemcount1 != 0) {
            OrderID2 = String.valueOf(generateOrderID());
            new Address(OrderID2).setVisible(true);

            lblOrderID.setText(OrderID2);

        } else {
            CatalogOrdersForm lframe = new CatalogOrdersForm();
            JOptionPane.showMessageDialog(this, "No order detected", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnConfirmActionPerformed
    public int generateOrderID() {
        int orderID1 = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
        return orderID1;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogOrdersForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblUnitPrice;
    private javax.swing.JComboBox<String> selectionComboBox;
    private javax.swing.JTable tblMyOrder;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
