class LogicalOperators {
	public static void main(String[] args) {
		int x = 5;
		int y = 15;
		int z = 65;

		System.out.println(x<y && x<z);
		System.out.println(x>y || x>z);

		System.out.println(!(x>y));
	}
}