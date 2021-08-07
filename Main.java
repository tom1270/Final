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
public class Main {
    public static void main(String[] args){
        
        Product product = new Product("Computer", 750.00);
        System.out.println("Product before discount: ");
        System.out.println(product);
        
        product.setDiscount(new BlackFridayDiscount());
        System.out.println("\nProduct after Black Friday discount: ");
        System.out.println(product);
        
        product.setDiscount(new ChristmasDiscount());
        System.out.println("\nProduct after Christmas discount: ");
        System.out.println(product);
        
        product.setDiscount(new MemberDiscount());
        System.out.println("\nProduct after Member discount: ");
        System.out.println(product);
    }
}
