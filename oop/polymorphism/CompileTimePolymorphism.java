class Area{
	public void getArea(int radius){
		double area = 3.14 * radius * radius;
		System.out.println("AREA OF CIRCLE IS - "+area);
	}

	public void getArea(int length, int breadth){
		double area = length * breadth;
		System.out.println("AREA OF RECTANGLE IS - "+area);
	}

	public void getArea(int base, int height){
		double area = 0.5 * base * height;
		System.out.println("AREA OF TRIANGLE IS - "+area);
	}
}

class CompileTimePolymorphism {
	public static void main(String[] args) {
		Area a = new Area();

		a.getArea(25,25); // triangle
		// a.getArea(25); // circle
		a.getArea(25,2); //rectangle
	}
}