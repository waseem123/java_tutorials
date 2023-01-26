class EvenOddCommandLine {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int result = num%2;
		if(result==0){
			System.out.println(num+" IS EVEN.");
		}else{
			System.out.println(num+" IS ODD.");
		}
	}
}