package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    private final String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    public double getDiscount() {
        return Colour.RED.equals(this.colour) ? Discount.RED_APPLE_SALE : 0.0;
    }

    public String getColour() {
        return this.colour;
    }
}
