class ArrayCopy{
	public static void main(String[] args) {
		int[] data1 = {100,200,300,400,500};
		for (int i : data1) {
			System.out.println(i);
		}
		System.out.println("__________");

		int[] data2 = data1;
		for (int i : data2) {
			System.out.println(i);
		}

		data2[1] = 5000;
		System.out.println(data2[1]);
		System.out.println(data1[1]);

		data1[1] = 80;
		System.out.println(data2[1]);
		System.out.println(data1[1]);
	}
}