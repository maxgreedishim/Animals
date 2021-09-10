package learning.anamals;

import java.util.ArrayList;
import java.util.List;

public class World {
    private static List <Animal> animals = new ArrayList<>();
    private static double food;
    private static double slimmingFactor;;
        public static double getSlimmingFactor(){
        return slimmingFactor;
    }
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
        if(args.length < 2) {
            System.out.println("Вы не указали фактор похудания.");
            return;
        }
        System.out.println("Колличество корма " + args[0]);
        food = Integer.parseInt(args[0]);
        slimmingFactor = Double.parseDouble(args[1]);

/*        animals.add(new Dog("Шарик"));
        animals.add(new Cat("Мура", false));*/
        animals.add(new Cat("Барсик"));
        /*animals.add(new Dog("Жучка", 6000,false));
        for (Animal animal : animals) System.out.println(animal);*/


    }
}
