package learning.anamals;

abstract class Animal implements Runnable { //абстракный класс, кроме того наследуется от интерфейса, потому что из него будет запущенн поток Thread.
    private String name; // поле имя
    private boolean gender; // поле пол.
    protected double weight; // поле вес доступен всем классам наследникам (protected)

    Animal() { // пустой конструктор

        new Thread(this).start(); //создаем поток к текущему животному, стартуем
    }

    Animal (String name) { //коннструктор с одним параметром.
        this(); //сначала вызываем конструктор без параметров
        this.name = name;  //присваивание полю значение
        this.gender = true; //по умолчанию пол мужской

    }
    Animal (String name, double weight){ // конструктор с другим наборов параметров
        this(name); // конструктор обращается к другому конструктору
        this.weight = weight; //присваивание полю значение

    }
    Animal (String name, boolean gender) {// конструктор с другим наборов параметров
        this(name);// конструктор обращается к другому конструктору
        this.gender = gender;//присваивание полю значение

    }


    Animal(String name, double weight, boolean gender) {// конструктор с другим наборов параметров
        this(name, weight); // конструктор обращается к другому конструктору
        this.gender = gender;
    }


    abstract String makeSound(); // абстракный метод, что говорит животное, должен(обязан) быть реализован классах потомках

    void feed () { // метод кормления

        weight += getPortion(); //к весу + порцию кормления
    }
    void slim () { // метод худения с учетом фактора
        weight -= getPortion() * World.getSlimmingFactor(); //набирает или теряем вес
    }

    abstract double getPortion(); // у каждого животного разные порции должен(обязан) быть реализован классах потомках

    @Override
    public String toString() { // удобное представление инстанца ввиде строки

        return  "Меня зовут " + name + ". " + makeSound() + "!"; // понятная строка на русском языке
    }
    @Override
    public void run () { // мы обязаны написать это  метод потому что класс Runnable
        double startWeight = weight; // присваивание переменной
        System.out.println(this); // приветствие животного
        while (weight > 0) { // цыкл
            feed();
            slim ();

            if (weight <= 100){
                System.out.println(makeSound() + ". Я, " + name + ", " + (gender? "погиб" : "погибла") + " от голода.");
                break;
            }
            if (weight >= startWeight * 2){
                System.out.println(makeSound() + ". Я, " + name + ", " + (gender? "погиб" : "погибла") + " от переедания.");
                break;
            }
            System.out.println("Вес = " + weight + " " + name);
            try { // обработка исключений
                Thread.sleep(500); // задержка вывода
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
