package Day16;

import java.util.Scanner;

public class CharReplace {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String base = sc.nextLine();
		System.out.println("base string is : " + base);
		
		System.out.println("Enter a character which you want to replace : ");
		char old1 =  sc.next().charAt(0);
		System.out.println("Enter a new character as replacement : ");
		char new1 = sc.next().charAt(0);
		
		String new_string = base.replace(old1, new1);
		System.out.println("final String  is : "+ new_string);
	}
}
