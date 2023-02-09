import java.util.Scanner;

class MinimumElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE VALUE OF N - ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("ENTER THE ARRAY ELEMENTS - ");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		/*Actual Logic to Find Minimum Element*/
		int x  = arr[0];
		for (int i=1; i<arr.length; i++) {
			if(x>arr[i]){
				x = arr[i];
			}
		}
		
		System.out.println(x+" IS THE MINIMIMUM VALUE FROM ARRAY.");

	}
}



// -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 3 4 5 6 7 8 9