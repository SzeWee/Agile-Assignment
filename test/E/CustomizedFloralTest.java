/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CustomizedFloralTest {
    
    customizedProduct cp = new customizedProduct();
    customizedProduct cp2 = new customizedProduct();
    ArrayList<customizedProduct> cpList = new ArrayList<>();
    
    
    public CustomizedFloralTest() {
        cp = new customizedProduct("asd","asd","Lily","asd",12,"asd");
        cp2 = new customizedProduct("asd","asd","Rose","asd",12,"asd");
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of init method, of class CustomizedFloral.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        CustomizedFloral instance = new CustomizedFloral();
        instance.init();
    }

    /**
     * Test of refreshFlower method, of class CustomizedFloral.
     */
    @Test
    public void testRefreshFlower() {
        System.out.println("refreshFlower");
        CustomizedFloral instance = new CustomizedFloral();
        instance.refreshFlower();
    }

    /**
     * Test of getTotal method, of class CustomizedFloral.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        CustomizedFloral instance = new CustomizedFloral();
        instance.getTotal();
    }
    
    /**
     * Test of main method, of class CustomizedFloral.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        cpList.add(cp);
        cpList.add(cp2);
        assertEquals("Lily",cpList.get(0).getSelectedFlower());
        String[] args= null;
        CustomizedFloral.main(args);
    }
}
