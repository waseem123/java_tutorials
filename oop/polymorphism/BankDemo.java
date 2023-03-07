abstract class Bank{
	public abstract void getROI();
}

class SBI extends Bank{
	public void getROI(){
		System.out.println("ROI of SBI is - 11.0");
	}
}

class BOI extends Bank{
	public void getROI(){
		System.out.println("ROI of BOI is - 8.0");
	}
}

class Axis extends Bank{
	public void getROI(){
		System.out.println("ROI of AXIS is - 18.0");
	}
}

class BankDemo {
	public static void main(String[] args) {
		Bank b1 = new Axis();
		b1.getROI();

		Bank b2 = new SBI();
		b2.getROI();

		Bank b3 = new BOI();
		b3.getROI();
	}
}