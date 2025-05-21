package FactoryAbstract;

public class Main {
    public static void main(String[] args) {
    	   AbstractProductFactory factory1 = new FactoryCoVang();
           DongHo dh1 = factory1.createDongHo(0);
           VongTay vt1 = factory1.createVongTay(0);
           System.out.println("Đơn hàng 1:");
           System.out.println("- Đồng hồ: " + dh1.getProductId() );
           System.out.println("- Vòng tay: " + vt1.getProductId() );

           System.out.println();

           AbstractProductFactory factory2 = new FactoryMayKimCuong();
           DongHo dh2 = factory2.createDongHo(1);
           VongTay vt2 = factory2.createVongTay(1);
           System.out.println("Đơn hàng 2:");
           System.out.println("- Đồng hồ: " + dh2.getProductId() );
           System.out.println("- Vòng tay: " + vt2.getProductId() );
    }
}