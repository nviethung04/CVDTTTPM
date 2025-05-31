public class PC implements Product {
    private double price;
    private int quantity;
    private String cpu;
    private String gpu;

    public PC(double price, int quantity, String cpu, String gpu) {
        this.price = price;
        this.quantity = quantity;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    @Override
    public double getValue() {
        return price * quantity;
    }

    @Override
    public String getDescription() {
        return "PC with CPU: " + cpu + ", GPU: " + gpu + ", Price: " + price + ", Quantity: " + quantity;
    }
}
