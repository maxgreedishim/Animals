package learning.anamals;

abstract class Animal implements Runnable {
    private String name;
    protected double weight;
    private boolean gender;



    Animal() {
        new Thread(this).start();
    }

    Animal (String name) {
        this();
        this.name = name;
        this.gender = true;

    }
    Animal (String name, double weight){
        this();
        this.name = name;
        this.weight = weight;
        this.gender = true;
    }
    Animal (String name, boolean gender) {
        this();
        this.name = name;
        this.gender = gender;

    }


    Animal(String name, double weight, boolean gender) {
        this();
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }


    abstract String makeSound();

    void feed () {
        weight += getPortion();
    }

    abstract double getPortion();

    @Override
    public String toString() {

        return  "Меня зовут " + name + ". " + makeSound() + "!";
    }
    @Override
    public void run () {
        double startWeight = weight;
        System.out.println(this);
        while (weight > 0) {
            feed();
            weight -= getPortion() * World.getslimmingFactor();
            if (weight <= 100){
                System.out.println(makeSound() + ". Я, " + name + ", " + (gender? "погиб" : "погибла") + " от голода.");
                break;
            }
            if (weight >= startWeight * 2){
                System.out.println(makeSound() + ". Я, " + name + ", " + (gender? "погиб" : "погибла") + " от переедания.");
                break;
            }
            System.out.println("Вес = " + weight + " " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
