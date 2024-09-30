class CustomCoffee {
    private String size;
    private String milk;
    private String syrup;

    public CustomCoffee(String size, String milk, String syrup) {
        this.size = size;
        this.milk = milk;
        this.syrup = syrup;
    }

    @Override
    public String toString() {
        return size + " coffee with " + milk + " and " + syrup;
    }
}

class CoffeeBuilder {
    private String size;
    private String milk;
    private String syrup;

    public CoffeeBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public CoffeeBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeBuilder setSyrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    public CustomCoffee build() {
        return new CustomCoffee(size, milk, syrup);
    }
}
