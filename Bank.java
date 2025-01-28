package Day16;
class SBI{
	void getRateOfInterest() {
		System.out.println("Rate of interest sbi = 5.1%");
	}
}
class ICICI{
	void getRateOfInterest() {
		System.out.println("Rate of interest icici = 5.2%");
	}
}
class HDFC{
	void getRateOfInterest() {
		System.out.println("Rate of interest hdfc = 5.3%");
	}
}
class AXIS{
	void getRateOfInterest() {
		System.out.println("Rate of interest axis = 5.4%");
	}
}
public class Bank {
	public static void main(String args[]) {
		SBI one = new SBI();
		ICICI two = new ICICI();
		HDFC three = new HDFC();
		AXIS four = new AXIS();
		
		one.getRateOfInterest();
		two.getRateOfInterest();
		three.getRateOfInterest();
		four.getRateOfInterest();
	}
}
