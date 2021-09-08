package learning.anamals;

import java.util.ArrayList;
import java.util.List;

public class World {
    private static List <Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        animals.add(new Dog("Шарик", 12 ,true));
        animals.add(new Cat("Мура", 3 , false));
//        for (Animal animal : animals) System.out.println(animal);
        for (Animal animal : animals) new Thread(animal).start();
//        try {
//            while (true)Thread.sleep(1000);
//        } catch (Exception e){
//            System.out.printf(String.valueOf(e));
//        }

    }
}
