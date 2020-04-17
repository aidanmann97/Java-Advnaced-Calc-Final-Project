import java.util.Scanner;

public class Distance {
	
	private static Scanner input;
	
	public double distance(double x1, double y1, double x2, double y2) {
		
		input = new Scanner(System.in);
		
		System.out.println("Enter the coordinates of the first point (put a space between them): ");	// gets frist coordinates from user
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.println("Enter the coordinates of the second point: ");								// gets second coordinates from user
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		double dist = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));								// calculates the distance between the two points
		return dist;	
	}

}
