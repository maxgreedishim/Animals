package learning.anamals;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {

    }

    abstract String makeSound();

    @Override
    public String toString(){
        return  "Меня зовут " + name + ". " + makeSound() + "!";
    }
}
