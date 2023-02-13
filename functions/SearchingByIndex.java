class SearchingByIndex {
	public static int Search(int[] arr, int key){
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {20,6,12,123,50,42,85,95,67,21};
		int number = 1235;
		int index = Search(array,number);
		if (index>=0) {
			System.out.println(number+" FOUND ON "+index+" INDEX.");
		}else{
			System.out.println(number+" NOT FOUND.");
		}
		
	}
}