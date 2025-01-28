package Day16;

import java.util.Scanner;

public class Pizza {
    private String size;
	private int cheese_toppings;
	private int pepperoni_toppings;
	private int ham_toppings;
	
	void setSize(String size) {
		this.size=size;
	}
	 String getSize() {
		return size;
	}
	
	 void setCheese_toppings(int cToppings) {
		this.cheese_toppings = cToppings;
	}
	 int getCheess_toppings() {
		return cheese_toppings;
	}
	
	void setPepperoni_toppings(int pToppings) {
		this.pepperoni_toppings = pToppings;
	}
	int  getPepperoni_toppings() {
		return pepperoni_toppings;
	}
	
	void setHam_toppings(int hToppings) {
		this.ham_toppings = hToppings;
	}
	int getHam_toppings() {
		return ham_toppings;
	}
	
	int evaluation () throws Exception {
		int baseCost=0;
		switch(size.toLowerCase()) {
		case "small": baseCost=299;
		break;
		case "medium": baseCost=499;
		break;
		case "large": baseCost=699;
		break;
		default: throw new Exception("invalid size");
		}
		
		int toppingsPrice = (cheese_toppings+ pepperoni_toppings+ ham_toppings)*10;
		return baseCost + toppingsPrice;
	}
	
	public static void main (String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of pizza between small, medium and large:");
		String size = sc.nextLine();
		System.out.println("Enter no of cheese_toppings:");
		int cT = sc.nextInt();
		System.out.println("Enter no of pepperoni_toppings:");
		int pT = sc.nextInt();
		System.out.println("Enter no of ham_toppings:");
		int hT = sc.nextInt();
		
		Pizza pz = new Pizza();
		pz.setSize(size);
		pz.setCheese_toppings(cT);
		pz.setPepperoni_toppings(pT);
		pz.setHam_toppings(hT);

		System.out.println("Total evaluation...");
		System.out.println("Size of pizza : " + pz.getSize());
		System.out.println("Total price of pizza : "+ pz.evaluation());
		
	}
	
}
