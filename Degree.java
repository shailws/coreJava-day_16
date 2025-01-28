package Day16;

class Degrees{
	void getDegree() {
		System.out.println("I got a degree");
	}
}
class Undergraduate{
	void getDegree() {
		System.out.println("I am undergraduate");
	}
}
class Postgraduate{
	void getDegree() {
		System.out.println("I am postgraduate");
	}
}

public class Degree {
	public static void main(String args[]) {
		Undergraduate ua = new Undergraduate();
		Postgraduate pa = new Postgraduate();
		ua.getDegree();
		pa.getDegree();
	}
}
