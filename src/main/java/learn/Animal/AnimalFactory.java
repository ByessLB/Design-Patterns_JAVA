package learn.Animal;

public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) return new Dogs();
        else if ("cat".equalsIgnoreCase(type)) return new Cats();
        else return null;
    }
}
