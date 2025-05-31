public class Client {
    public static void main(String[] args) {
        Product mayTinh = new MayTinhAdapter(new MayTinh());
        Product laptop = new LaptopAdapter(new Laptop());

        mayTinh.show();
        laptop.show();
    }
}
