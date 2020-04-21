// ------------------------------------------------------------
//  Programmer Name: Aidan Mann
//  Partner Name: Brendan Nguyen
//  Date: 04/15/2020
//  Version: 1.0
//  File Name: Main.java
//  Code Description: Calculator feauturing advanced functions 
// ------------------------------------------------------------

import java.util.*;

public class Main {
	
	// main variables
	private static Scanner input;
	private static String select;
	
	// distance variables
	private static double x1;
	private static double x2;
	private static double y1;
	private static double y2;
	
	// factorial variables
	private static double n;
	
	// slope variables
	private static double X1;
	private static double X2;
	private static double Y1;
	private static double Y2;

	public static void main(String[] args) {
		// initializes Scanner 'input'
		input = new Scanner(System.in);
		
		selectFunc(); 
		
		// selects and runs distance feature
		if(select.equals("DIST")) {
			Distance d = new Distance();
			System.out.println(d.distance(x1, y1, x2, y2));
		} 
		// selects and runs factorial feature
		else if(select.equals("FACT")) {
			Factorial f = new Factorial();
			System.out.println("Enter the number you want factorialed: ");
			n = input.nextInt();
			System.out.println(f.factorial(n));
		}
		// selects and runs slop feautre
		else if(select.equals("SLP")) {
			Slope s = new Slope();
			System.out.println("m = " + s.slp(X1, X2, Y1, Y2));
		}
		
	}
	
	// runs function allowing user to select math feature
	public static void selectFunc() {
		System.out.println("Welcome to our Advanced Math Function Calculator!");
		System.out.println("Enter \"DIST\" for distance between 2 points");
		System.out.println("Enter \"ZER2\" to find the zeros of a quadratic");
		System.out.println("Enter \"ZER3\" to find the zeros of a cubic");
		System.out.println("Enter \"FACT\" for factorial");
		System.out.println("Enter \"SUM");
		System.out.println("Enter \"SLP\" to find the slope");
		System.out.println("Enter \"LOG\" to solve a logarithm");
		System.out.println("What feature would you like to use: ");
		select = input.nextLine();
	}
	
	


}
