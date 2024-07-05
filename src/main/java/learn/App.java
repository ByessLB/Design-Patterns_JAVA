package learn;

import learn.Animal.Animal;
import learn.Animal.AnimalFactory;
import learn.Payment.CardStrategy;
import learn.Payment.Cart;
import learn.Payment.PaypalStrategie;

public class App 
{
    public static void main( String[] args ) {
        Database db = Database.getInstance();

        // Test Factory
        Animal sparky = AnimalFactory.getAnimal("dog");
        sparky.scream();
        Animal caligula = AnimalFactory.getAnimal("cat");
        caligula.scream();

        // Test Strategy
        Cart cart = new Cart(new CardStrategy());
        cart.pay(500);

        Cart cart1 = new Cart(new PaypalStrategie());
        cart1.pay(700);
    }
}
