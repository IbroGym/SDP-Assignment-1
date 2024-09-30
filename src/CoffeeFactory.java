abstract class Coffee {
    String name;

    public String getName() {
        return name;
    }
}

class Latte extends Coffee {
    public Latte() {
        name = "Latte";
    }
}

class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
    }
}

abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}

class LatteFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Latte();
    }
}

class EspressoFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Espresso();
    }
}
