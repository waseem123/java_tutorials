class Software{
	String company = "InfoStack";
	public void displaySoftware(){
		System.out.println("COMPANY - "+company);
	}
}

class SystemSoftware extends Software{
	String os_version = "12";
	String os_name = "Android";

	public void displaySystemSoftware(){
		System.out.println("OS - "+os_name);
		System.out.println("OS VERSION- "+os_version);
	}
}

class ApplicationSoftware extends Software{
	String application_name = "Chat_APT";
	public void displayApplicationSoftware(){
		System.out.println("SOFTWARE - "+application_name);
	}
}

class AndroidApp extends ApplicationSoftware {
	String application_version="1.0";
	public void displayAndroidApp(){
		System.out.println("SOFTWARE VERSION - "+application_version);
	}
}

class HierarchicalInheritance {
	public static void main(String[] args) {
		SystemSoftware s = new SystemSoftware();
		s.displaySoftware();
		s.displaySystemSoftware();

		AndroidApp app=new AndroidApp();
		app.displaySoftware();
		app.displayApplicationSoftware();
		app.displayAndroidApp();
	}
}