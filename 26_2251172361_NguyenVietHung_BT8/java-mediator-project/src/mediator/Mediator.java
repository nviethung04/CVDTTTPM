public interface Mediator {
    void registerProduct(Product product);
    void deregisterProduct(Product product);
    void notifyProducts(String message);
}