import java.util.Scanner;
public class Useinput {

	
	public static void main(String[] args) {
		
		double height = 0.0;
		double width = 0.0;
		double area = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter the Height: ");
		 height = scanner.nextDouble();
		 
		 System.out.print("Enter the width: ");
		 width = scanner.nextDouble();
		 System.out.println("The area of this shape is " + area + "cm^2");
		 
		 area = height * width;
		 

		scanner.close();
		
		
	}

}
