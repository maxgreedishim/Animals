package learning.anamals;

import java.util.ArrayList;
import java.util.List;

public class World {
    private static List <Animal> animals = new ArrayList<>();
    private static double food;
    static double cat_lose;
    static double feed (double  portion) {
        if (food - portion < 0){
            System.out.println("Еда кочилась ");
            return 0;
        }
        return portion;
    }

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Покормите животных ");
            return;
        }
        System.out.println("Колличество корма " + args[0]);
        food = Integer.parseInt(args[0]);
        cat_lose = Double.parseDouble(args[1]);

        animals.add(new Dog("Шарик"));
        /*animals.add(new Cat("Мура", false));
        animals.add(new Cat("Барсик"));
        animals.add(new Dog("Жучка", 6000,false));*/
        /*for (Animal animal : animals) System.out.println(animal);*/


    }
}
