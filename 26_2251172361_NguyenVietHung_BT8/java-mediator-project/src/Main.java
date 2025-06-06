public class Main {
    public static void main(String[] args) {
        // Initialize the mediator
        ProductMediator mediator = new ProductMediator();

        // Create instances of products
        Product mayTinh = new MayTinh(mediator);
        Product lapTop = new LapTop(mediator);

        // Register products with the mediator
        mediator.registerProduct(mayTinh);
        mediator.registerProduct(lapTop);

        // Example interactions
        mayTinh.sendMessage("Hello from MayTinh");
        lapTop.sendMessage("Hello from LapTop");
    }
}