public class LapTop extends Product {
    private String brand;
    private String model;
    private double screenSize;

    public LapTop(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}