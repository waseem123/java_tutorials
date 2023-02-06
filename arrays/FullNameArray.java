class FullNameArray{
	public static void main(String[] args) {
		String[] fname = {"Shivani","Shweta","Onkar","Waseem"};
		String[] lname = {"Shivgunde","Shivgunde","Kamble","Attar"};

		System.out.println("__________FIRTSTNAMES___________");
		for (String name : fname) {
			System.out.println(name);
		}
		System.out.println("__________LASTNAMES___________");
		for (String name : lname) {
			System.out.println(name);
		}

		System.out.println("__________FULLNAMES___________");
		String[] fullName = new String[4];
		for (int i=0; i<4; i++) {
			fullName[i] = fname[i]+" "+lname[i];
			System.out.println((i+1)+". "+fullName[i]);
		}
	}
}

// 0->Shivani   0->Shivgunde 0->Shivani Shivgunde
// 1->Shweta    1->Shivgunde 1->Shweta Shivgunde
// 2->Onkar     2->Kamble    2->Onkar Kamble
// 3->Waseem    3->Attar     3->Waseem Attar