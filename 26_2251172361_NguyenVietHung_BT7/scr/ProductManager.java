public class ProductManager {
    private Product product;

    public ProductManager(Product product) {
        this.product = product;
    }

    public double getInventoryValue() {
        return product.getValue();
    }

    public void priceInfo() {
        System.out.println(product.getDescription());
    }
}
