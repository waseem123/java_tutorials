class ParameterWithReturn {
	public static int multiplication(int fnum,int snum){
		return fnum * snum;
	}
	public static void main(String[] args) {
		int result= multiplication(10,20);
		System.out.println("Multiplication is :"+result);
		System.out.println(multiplication(5,20));


		System.out.println(multiplication(5,multiplication(2,10)));
		System.out.println(multiplication(multiplication(10,3),multiplication(2,10)));
	}
}