package learning.anamals;

public class Cat extends Animal {

    public Cat(String name, double w, boolean g) {
        super(name,w,g);
    }

    @Override
    String makeSound() {
        return "Мяу";
    }
}
