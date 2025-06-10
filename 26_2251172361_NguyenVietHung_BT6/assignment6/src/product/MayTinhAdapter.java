public class MayTinhAdapter implements Product {
    private MayTinh mayTinh;

    public MayTinhAdapter(MayTinh mayTinh) {
        this.mayTinh = mayTinh;
    }

    @Override
    public void show() {
        mayTinh.display();
    }
}