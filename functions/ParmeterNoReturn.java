class ParmeterNoReturn {
	public static void intro(String name,int age){
		System.out.println("My name is "+name+". I am "+age+" years old.");
	}
	public static void main(String[] args) {
		intro("Waseem",30);
		intro("Peter",5);
		intro("John",60);
	}
}