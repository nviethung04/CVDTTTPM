package FactoryAbstract;

public interface AbstractProductFactory {
	DongHo createDongHo(int soLuong);
    VongTay createVongTay(int soLuong);
}
