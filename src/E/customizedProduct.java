/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E;

/**
 *
 * @author User
 */
public class customizedProduct {
    String selectedStyle;
    String selectedSize;
    String selectedFlower;
    String selectedAccessories;
    int SumPrice;
    String pickup;

    public customizedProduct(String selectedStyle, String selectedSize, String selectedFlower, String selectedAccessories, int SumPrice, String pickup){
        this.selectedStyle = selectedStyle;
        this.selectedSize = selectedSize;
        this.selectedFlower = selectedFlower;
        this.selectedAccessories = selectedAccessories;
        this.SumPrice = SumPrice;
        this.pickup = pickup;
    }
    
    
    public String getSelectedStyle() {
        return selectedStyle;
    }

    public void setSelectedStyle(String selectedStyle) {
        this.selectedStyle = selectedStyle;
    }

    public String getSelectedSize() {
        return selectedSize;
    }

    public void setSelectedSize(String selectedSize) {
        this.selectedSize = selectedSize;
    }

    public String getSelectedFlower() {
        return selectedFlower;
    }

    public void setSelectedFlower(String selectedFlower) {
        this.selectedFlower = selectedFlower;
    }

    public String getSelectedAccessories() {
        return selectedAccessories;
    }

    public void setSelectedAccessories(String selectedAccessories) {
        this.selectedAccessories = selectedAccessories;
    }

    public int getSumPrice() {
        return SumPrice;
    }

    public void setSumPrice(int SumPrice) {
        this.SumPrice = SumPrice;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }
    
    
    
    
    
        public String toString(){
        return String.format(" Style: %s\n Size: %s\n Flower: %s\n Accessories: %s\n Price: %d\n",selectedStyle ,selectedSize,selectedFlower,selectedAccessories,SumPrice);
    }
}
