package Day16;

public class Areas {
	double areas(double lenght, double breadth) {
		double area = lenght+breadth;
		return area;
	}
	double areas(double side) {
		double area = side*side;
		return area;
	}
	
	public static void main(String args[]) {
		Areas a = new Areas();
		double rec = a.areas(33.4,55.6);
	    double squ = a.areas(55.6);
	    System.out.println("Area of rectangle = "+ rec);
	    System.out.println("Area of square = "+ squ);
	}
}
