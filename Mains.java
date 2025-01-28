package Day16;

import java.util.Scanner;

class One{
	public void info() {
		System.out.println("this is information function");
	}
	public void info(int a, int b) {
		int sum = a+b;
		System.out.println("sum is = "+ sum);
	}
	public void info(int a, int b, int c) {
		int mult= a*b*c;
		System.out.println("multiplication is = "+ mult);
	}
	
}
public class Mains {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter third number : ");
		int num3 = sc.nextInt();
		
		One o = new One();
		o.info();
		o.info(num1,num2);
		o.info(num1,num2,num3);
	}
}
