public class Laptop implements Product {
    private double price;
    private int quantity;
    private double screenSize;
    private double batteryLife;

    public Laptop(double price, int quantity, double screenSize, double batteryLife) {
        this.price = price;
        this.quantity = quantity;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    @Override
    public double getValue() {
        return price * quantity;
    }

    @Override
    public String getDescription() {
        return "Laptop with Screen Size: " + screenSize + " inches, Battery Life: " + batteryLife + " hrs, Price: " + price + ", Quantity: " + quantity;
    }
}
