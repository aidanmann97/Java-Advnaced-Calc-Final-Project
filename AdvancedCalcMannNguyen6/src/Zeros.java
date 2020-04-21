import java.util.Scanner;

public class Zeros {

	public void zer() {
		
		// gets coefficient values from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the coefficients for your quadratic equation:\na= ");
		double a = input.nextDouble(); 
		System.out.print("b= ");
		double b = input.nextDouble(); 
		System.out.print("c= ");
		double c = input.nextDouble(); 
		System.out.println("\n"+a+"x^2 + "+b+"x + "+c+" = 0\n");
		
		// closes Scanner
		input.close(); 
		
		// coefficients == 0
		if(a ==0 && b==0 && c==0) 					
			{System.out.println("x = All Real Numbers");}
		else if
		// a && b == 0
		(a == 0 && b == 0) 					
			{System.out.println("x = No Solution");}
		else if
		// a == 0
		(a == 0) 							
			{System.out.println("x = "+(-c/b));}
		else if
		// solution = 0
		(c == 0) 							
			{System.out.println("x = 0.0");}
		else if
		// discriminant < 0
		((b*b-(4*a*c)) < 0) 					
		{
			// 2 imaginary solutions b == 0
			if(b == 0) 								
			{System.out.println("No Real Solutions, but Two Imaginary Solutions\nx = +/- " + (Math.sqrt(4*a*c)/(2*a)) + "i");}
			else
			// 2 imaginary solutions b !== 0
			{System.out.println("No Real Solutions, but Two Imaginary Solutions\nx = "
					+ -b/(2*a) + " +/- " + Math.sqrt(-1*(b*b - (4*a*c)))/(2*a)+ "i");}	
		}
		else if
		// 1 real number solution
		((b*b-(4*a*c)) == 0) 				
			{System.out.println("x = "+(-b/(2*a)));}
		else 
		// all non-special cases
			{System.out.println("x = "+(-b + Math.sqrt(b*b - (4*a*c)))/(2*a)
			+" and\nx = "+(-b - Math.sqrt(b*b - (4*a*c)))/(2*a));}
		}
	}
