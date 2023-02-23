class Computer{
	private String brand;
	private int RAM;
	private int storage;

	public Computer(){
		brand = "HP";
		RAM = 8;
		storage = 512;
	}

	public Computer(String brand, int RAM, int storage){
		this.brand = brand;
		this.RAM = RAM;
		this.storage = storage;
	}

	public Computer(Computer c){
		this.brand = c.brand;
		this.RAM = c.RAM;
		this.storage = c.storage;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}

	public void setRAM(int RAM){
		this.RAM = RAM;
	}
	public int getRAM(){
		return RAM;
	}

	public void setStorage(int storage){
		this.storage = storage;
	}
	public int getStorage(){
		return storage;
	}
}

class CopyConstructor {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		System.out.println("BRAND   - "+c1.getBrand());
		System.out.println("RAM     - "+c1.getRAM()+" GB");
		System.out.println("STORAGE - "+c1.getStorage()+" GB");
		System.out.println("___________________________");

		Computer c2 = new Computer("Lenovo",4,1024);
		c2.setBrand("DELL");
		System.out.println("BRAND   - "+c2.getBrand());
		System.out.println("RAM     - "+c2.getRAM()+" GB");
		System.out.println("STORAGE - "+c2.getStorage()+" GB");
		System.out.println("___________________________");

		Computer c3 = new Computer(c1);
		System.out.println("BRAND   - "+c3.getBrand());
		System.out.println("RAM     - "+c3.getRAM()+" GB");
		System.out.println("STORAGE - "+c3.getStorage()+" GB");
		System.out.println("___________________________");

		Computer c4 = new Computer(c2);
		System.out.println("BRAND   - "+c4.getBrand());
		System.out.println("RAM     - "+c4.getRAM()+" GB");
		System.out.println("STORAGE - "+c4.getStorage()+" GB");
		System.out.println("___________________________");

		Computer c5 = c4;
		System.out.println(c4);
		System.out.println(c5);
		c5.setRAM(16);
		System.out.println("BRAND   - "+c5.getBrand());
		System.out.println("RAM     - "+c5.getRAM()+" GB");
		System.out.println("STORAGE - "+c5.getStorage()+" GB");

		System.out.println("BRAND   - "+c4.getBrand());
		System.out.println("RAM     - "+c4.getRAM()+" GB");
		System.out.println("STORAGE - "+c4.getStorage()+" GB");


	}
}