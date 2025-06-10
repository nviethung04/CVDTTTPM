public class LaptopAdapter implements Product {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void show() {
        laptop.display();
    }
}