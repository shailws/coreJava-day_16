package Day16;

import java.util.Scanner;

public class Checked {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		System.out.println("Enter third number :");
		int num3 = sc.nextInt();
		System.out.println("Enter four number :");
		int num4 = sc.nextInt();
		
		if (num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println("all numbers are equal");
		}
		else {
			System.out.println("all numbers are not equal");
		}
	}
}
