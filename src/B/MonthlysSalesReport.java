/*
 * User Story: As a flower shop’s management, I want to generate monthly sales report, in order to generate revenue.
 */

package B;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alan0
 */
public class MonthlysSalesReport extends javax.swing.JFrame {
    MonthlySalesReportClass insertData = new MonthlySalesReportClass("Rose", 12573);
    MonthlySalesReportClass insertData2 = new MonthlySalesReportClass("Sunflower", 9860);
    MonthlySalesReportClass insertData3 = new MonthlySalesReportClass("Rose", 22970);
    MonthlySalesReportClass insertData4 = new MonthlySalesReportClass("Sunflower", 9370);
    MonthlySalesReportClass insertData5 = new MonthlySalesReportClass("Rose", 10793);
    MonthlySalesReportClass insertData6 = new MonthlySalesReportClass("Sunflower", 10982);
    MonthlySalesReportClass insertData7 = new MonthlySalesReportClass("Rose", 11997);
    MonthlySalesReportClass insertData8 = new MonthlySalesReportClass("Sunflower", 9896);
    MonthlySalesReportClass insertData9 = new MonthlySalesReportClass("Rose", 15021);
    MonthlySalesReportClass insertData10 = new MonthlySalesReportClass("Sunflower", 9905);
    MonthlySalesReportClass insertData11 = new MonthlySalesReportClass("Rose", 11965);
    MonthlySalesReportClass insertData12 = new MonthlySalesReportClass("Sunflower", 9763);
    MonthlySalesReportClass insertData13 = new MonthlySalesReportClass("Rose", 16202);
    MonthlySalesReportClass insertData14 = new MonthlySalesReportClass("Sunflower", 12005);
    MonthlySalesReportClass insertData15 = new MonthlySalesReportClass("Rose", 13395);
    MonthlySalesReportClass insertData16 = new MonthlySalesReportClass("Sunflower", 12014);
    MonthlySalesReportClass insertData17 = new MonthlySalesReportClass("Rose", 20014);
    MonthlySalesReportClass insertData18 = new MonthlySalesReportClass("Sunflower", 14926);
    MonthlySalesReportClass insertData19 = new MonthlySalesReportClass("Rose", 19937);
    MonthlySalesReportClass insertData20 = new MonthlySalesReportClass("Sunflower", 14983);
    MonthlySalesReportClass insertData21 = new MonthlySalesReportClass("Rose", 20184);
    MonthlySalesReportClass insertData22 = new MonthlySalesReportClass("Sunflower", 16396);
    MonthlySalesReportClass insertDataEmpty = new MonthlySalesReportClass("", 0);
    
    /** Creates new form MonthlysSalesReport */
    public MonthlysSalesReport() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst;
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        cbxMonth = new javax.swing.JComboBox<>();
        lblMonth = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblYear = new javax.swing.JLabel();
        cbxYear = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMothlySalesReport = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        lblErrMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monthly Sales Report");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblTitle.setText("Monthly Sales Report");

        cbxMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMonthItemStateChanged(evt);
            }
        });

        lblMonth.setText("Month");

        lblYear.setText("Year");

        tblMothlySalesReport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblMothlySalesReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "items name", "Total amoung of sales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMothlySalesReport.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMothlySalesReport);
        if (tblMothlySalesReport.getColumnModel().getColumnCount() > 0) {
            tblMothlySalesReport.getColumnModel().getColumn(0).setResizable(false);
            tblMothlySalesReport.getColumnModel().getColumn(1).setResizable(false);
        }

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(lblTitle)
                                .add(0, 437, Short.MAX_VALUE))
                            .add(jSeparator1))
                        .addContainerGap())
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(lblMonth)
                        .add(18, 18, 18)
                        .add(cbxMonth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lblYear)
                        .add(18, 18, 18)
                        .add(cbxYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 182, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18))
                    .add(jScrollPane1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblTitle)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblMonth)
                    .add(cbxMonth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblYear)
                    .add(cbxYear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 242, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPrint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPrint.setMnemonic('P');
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 51, 0));

        lblErrMsg.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblErrMsg.setForeground(new java.awt.Color(255, 51, 0));
        lblErrMsg.setText(".");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(lblErrMsg)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblMsg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnPrint)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnPrint)
                    .add(lblMsg)
                    .add(lblErrMsg))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int month = 0;
        int year = 2000;
        //int year = Calendar.getInstance().get(Calendar.YEAR);
        cbxMonth.removeAllItems();
        for (int i = 1; i <= 12; i++) {
            month = i;
            cbxMonth.addItem(month + "");
        }
        
        for (int i = year; i <= Calendar.getInstance().get(Calendar.YEAR); i++) {
            cbxYear.addItem(i + "");
        }
        cbxYear.setSelectedItem(Calendar.getInstance().get(Calendar.YEAR) + "");
//        try {
//            // TODO add your handling code here:
//            Class.forName("oracle.jdbc.OracleDriver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(MonthlysSalesReport.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.print(ex);
//        }
//        try {
//            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ymhomer","a800125.");
//        } catch (SQLException ex) {
//            Logger.getLogger(MonthlysSalesReport.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.print(ex);
//        }
//        try {
//            JasperDesign jdesign;
//            jdesign = JRXmlLoader.load("E:\\Users\\alan0\\Documents\\GitHub\\Agile-Assignment\\src\\B\\MonthlySalesReport.jrxml");
//        } catch (JRException ex) {
//            Logger.getLogger(MonthlysSalesReport.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.print(ex);
//        }

        addRowToJTable();
    }//GEN-LAST:event_formWindowOpened

    private void cbxMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMonthItemStateChanged
        addRowToJTable();
    }//GEN-LAST:event_cbxMonthItemStateChanged

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if (lblErrMsg.getText().equals("")){
            printRecord(jPanel1);
        }
        else {
            
        }
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(MonthlysSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlysSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlysSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlysSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlysSalesReport().setVisible(true);
            }
        });
    }
    
    public ArrayList<MonthlySalesReportClass> monthlySalesReportList(){
        ArrayList<MonthlySalesReportClass> monthlySalesReportList = new ArrayList<>();
        //Order insertData = new OrderClass("Rose", "Lim Xiao Jie", 2, 10, 20);
        //currentCustomerName = insertData.getCustomerName();
        //TotalPrice = insertData.getTotalPrice() + insertData2.getTotalPrice();
        //orderList.add(insertData);
        //orderList.add(insertData2);
        //monthlySalesReportList.clear();
        if (cbxMonth.getSelectedIndex()==0){
            monthlySalesReportList.add(insertData);
            monthlySalesReportList.add(insertData2);
        }
        else if (cbxMonth.getSelectedIndex()==1){
            monthlySalesReportList.add(insertData3);
            monthlySalesReportList.add(insertData4);
        }
        else if (cbxMonth.getSelectedIndex()==2){
            monthlySalesReportList.add(insertData5);
            monthlySalesReportList.add(insertData6);
        }
        else if (cbxMonth.getSelectedIndex()==3){
            monthlySalesReportList.add(insertData7);
            monthlySalesReportList.add(insertData8);
        }
        else if (cbxMonth.getSelectedIndex()==4){
            monthlySalesReportList.add(insertData9);
            monthlySalesReportList.add(insertData10);
        }
        else if (cbxMonth.getSelectedIndex()==5){
            monthlySalesReportList.add(insertData11);
            monthlySalesReportList.add(insertData12);
        }
        else if (cbxMonth.getSelectedIndex()==7){
            monthlySalesReportList.add(insertData13);
            monthlySalesReportList.add(insertData14);
        }
        else if (cbxMonth.getSelectedIndex()==8){
            monthlySalesReportList.add(insertData15);
            monthlySalesReportList.add(insertData16);
        }
        else {
            monthlySalesReportList.add(insertDataEmpty);
        }
        
        //lblTotalPrice.setText("Total : RM " + TotalPrice);
        return monthlySalesReportList;
    }
    
    public void addRowToJTable(){
        lblErrMsg.setText("");
        DefaultTableModel model = (DefaultTableModel)tblMothlySalesReport.getModel();
        model.setRowCount(0);
        int rowCount = model.getRowCount();
        //system.out.print();
        for (int i=0; i<=rowCount; i++){
            //model.removeRow(i);
        }
        
        ArrayList<MonthlySalesReportClass> monthlySalesReportList = monthlySalesReportList();
        //model.removeRow(ERROR);
        Object rowData[] = new Object[2];
        for(int i=0; i<monthlySalesReportList.size(); i++){
            if (monthlySalesReportList.get(i).getItemName().equals("")){
                lblErrMsg.setText("No record.");
            }
            else{
                rowData[0] = monthlySalesReportList.get(i).getItemName();
                rowData[1] = monthlySalesReportList.get(i).getAmountOfSales();
                model.addRow(rowData);
            }
        }
    }
    
    // Method For To Print Panel Contents
    private void printRecord(JPanel panel){
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("Print Record");
        // Set Printable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check If No Printable Content
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                // Make 2D Graphics to map content
                Graphics2D graphics2D = (Graphics2D)graphics;
                // Set Graphics Translations
                // A Little Correction here Multiplication was not working so I replaced with addition
                graphics2D.translate(pageFormat.getImageableX()+10, pageFormat.getImageableY()+10);
                // This is a page scale. Default should be 0.3 I am using 0.5
                graphics2D.scale(0.5, 0.5);
                
                // Now paint panel as graphics2D
                panel.paint(graphics2D);
                
                // return if page exists
                return Printable.PAGE_EXISTS;
            }
        });
        // Store printerDialog as boolean
        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
        if(returningResult){
            // Use try catch exeption for failure
            try{
                // Now call print method inside printerJob to print
                printerJob.print();
            }catch (PrinterException printerException){
                JOptionPane.showMessageDialog(this, "Print Error: " + printerException.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cbxMonth;
    private javax.swing.JComboBox<String> cbxYear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblErrMsg;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tblMothlySalesReport;
    // End of variables declaration//GEN-END:variables

}
