package learning.anamals; //Пакет

import java.util.ArrayList; // Полезные библиотеки
import java.util.List;

public class World { // Главный класс проэкта
    private static List <Animal> animals = new ArrayList<>(); //Список животных
    private static double food; // Коллчество еды, статик потому что считывается из статического метода
    private static double slimmingFactor; // фактор похудения
    public static double getSlimmingFactor(){ // метод доступа к приватной переменной
        return slimmingFactor;
    }
    static double feed (double  portion) { // метод ктроля еды
        if (food - portion < 0){
            System.out.println("Еда кочилась ");
            return 0;
        }
        food -= portion; // забираем еду из кормушки
        return portion;
    }

    public static void main(String[] args) { //точка входа в программу
        if (args.length == 0){ //проверка весения аргументов
            System.out.println("Покормите животных ");
            return;
        }
        if(args.length < 2) { // проверка колличества параметров
            System.out.println("Вы не указали фактор похудания.");
            return;
        }
        System.out.println("Колличество корма " + args[0]);
        food = Integer.parseInt(args[0]); //преобразование строки в число целое
        slimmingFactor = Double.parseDouble(args[1]);//преобразование строки в число с плавающей точкой(двойной точности)

/*        animals.add(new Dog("Шарик"));
        animals.add(new Cat("Мура", false));*/
        animals.add(new Cat("Барсик")); // добавляем животных в список
        animals.add(new Dog("Жучка", 6000,false));



    }
}
