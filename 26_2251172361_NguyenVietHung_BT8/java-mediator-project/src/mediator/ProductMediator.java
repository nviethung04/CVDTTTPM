public class ProductMediator implements Mediator {
    private List<Product> products;

    public ProductMediator() {
        products = new ArrayList<>();
    }

    public void registerProduct(Product product) {
        products.add(product);
    }

    public void deregisterProduct(Product product) {
        products.remove(product);
    }

    public void notifyProducts(String message) {
        for (Product product : products) {
            product.receiveMessage(message);
        }
    }
}