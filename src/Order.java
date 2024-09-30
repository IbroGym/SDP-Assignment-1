class Order implements Cloneable {
    private Coffee coffee;

    public Order(Coffee coffee) {
        this.coffee = coffee;
    }

    public void displayOrder() {
        System.out.println("Order: " + coffee.getName());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
