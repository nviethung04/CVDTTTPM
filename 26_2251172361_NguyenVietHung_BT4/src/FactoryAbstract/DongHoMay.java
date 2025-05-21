package FactoryAbstract;

public class DongHoMay implements DongHo {
	   private int quantity;
	    private String productID;

	    public DongHoMay(int quantity) {
	        this.quantity = quantity;
	        this.productID = "DH-M-002 casio-mtp";
	    }
	    
	  public String getLoai() { return "Đồng hồ máy"; }
	  public int getQuantity() { return quantity; }
	  public void setQuantity(int soLuong) { this.quantity = quantity; }
	  public String getProductId() { return productID; }
		

}
