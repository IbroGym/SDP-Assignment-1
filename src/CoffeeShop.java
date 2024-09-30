class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {
        System.out.println("Welcome to the CoffeeShop!");
    }

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void placeOrder(Coffee coffee) {
        System.out.println("Order placed: " + coffee.getName());
    }
}
