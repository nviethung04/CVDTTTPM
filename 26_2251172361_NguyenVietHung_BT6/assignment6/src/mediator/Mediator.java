public interface Mediator {
    void registerProduct(Product product);
    void notify(String message);
}