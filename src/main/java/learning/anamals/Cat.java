package learning.anamals;

class Cat extends Animal {
    private final int CAT_WEIGHT = 3000;
    private final double CAT_PORTION = 200;



   @Override
    double getPortion () {
      return  World.feed(CAT_PORTION * Math.random() + CAT_PORTION);
    }

    Cat(String name, double w, boolean g) {

        super(name,w,g);
    }

    Cat(String name, boolean gender) {

        super(name,gender);
        this.weight = CAT_WEIGHT;
    }

    Cat(String name){

        super(name);
        this.weight = CAT_WEIGHT;
    }

    @Override
    String makeSound() {

        return "Мяу";
    }


}
