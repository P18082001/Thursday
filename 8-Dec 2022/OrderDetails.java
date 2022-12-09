package shoppingKartusingarray;

public class OrderDetails {
	private int orderId;
	private int productId;
	private String productName,brand;
private int	quantity;
private double totalAmount;

public OrderDetails(String productName, String brand, int quantity, double totalAmount) {
	super();
	this.productName = productName;
	this.brand = brand;
	this.quantity = quantity;
	this.totalAmount = totalAmount;
}



public int getOrderId() {
	return orderId;
}
public void setOrderId(int Id) {
	this.orderId = Id;
}



public int getProductId() {
	return productId;
}



public void setProductId(int productId) {
	this.productId = productId;
}



public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}





}


