interface Milk {
    String getMilkType();
}

class AlmondMilk implements Milk {
    public String getMilkType() {
        return "Almond Milk";
    }
}

class RegularMilk implements Milk {
    public String getMilkType() {
        return "Regular Milk";
    }
}

interface Syrup {
    String getSyrupType();
}

class VanillaSyrup implements Syrup {
    public String getSyrupType() {
        return "Vanilla Syrup";
    }
}

class CaramelSyrup implements Syrup {
    public String getSyrupType() {
        return "Caramel Syrup";
    }
}

interface IngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}

class LatteIngredientFactory implements IngredientFactory {
    public Milk createMilk() {
        return new RegularMilk();
    }

    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}

class EspressoIngredientFactory implements IngredientFactory {
    public Milk createMilk() {
        return null; // Espresso usually doesn't have milk
    }

    public Syrup createSyrup() {
        return new CaramelSyrup();
    }
}
