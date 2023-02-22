/*
1. Constructor is a special member function whose name 
is same as CLASS NAME.
2. It gets called AUTOMATICALLY when the object of class
has created.
3. Constructor is always defined PUBLICE.
4. Constructor does not return any data so there is no
return datatype. NOT EVEN VOID.
5. Constructors are of 3 types
	1. Default
	2. Parameterized
	3. Copy
*/


class Book{
	private int bookId;
	private String bookTitle;
	private String bookAuthor;

	public Book(){
		bookId = 101;
		bookTitle = "C Programming";
		bookAuthor= "Dennise Ritchie";
	}

	public void setBookId(int bId){
		bookId = bId;
	}
	public int getBookId(){
		return bookId;
	}

	public void setBookTitle(String bTitle){
		bookTitle = bTitle;
	}
	public String getBookTitle(){
		return bookTitle;
	}

	public void setBookAuthor(String bAuthor){
		bookAuthor = bAuthor;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
}

class ConstructorDemo {
	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println("ID     - "+b1.getBookId());
		System.out.println("TITLE  - "+b1.getBookTitle());
		System.out.println("AUTHOR - "+b1.getBookAuthor());

		System.out.println("_________________________");
		Book b2 = new Book();
		b2.setBookId(102);
		b2.setBookTitle("Programming in Python");
		

		System.out.println("ID     - "+b2.getBookId());
		System.out.println("TITLE  - "+b2.getBookTitle());
		System.out.println("AUTHOR - "+b2.getBookAuthor());

	}
}