import java.util.Scanner;

abstract class Shape{
	public abstract double getArea();
}

class Circle extends Shape {
	public double getArea(){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER RADIUS - ");
		int radius = sc.nextInt();
		double area = 3.14 * radius * radius;
		return area;
	}
}

class Rectangle extends Shape {
	public double getArea(){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER LENGTH - ");
		int length = sc.nextInt();
		System.out.print("ENTER BREADTH - ");
		int breadth = sc.nextInt();
		double area = length * breadth;
		return area;
	}
}

class RuntimePolymorphism {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		System.out.println("Circle Area - "+s1.getArea());
		Shape s2 = new Rectangle();
		System.out.println("Rectangle Area - "+s2.getArea());
	}
}