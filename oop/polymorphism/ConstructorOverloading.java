class Bag{
	String brand;
	int price;

	public Bag(String brand, int price){
		this.brand = brand;
		this.price = price;
	}

	public void displayBag(){
		System.out.println("BRAND - "+brand);
		System.out.println("PRICE - "+price);
	}
}

class TravellingBag extends Bag{
	int capacity;

	public TravellingBag(String brand, int price, int capacity){
		super(brand,price);
		this.capacity = capacity;
	}

	public void displayBag(){
		super.displayBag();
		System.out.println("CAPACITY - "+capacity+" KG.");
	}
}

class ConstructorOverloading {
	public static void main(String[] args) {
		TravellingBag tb = new TravellingBag("American Tourister",5000,20);
		tb.displayBag();
	}
}