package learning.anamals;

class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Гав";
    }
}
