package FactoryAbstract;

public class VongTayKimCuong implements VongTay {

	 private int quantity;
	    private String productID;

	    public VongTayKimCuong(int quantity) {
	        this.quantity = quantity;
	        this.productID = "VT-KC-003";
	    }

	    public String getLoai() { return "Vòng tay kim cuong"; }
	    public int getQuantity() { return quantity; }
	    public void setQuantity(int soLuong) { this.quantity = soLuong; }
	    public String getProductId() { return productID; }
}
