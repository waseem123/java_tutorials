import java.util.Scanner;

class Searching{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = {200,500,400,300,100};

		System.out.print("ENTER THE VALUE YOU WANT TO SEARCH IN THE ARRAY - ");
		int key = sc.nextInt();

		boolean flag = false;
		int i=0;
		for (i=0; i<data.length; i++) {
			if(key==data[i]){
				flag = true;
				break;
			}
		}

		if(flag==true){
			System.out.println("VALUE FOUND AT INDEX - "+i);
		}else{
			System.out.println("VALUE NOT FOUND");
		}
	}
}