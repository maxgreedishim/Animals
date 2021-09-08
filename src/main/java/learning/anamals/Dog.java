package learning.anamals;

class Dog extends Animal {

    public Dog(String name, double w, boolean g) {

        super(name,w,g);

    }

    @Override
    String makeSound() {

        return "Гав";
    }
}
