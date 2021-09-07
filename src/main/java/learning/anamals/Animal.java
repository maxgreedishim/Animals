package learning.anamals;

abstract class Animal implements Runnable {
    private String name;
    private double weight;
    private boolean gender;


    public Animal(String name, double weight, boolean gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    abstract String makeSound();

    @Override
    public String toString() {
        return  "Меня зовут " + name + ". " + makeSound() + "!";
    }
    @Override
    public void run () {
        while (weight > 0) {
            weight -= 0.5;
            System.out.println("Вес = " + weight + " " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Животное " + name + " погибло от голода.");
    }
}
