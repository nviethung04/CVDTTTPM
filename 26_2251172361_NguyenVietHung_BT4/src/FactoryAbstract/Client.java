package FactoryAbstract;

public class Client {
    private DongHo dongHo;
    private VongTay vongTay;

    public Client(AbstractProductFactory factory) {
        dongHo = factory.createDongHo(1);
        vongTay = factory.createVongTay(2);
    }


}
