package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private final Food[] foodsInCart;

    public ShoppingCart(Food[] items) {
        this.foodsInCart = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;

        for(Food item : this.foodsInCart) {
            total += item.getAmount() * item.getPrice();
        }

        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0.0;

        for(Food item : this.foodsInCart) {
            double itemPrice = item.getAmount() * item.getPrice();
            if (item instanceof Discountable) {
                double discount = ((Discountable)item).getDiscount();
                itemPrice = itemPrice * (100.0 - discount) / 100.0;
            }

            total += itemPrice;
        }

        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0.0;

        for(Food item : this.foodsInCart) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }

        return total;
    }
}
