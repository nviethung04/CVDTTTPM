public class Main {
    public static void main(String[] args) {
        Product pc = new PC(1000, 5, "Intel i7", "NVIDIA GTX 1660");
        Product laptop = new Laptop(1200, 3, 15.6, 8);

        ProductManager pcManager = new ProductManager(pc);
        ProductManager laptopManager = new ProductManager(laptop);

        pcManager.priceInfo();
        System.out.println("Total PC inventory value: $" + pcManager.getInventoryValue());

        laptopManager.priceInfo();
        System.out.println("Total Laptop inventory value: $" + laptopManager.getInventoryValue());
    }
}
