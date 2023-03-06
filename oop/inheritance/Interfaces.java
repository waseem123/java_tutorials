interface Audible{
	public void makeSound();
}

interface Eatable{
	public void eat();
}

class Animal{
	String animal_name = "Bob";

	public void getAnimal(){
		System.out.println("Name - "+animal_name);
	}
}
class Dog extends Animal implements Audible,Eatable{
	public void makeSound(){
		System.out.println("Dog makes sound Bhow Wow");
	}
	public void eat(){
		System.out.println("Dog eats Pedigree");
	}
}


class Cat extends Animal implements Audible,Eatable{
	public void makeSound(){
		System.out.println("Cat makes sound Meow Meow");
	}
	public void eat(){
		System.out 
	}
}
class Interfaces {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.getAnimal();
		d.makeSound();
		d.eat();
		System.out.println("____________");

		Cat c = new Cat();
		c.getAnimal();
		c.makeSound();
		c.eat();
		System.out.println("____________");
	}
}