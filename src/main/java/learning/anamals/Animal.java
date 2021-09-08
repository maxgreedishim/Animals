package learning.anamals;

abstract class Animal implements Runnable {
    private String name;
    private double weight;
    private boolean gender;

    Animal(String name, double weight, boolean gender) {
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
            weight -= 0.2;
            if (weight <= 0.1){
                System.out.println(makeSound() + ". Животное " + name + " погибло от голода."  );
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
