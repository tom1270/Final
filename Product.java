/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disprice;

/**
 *
 * @author nofoo
 */
class Product{
    
    private String productName;
    private double basePrice;
    private DiscountStrategy discount;

    public Product(String ProductName, double basePrice) {
        this.productName = ProductName;
        this.basePrice = basePrice;
    }

    public void setDiscount(DiscountStrategy discount){
        this.discount = discount;
    }

    public double getPrice(){
        if(discount == null){
         return basePrice;
        }else
         return discount.applyDiscount(basePrice);
    }

    @Override
    public String toString() {
        return "Product Name: " + productName + ", Price: " + getPrice();
    }
}



