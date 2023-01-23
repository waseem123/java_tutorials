class UnaryOperators {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		System.out.println("_______");

		x++; // x = x+1 -> 11 (POST Increment)
		System.out.println(x);

		++x; // x = x+1 -> 12 (PRE Increment)
		System.out.println(x);
		System.out.println("_______");

		System.out.println(x++);
		System.out.println(x);

		System.out.println(++x);
		System.out.println(x);
		System.out.println("_______");

		System.out.println(x--);
		System.out.println(--x);		
	}
}