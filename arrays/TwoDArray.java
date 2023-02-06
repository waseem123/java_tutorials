import java.util.Scanner;

class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER VALUE OF N");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.println("ENTER VALUE FOR [I"+i+",J"+j+"]");
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("______________");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

// 0=> [10  20]
// 1=> [30  40]