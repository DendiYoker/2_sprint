package model;

public abstract class Food {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.isVegetarian;
    }
}
