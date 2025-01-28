package Day16;

import java.util.Scanner;

public class Check {
	public static void  main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if(number %5==0) {
			System.out.println("the number is divisible by 5");
		}else if(number %11==0) {
			System.out.println("the number is divisible by 11");
		}
		else {
			System.out.println("the number is divisible by 5 and 11");
		}
		
	}
}
