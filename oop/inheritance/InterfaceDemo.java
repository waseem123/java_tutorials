class Watch{
	private String watch_brand="boAt";
	private String watch_type="Smart Watch";
	private int watch_price=8000;

	public void displayWatch(){
		System.out.println("BRAND - "+watch_brand);
		System.out.println("TYPE  - "+watch_type);
		System.out.println("PRICE - "+watch_price);
		System.out.println("_________________________");
	}
}

interface Android{
	String android_version = "V-12";
	public void getSmartFeatures();
}

class SmartWatch extends Watch implements Android{
	String connectivity = "Bluetooth";

	public void displaySmartWatch(){

		System.out.println("CONNECTIVITY - "+connectivity);
		System.out.println("_________________________");
	}

	public void getSmartFeatures(){

		String[] features = {"Heart Beat","Exercise","Step Count","Notifications"};
		for (String feature:features ) {
				System.out.println(feature);	
		}
		System.out.println("_________________________");
	}
}

class InterfaceDemo {
	public static void main(String[] args) {
		SmartWatch sm = new SmartWatch();
		sm.displayWatch();
		sm.displaySmartWatch();
		sm.getSmartFeatures();
	}
}