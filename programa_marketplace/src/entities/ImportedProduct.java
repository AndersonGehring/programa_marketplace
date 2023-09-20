package entities;

public class ImportedProduct extends Product {

	private double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsFree) {
		super(name, price);
		this.customsFee = customsFree;
	}

	public double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice () {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " +  String.format("%.2f", customsFee);
	}
}
