import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0);
        Apple redApple = new Apple(10, 50.0, "red");
        Apple greenApple = new Apple(8, 60.0, "green");

        Food[] foods = new Food[]{meat, redApple, greenApple};

        ShoppingCart sCart = new ShoppingCart(foods);
        System.out.println("Стоимость всей корзины: " + sCart.getTotalPriceWithoutDiscount());
        System.out.println("Стоимость коризины со скидкой: " + sCart.getTotalPriceWithDiscount());
        System.out.println("Стоимость вегетарианских продкутов: " + sCart.getTotalVegetarianPriceWithoutDiscount());
    }
}
