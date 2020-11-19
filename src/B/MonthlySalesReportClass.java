/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

/**
 *
 * @author alan0
 */
public class MonthlySalesReportClass {
    private String ItemName;
    private int amountOfSales;
    
    public MonthlySalesReportClass(String ItemName, int amountOfSales) {
        this.ItemName = ItemName;
        this.amountOfSales = amountOfSales;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getAmountOfSales() {
        return amountOfSales;
    }

    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }
}
