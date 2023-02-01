import java.util.Scanner;

class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER - ");
		int number = sc.nextInt();
		int sum = 0;
		int temp = number;

		int num = 0;

		int order=0;
		while (temp != 0) {
			order++;
            temp /= 10;
        }

        System.out.println("NUMBER OF DIGITS "+order);
        temp = number;
		while(temp!=0){
			
			num = temp%10;
			temp/=10;
			
			int p = 1;
			for (int i=0; i<order; i++) {
				p=p*num;
			}
			System.out.print(p+",");
			sum+=p;
		}

		System.out.println();
		System.out.println("TOTAL SUM "+sum);
		if (sum==number) {
			System.out.println(number+" IS AN ARMSTRONG NUMBER");
		}else{
			System.out.println(number+" IS NOT AN ARMSTRONG NUMBER");
		}

	}
}
/*
153
1 + 125 + 27 = 153*/

// 153%10
// 153/10