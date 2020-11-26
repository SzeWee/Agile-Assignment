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
public class OrderInfo {
    
        public String orderID;
        public String purchaseDate;
        public String paymentType;
        public String shippingDate;
        public String customerAddress;
        public String productStatus;
        
        public OrderInfo(String orderID, String purchaseDate, String shippingDate, String paymentType, String customerAddress, String productStatus){
            this.orderID = orderID;
            this.purchaseDate = purchaseDate;
            this.paymentType = paymentType;
            this.shippingDate = shippingDate;
            this.customerAddress = customerAddress;
            this.productStatus = productStatus;
        }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
    }
