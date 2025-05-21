package FactoryAbstract;

public class FactoryMayKimCuong implements AbstractProductFactory {
	@Override
	public DongHo createDongHo(int quantity) {
		 return new DongHoMay(quantity);		}

	@Override
	public VongTay createVongTay(int soLuong) {
        return new VongTayKimCuong(soLuong);
	}
}
