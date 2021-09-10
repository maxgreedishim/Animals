package learning.anamals;

class Dog extends Animal {
    private final int DOG_WEIGHT = 10000;
    private final double DOG_PORTION = 500;

    @Override
    double getPortion () {
        return  World.feed(DOG_PORTION * Math.random() + DOG_PORTION);
    }

    public Dog(String name, double w, boolean g) {

        super(name,w,g);

    }
    Dog(String name, boolean gender) {

        super(name,gender);
        this.weight = DOG_WEIGHT;
    }

    Dog(String name){

        super(name);
        this.weight = DOG_WEIGHT;
    }


    @Override
    String makeSound() {

        return "Гав";
    }
}
