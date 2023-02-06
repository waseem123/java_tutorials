import java.util.Scanner;

class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER VALUE OF N - ");
		int n = sc.nextInt();
		int[][] matrixA = new int[n][n];
		int[][] matrixB = new int[n][n];
		int[][] matrixR = new int[n][n];
		
		/*Read input for first matrix*/
		System.out.println("ENTER VALUES FOR MATRIX A");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.println("ENTER VALUE FOR [I"+i+",J"+j+"]");
				matrixA[i][j] = sc.nextInt();
			}
		}

		/*Read input for second matrix*/
		System.out.println("ENTER VALUES FOR MATRIX B");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.println("ENTER VALUE FOR [I"+i+",J"+j+"]");
				matrixB[i][j] = sc.nextInt();
			}
		}

		/*Perform addition of matrixA and matrixB
			and store the result in matrixR.
		*/
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				matrixR[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		System.out.println("______________");

		/*Display first matrix*/
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matrixA[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("++++++++++++++++++++");
		
		/*Display second matrix*/
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matrixB[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("===================");

		/*Display result matrix*/
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(matrixR[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

// 0=> [10  20]
// 1=> [30  40]