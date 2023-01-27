class ExtendedForLoop {
	public static void main(String[] args) {
		String[] students = {
				"Shivani",
				"Shweta",
				"Vishalakshi",
				"Tanmay",
				"Zaheer",
				"Waseem"
			};
		for (String student : students) {
			System.out.println(student);
		}

		int[] numbers = {10,20,30,40,50,60};

		for (int n : numbers) {
			System.out.println(n);
		}
	}
}