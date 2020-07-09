package factorial;

import java.util.Scanner;

public class factorial {
	public static int fact(int n) {
		int result;
		if(n==1) {
			return 1;
			
		}
		else {
			result=fact(n-1)*n;
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int num=scan.nextInt();
		int factorial=fact(num);
		System.out.println(factorial);
		

	}

}
