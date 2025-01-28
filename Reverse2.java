package Day16;

import java.util.Scanner;

public class Reverse2 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string : ");
	String string = sc.nextLine();
	System.out.println("Sting in normal format : " + string);
	String reverse = "";
	for(int i=string.length()-1; i>=0; i--) {
		reverse = reverse + string.charAt(i);
	}
	System.out.println(reverse);
	}
}
