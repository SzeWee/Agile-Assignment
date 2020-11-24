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
public class product {
    String flowerName;
    int flowerPrice;
    String flowerStock;

    public product(String fn, int fp, String fs){
        this.flowerName = fn;
        this.flowerPrice = fp;
        this.flowerStock = fs;
    }
    
    //public String toString(){
    //    return String.format("Flower Name: %s\n Price: %d\n Stock status: %s\n\n",flowerName ,flowerPrice,flowerStock);
    //}  
}
