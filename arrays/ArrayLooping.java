class ArrayLooping{
	public static void main(String[] args) {
		String[] names = new String[5];

		names[0] = "Shivani";
		names[1] = "Shweta";
		names[2] = "Rajesh";
		names[3] = "Tanmay";
		names[4] = "Zaheer";

		for (int i=0; i<5; i++) {
			System.out.println(names[i]);
		}

		System.out.println("_________________");
		for (String n : names) {
			System.out.println(n);
		}
	}
}