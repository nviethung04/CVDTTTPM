package FactoryAbstract;

public class DongHoCo implements DongHo {
	private int quantity;
	private String productID;
	
	
	  public DongHoCo(int soLuong) {
	        this.quantity = soLuong;
	        this.productID = "DH-C-001 faderique constant";
	    }
	  
	public String getLoai() { return "Đồng hồ cơ"; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getProductID() { return productID; }

	@Override
	  public String getProductId() { return productID; }

	
}
