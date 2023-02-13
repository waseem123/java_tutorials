class Searching {
	public static boolean isPresent(int[] arr,int key){
		for (int value : arr) {
			if(value == key){
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = {20,6,12,123,50,42,85,95,67,21};
		int number = 1234;
		if(isPresent(array,number)){
			System.out.println(number+" IS PRESENT");
		}else{
			System.out.println(number+" IS NOT PRESENT.");
		}
	}
}