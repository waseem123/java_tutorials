class AssignmentOperators {
	public static void main(String[] args) {
		int x,y,z;
		x = 20; // RHS Value assigned to LHS variable
		y = x;  // RHS Variable assigned to LHS variable
		z = x+y; //RHS expression assigned to LHS variable
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("_____________");

		x += 100; // x = x+100;
		System.out.println(x);
		System.out.println("_____________");

		x -= 10; // x = x-10;
		System.out.println(x);
		System.out.println("_____________");

		x *= 10; // x = x*10;
		System.out.println(x);
	}
}