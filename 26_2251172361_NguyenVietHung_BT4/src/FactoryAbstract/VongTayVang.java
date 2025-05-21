package FactoryAbstract;

public class VongTayVang implements VongTay {
	 private int quantity;
	 private String productID;

	    public VongTayVang(int quantity) {
	        this.quantity = quantity;
	        this.productID = "VT-V-003";
	    }

	    public String getLoai() { return "Vòng tay vàng"; }
	    public int getQuantity() { return quantity; }
	    public void setQuantity(int soLuong) { this.quantity = soLuong; }
	    public String getProductId() { return productID; }
}
