class Phone{
	String base_feature = "Calling";

	public void displayPhone(){
		System.out.println("BASE FEATURE - "+base_feature);
	}
}

class Mobile extends Phone{
	String[] mobile_features={"SMS","Internet"};
	public void displayMobile(){
		System.out.println("MOBILE FEATURES - ");
		for (String feature:mobile_features) {
			System.out.println("*"+feature);
		}
	}
}

class SmartPhone extends Mobile {
	String[] smart_features = {"TouchScreen","Gaming","Camera","Social Media","AI based Apps", "Sensors"};
	public void displaySmartPhone(){
		System.out.println("SMART PHONE FEATURES - ");
		for (String feature:smart_features) {
			System.out.println("*"+feature);
		}
	}
}
class MultilevelInheritance {
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		sm.displayPhone();
		sm.displayMobile();
		sm.displaySmartPhone();
	}
}