class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		matrix[0][0] = 10;
		matrix[0][1] = 20;
		matrix[1][0] = 30;
		matrix[1][1] = 40;

		System.out.print(matrix[0][0]+"\t");
		System.out.println(matrix[0][1]);
		System.out.print(matrix[1][0]+"\t");
		System.out.println(matrix[1][1]);
	}
}

// [10  20]
// [30  40]