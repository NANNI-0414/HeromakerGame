package Model.Store;

public class Item {
	private String name; 
	private String Description;
	private int price; 
	
	public Item(String name, String Description, int price) {
		this.name = name;
		this.Description= Description;
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.Description;
	}
}
