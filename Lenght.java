package Day16;

import java.util.Scanner;

public class Lenght {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String val = sc.nextLine();
		int lenght = val.length();
		System.out.println("Lenght of string is : " + lenght);
	}
}
