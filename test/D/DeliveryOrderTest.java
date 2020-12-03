/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package D;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MSI
 */
public class DeliveryOrderTest {
    OrderInfo orderinfo = new OrderInfo("O00001","Colwin Yik","17/10/2020","24/10/2020","Credit-Card","No.1, Taman Satu 1 Jalan Satu 31330, Kuala Lumpur.","Delivered Successful");
    
    
    public DeliveryOrderTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addRowToJTable method, of class DeliveryOrder.
     */
    @Test
    public void testAddRowToJTable() {
        System.out.println("Test JTable ()");
        DeliveryOrder instance = new DeliveryOrder();
        instance.addRowToJTable();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetOrderID(){
        System.out.println("Test Get Order ID ()");
        String expected = "O00001";
        String actual = orderinfo.getOrderID();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetCustomerName(){
        System.out.println("Test Get Customer Name ()");
        String expected = "Colwin Yik";
        String actual = orderinfo.getCustomerName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPurchaseDate(){
        System.out.println("Test Get Purchase Date ()");
        String expected = "17/10/2020";
        String actual = orderinfo.getPurchaseDate();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetShippingDate(){
        System.out.println("Test Get Shipping Date ()");
        String expected = "24/10/2020";
        String actual = orderinfo.getShippingDate();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetPaymentType(){
        System.out.println("Test Get Payment Type ()");
        String expected = "Credit-Card";
        String actual = orderinfo.getPaymentType();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetCustomerAddress(){
        System.out.println("Test Get Customer Address ()");
        String expected = "No.1, Taman Satu 1 Jalan Satu 31330, Kuala Lumpur.";
        String actual = orderinfo.getCustomerAddress();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetOrderStatus(){
        System.out.println("Test Get Order Status ()");
        String expected = "Delivered Successful";
        String actual = orderinfo.getProductStatus();
        assertEquals(expected, actual);
    }

    /**
     * Test of listofOrder method, of class DeliveryOrder.
     */

    /**
     * Test of listofOrder1 method, of class DeliveryOrder.
     */

    /**
     * Test of main method, of class DeliveryOrder.
     */
    @Test
    public void testMain() {
        System.out.println("Test Main ()");
        String[] args = null;
        DeliveryOrder.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listofOrder method, of class DeliveryOrder.
     */
    
}
