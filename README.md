# Design Patterns : Singleton, Factory, Stategy

1. Design Pattern Singleton

Le desgin pattern Singleton est un pattern de création qui garantit qu'une classe ait une seule et unique instance, tout en fournissant un point d'accès global à cette instance.

Exemple : 

```java
public class Database {

    private static Database instance;

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
```
Pour utliser le Singleton :

```java
    Database db = Database.getInstance();
```

2. Design Pattern Factory

Le design pattern Factory est un pattern de créartion qui fournit une interface pour créer des objets dans une super-classe, mais permet aux sous-classes de choisir la classe concrète à instancier.

Exemple :

```java
// Interface pour les crie d'animaux
public interface Animal {
    void scream();
}

// Implémentation de l'interface
public class Cats implements Animal {

    @Override
    public void scream() {
        System.out.println("Miaou !");
    }
}

// Implémentation de l'interface
public class Dogs implements Animal {

    @Override
    public void scream() {
        System.out.println("Woof !");
    }
}

// Fabrique d'objets
public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) return new Dogs();
        else if ("cat".equalsIgnoreCase(type)) return new Cats();
        else return null;
    }
}
```

Pour utiliser la Factory :

```java
    Animal sparky = AnimalFactory.getAnimal("dog");
    sparky.scream();
    Animal caligula = AnimalFactory.getAnimal("cat");
    caligula.scream();
```

3. Design Pattern Strategy

Le design pattern Strategy est un pattern de comportement qui définit une famille d'algorithmes, encapsule chacun d'entre eux et les rend interchangables. Strategy permet de choisir un algorithme à exécuter à la colée.

Exemple :

```java
// Interface pour les Strategy
public interface PaymentStrategy {
    void pay(double amount);
}

// Implémentation de l'interface
public class PaypalStrategie implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by Paypal");
    }
}

// Implémentation de l'interface
public class CardStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by card.");
    }
}

// Contexte qui utilise une Strategy
public class Cart {
    private PaymentStrategy paymentStrategy;

    public Cart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
```

Pour utiliser la Strategy :

```java
    Cart cart = new Cart(new CardStrategy());
    cart.pay(500);

    Cart cart1 = new Cart(new PaypalStrategie());
    cart1.pay(700);
```"# Design-Patterns_JAVA" 
