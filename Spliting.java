package Day16;

public class Spliting {
	public static void main(String args[]) {
		String combination = "HELLO$WORLD";
		String tokens[] = combination.split("\\$");
		
		System.out.println("first token : "+ tokens[0]);
		System.out.println("second token : "+ tokens[1]);
	}
}
