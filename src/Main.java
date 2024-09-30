public class Main {
    public static void main(String[] args) {
        // Singleton pattern
        CoffeeShop shop = CoffeeShop.getInstance();

        // Factory Method pattern
        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        shop.placeOrder(latte);

        // Abstract Factory pattern
        IngredientFactory latteIngredientFactory = new LatteIngredientFactory();
        Milk milk = latteIngredientFactory.createMilk();
        Syrup syrup = latteIngredientFactory.createSyrup();
        System.out.println("Ingredients: " + milk.getMilkType() + ", " + syrup.getSyrupType());

        // Prototype pattern
        Order firstOrder = new Order(latte);
        try {
            Order clonedOrder = (Order) firstOrder.clone();
            clonedOrder.displayOrder();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Builder pattern
        CustomCoffee customCoffee = new CoffeeBuilder()
                .setSize("Large")
                .setMilk("Oat Milk")
                .setSyrup("Hazelnut Syrup")
                .build();
        System.out.println("Custom Coffee: " + customCoffee);
    }
}

