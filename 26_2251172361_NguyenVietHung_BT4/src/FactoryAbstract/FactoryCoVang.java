package FactoryAbstract;

public class FactoryCoVang implements AbstractProductFactory  {
	
		@Override
		public DongHo createDongHo(int quantity) {
			 return new DongHoCo(quantity);		}

		@Override
		public VongTay createVongTay(int soLuong) {
	        return new VongTayVang(soLuong);
		}
}
