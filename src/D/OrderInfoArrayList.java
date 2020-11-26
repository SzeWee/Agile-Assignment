/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class OrderInfoArrayList {
    
    public ArrayList listofOrder(){
        ArrayList<OrderInfo> list = new ArrayList<>();
        OrderInfo oi1 = new OrderInfo("O00001","Colwin Yik","17/10/2020","24/10/2020","Credit-Card","No.1, Taman Satu 1 Jalan Satu 31330, Kuala Lumpur.","Delivered");
        OrderInfo oi2 = new OrderInfo("O00002","Michael Lee","24/10/2020","27/10/2020","Debit-Card","K379, Taman Bunga 12, Jalan Tiga 45910, Ipoh Perak.","Delivered");
        OrderInfo oi3 = new OrderInfo("O00003","John Cena","29/10/2020","02/11/2020","Credit-Card","Block C-11, Taman Mahatir 7, Jalan Badawi 55730, Shah Alam.","Delivering");
        OrderInfo oi4 = new OrderInfo("O00004","James Bond","07/11/2020","10/11/2020","Debit-Card","No.3, Jalan Pasir Delima 7, Jalan Badawi 55730, Shah Alam.","Processing");
        OrderInfo oi5 = new OrderInfo("O00005","Peter Chiu","13/11/2020","16/11/2020","Credit-Card","A113, Taman Selangor 7, Jalan Badawi 55730, Shah Alam.","Processing");
        list.add(oi1);
        list.add(oi2);
        list.add(oi3);
        list.add(oi4);
        list.add(oi5);
        return list;
    }
}
