package Day16;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String string = sc.nextLine();
		System.out.println("String in normal format : "+ string);
		String revers1="";
		for(int i = string.length()-1; i>=0; i--) {
			revers1 = revers1 + string.charAt(i);
		}
		System.out.println("String in reverse format : " + revers1);
	}
}

