class DeepCopy{
	public static void main(String[] args) {
		int[] data1 = {100,200,300,400,500};
		for (int i : data1) {
			System.out.println(i);
		}
		System.out.println("__________");

		int[] data2 = new int[5];

		for(int i=0;i<5;i++){
			data2[i] = data1[i];
		}

		for(int i=0;i<5;i++){
			System.out.println(data2[i]);
		}

		System.out.println("__________");
		data1[0] = 3500;
		System.out.println(data1[0]);
		System.out.println(data2[0]);

		System.out.println("__________");
		data2[0] = 44;
		System.out.println(data1[0]);
		System.out.println(data2[0]);
	}
}