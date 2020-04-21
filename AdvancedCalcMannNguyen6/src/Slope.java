import java.util.Scanner;

public class Slope {

	private static Scanner input;
	
	public double slp(double X1, double X2, double Y1, double Y2) {
		
		input = new Scanner(System.in);
		
		// gets coordinate points
		System.out.println("Enter the coordinates of the first point (put a space between them): ");
		X1 = input.nextDouble();
		Y1 = input.nextDouble();
		System.out.println("Enter the coordinates of the second point: ");
		X2 = input.nextDouble();
		Y2 = input.nextDouble();
		
		// finds the slope of them (m)
		double slp = (Y2 - Y1) / (X2 - X1);
		return slp;
	}
}
