package learning.anamals;

class Dog extends Animal {
    private final int DOG_WEIGHT = 10000; //начальный вес собаки
    private final double DOG_PORTION = 500; // порция

    @Override
    double getPortion () { // порция меняется рандомно
        //обращение к статическому методу класса word
        return  World.feed(DOG_PORTION * Math.random() + DOG_PORTION);
    }

    public Dog(String name, double w, boolean g) { //

        super(name,w,g);

    }
    Dog(String name, boolean gender) { //конструктор с двумя параметрами

        super(name,gender); // обращение к родительскому конструктору с соответствующими параметрами
        this.weight = DOG_WEIGHT; // вес берется из константы
    }

    Dog(String name){

        super(name);
        this.weight = DOG_WEIGHT;
    }


    @Override
    String makeSound() { // переопределяем абстрактный метод родительского класса

        return "Гав";
    }
}
