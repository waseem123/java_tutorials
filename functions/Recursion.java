class Recursion {
	public static void printMyName(int num){
		if(num>0){
			System.out.println("WASEEM");
			printMyName(num-1);
		}
	}

	public static void main(String[] args) {
		printMyName(10);
	}
}