
public class Main {

	public static void main(String[] args) {
		
		String currency = "$";
		double price = 20000.90;
		boolean isForsale = false;
		String car = "Porsche";
		
		System.out.println( currency + price);
		System.out.println("The " + car + " is for sale");
		System.out.println("The price of the " + car + " is " + currency + price);
		
		if (isForsale) {
			System.out.println("The " + car + " is for sale");
		}
		else {
			System.out.println("The " + car + " is not for sale no more  ");
		}
		
	}

}
