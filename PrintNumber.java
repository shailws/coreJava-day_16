package Day16;

public class PrintNumber {
	void printn(int num) {
		System.out.println("intigeral = "+ num);
	}
	void printn(float num) {
		System.out.println("floating = "+ num);
	}
	void printn(double num) {
		System.out.println("double = "+ num);
	}
	void printn(char num) {
		System.out.println("character = "+ num);
	}
	void printn(String num) {
		System.out.println("String = "+ num);
	}
	
	public static void main(String args[]) {
		PrintNumber n = new PrintNumber();
		n.printn(10);
		n.printn(10.2);
		n.printn(100000.444);
		n.printn('S');
		n.printn("Shailesh");
	}
}
