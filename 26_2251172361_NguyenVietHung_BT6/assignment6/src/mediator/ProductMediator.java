public class ProductMediator implements Mediator {
    private Product mayTinh;
    private Product laptop;

    public ProductMediator(Product mayTinh, Product laptop) {
        this.mayTinh = mayTinh;
        this.laptop = laptop;
    }

    @Override
    public void communicate() {
        // Implement communication logic between products here
        mayTinh.show();
        laptop.show();
    }
}