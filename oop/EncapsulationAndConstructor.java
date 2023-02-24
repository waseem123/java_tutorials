import java.util.Scanner;

class Bottle{
	private int height;
	private int quantity;

	public Bottle(){
		this.height = 0;
		this.quantity = 0;
	}

	public Bottle(int height,int quantity){
		this.height = height;
		this.quantity = quantity;
	}

	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return height;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
}

class EncapsulationAndConstructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = 0;
		int quantity = 0;

		Bottle b1 = new Bottle();
		System.out.println("Height   - "+b1.getHeight()+" CM.");
		System.out.println("Quantity - "+b1.getQuantity()+" L.");
		System.out.println("__________________________");

		Bottle b2 = new Bottle();
		b2.setHeight(25);
		b2.setQuantity(1);
		System.out.println("Height   - "+b2.getHeight()+" CM.");
		System.out.println("Quantity - "+b2.getQuantity()+" L.");
		System.out.println("__________________________");

		Bottle b3 = new Bottle(50,2);
		System.out.println("Height   - "+b3.getHeight()+" CM.");
		System.out.println("Quantity - "+b3.getQuantity()+" L.");
		System.out.println("__________________________");

		Bottle b4 = new Bottle();
		System.out.println("ENTER HEIGHT OF BOTTLE - ");
		height = sc.nextInt();
		System.out.println("ENTER QUANTITY OF BOTTLE - ");
		quantity = sc.nextInt();
		b4.setHeight(height);
		b4.setQuantity(quantity);
		System.out.println("Height   - "+b4.getHeight()+" CM.");
		System.out.println("Quantity - "+b4.getQuantity()+" L.");
		System.out.println("__________________________");

		
		System.out.println("ENTER HEIGHT OF BOTTLE - ");
		height = sc.nextInt();
		System.out.println("ENTER QUANTITY OF BOTTLE - ");
		quantity = sc.nextInt();
		Bottle b5 = new Bottle(height,quantity);
		System.out.println("Height   - "+b5.getHeight()+" CM.");
		System.out.println("Quantity - "+b5.getQuantity()+" L.");
		System.out.println("__________________________");
	}
}