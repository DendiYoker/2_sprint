import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, Colour.RED);
        Apple greenApple = new Apple(8, 60.0, Colour.GREEN);

        Food[] foods = new Food[]{meat, redApple, greenApple};

        ShoppingCart sCart = new ShoppingCart(foods);
        System.out.printf("Стоимость коризины со скидкой: %s%n", sCart.getTotalPriceWithoutDiscount());
        System.out.printf("Стоимость коризины со скидкой: %s%n", sCart.getTotalPriceWithDiscount());
        System.out.printf("Стоимость вегетарианских продкутов: %s%n", sCart.getTotalVegetarianPriceWithoutDiscount());
    }
}
