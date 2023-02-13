class PrimeNumber {
	public static boolean isPrimeNumber(int number){
		if(number>2){
			int temp = number/2;
			for (int i=2; i<temp; i++) {
				if(number%i==0){
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(5));
	}
}
