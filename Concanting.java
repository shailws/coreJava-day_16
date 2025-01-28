package Day16;

import java.util.Scanner;

public class Concanting {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string : ");
		String val1 = sc.nextLine();
		System.out.println("Enter a second string : ");
		String val2 = sc.nextLine();
		String con = val1 + val2;
		System.out.println("Concatination is : " + con);
	}
}
