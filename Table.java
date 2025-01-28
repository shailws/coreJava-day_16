package Day16;

import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		double num = sc.nextDouble();
		int i=1;
		do {
			System.out.println(i*num);
			i++;
		}while(i<=10);
	}
}
