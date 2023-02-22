class Watch{
	/*Instance Variables*/
	private String watch_brand;
	private String watch_type;
	private int watch_price;

	/*Default Constructor*/
	public Watch(){
		watch_brand="GShock";
		watch_type="Digital";
		watch_price=8000;
	}

	/*ParameterizedConstructor*/
	public Watch(String brand, String type, int price){
		watch_brand = brand;
		watch_type = type;
		watch_price = price;
	}

	public Watch(String brand,int price){
		watch_brand = brand;
		watch_price = price;
	}

	public void setWatchBrand(String brand){
		watch_brand = brand;
	}
	public String getWatchBrand(){
		return watch_brand;
	}

	public void setWatchType(String type){
		watch_type = type;
	}
	public String getWatchType(){
		return watch_type;
	}

	public void setWatchprice(int price){
		watch_price = price;
	}
	public int getWatchprice(){
		return watch_price;
	}
}


class ParameterizedConstructor {
	public static void main(String[] args) {
		Watch w1 = new Watch("BoAt","Smart Watch",3500);
		System.out.println("BRAND - "+w1.getWatchBrand());
		System.out.println("TYPE  - "+w1.getWatchType());
		System.out.println("PRICE - "+w1.getWatchprice());
		System.out.println("_________________________");

		
		Watch w2 = new Watch("Titan","Analog",5000);
		System.out.println("BRAND - "+w2.getWatchBrand());
		System.out.println("TYPE  - "+w2.getWatchType());
		System.out.println("PRICE - "+w2.getWatchprice());
		System.out.println("_________________________");

		
		Watch w3 = new Watch();
		System.out.println("BRAND - "+w3.getWatchBrand());
		System.out.println("TYPE  - "+w3.getWatchType());
		System.out.println("PRICE - "+w3.getWatchprice());
		System.out.println("_________________________");

		
		Watch w4 = new Watch();
		System.out.println("BRAND - "+w4.getWatchBrand());
		System.out.println("TYPE  - "+w4.getWatchType());
		System.out.println("PRICE - "+w4.getWatchprice());
		System.out.println("_________________________");

		Watch w5 = new Watch("Sonata",2000);
		System.out.println("BRAND - "+w5.getWatchBrand());
		System.out.println("TYPE  - "+w5.getWatchType());
		System.out.println("PRICE - "+w5.getWatchprice());
	}
}