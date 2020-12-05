/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NOX
 */
public class CatalogOrdersFormTest {

    public CatalogOrdersFormTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of calTotalPrice method, of class CatalogOrdersForm.
     */
    @Test
    public void testCalTotalPrice() {
        ArrayList<Double> priceArray = new ArrayList<>();
        double val1 = 12.00;
        double val2 = 15.00;
        double val3 = 17.00;
        priceArray.add(val1);
        priceArray.add(val2);
        priceArray.add(val3);

        double TotalPrice = 0;
        for (int i = 0; i < priceArray.size(); i++) {
            TotalPrice += priceArray.get(i);
        }

        CatalogOrdersForm instance = new CatalogOrdersForm();
        double expResult = 44.00;
        double result = TotalPrice;
        assertEquals(expResult, result, 0.00);

    }

    /**
     * Test of main method, of class CatalogOrdersForm.
     */
    @Test
    public void testMain() {

        System.out.println("main");
        String[] args = null;
        CatalogOrdersForm.main(args);
ArrayList<String> orderData = new ArrayList<>();
        String selectionComboBox = "Rose";
        String txtQuantity = "20";
        String lblUnitPrice = "12.00";
        double price2= 20 * 12;
        String Price = String.format("%.2f", (price2));
        
        
        orderData.add(selectionComboBox);
        orderData.add(txtQuantity);
        orderData.add(lblUnitPrice);
        orderData.add(Price);
        
        String Data = "";
        for (int j = 0; j < orderData.size(); j++) {
            Data= orderData.toString();
        }
        String expResult = "[Rose, 20, 12.00, 240.00]";
    assertEquals(expResult,Data);
    }

}
