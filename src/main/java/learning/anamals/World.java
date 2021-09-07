package learning.anamals;

import java.util.ArrayList;
import java.util.List;

public class World {
    private static List <Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        animals.add(new Dog("Шарик"));
        animals.add(new Cat("Мура"));
        for (Animal animal : animals) System.out.println(animal);
    }
}
