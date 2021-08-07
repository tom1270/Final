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
class ChristmasDiscount extends DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return 0.4 * price;
    }
}

