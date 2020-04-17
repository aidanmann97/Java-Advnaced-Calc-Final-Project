
public class Factorial {
	
	// finds factorial of n (entered number)
	public double factorial(double n) {
			
		// base case
		if(n == 1) {
			System.out.println(n + "! = 1");
			return 1;
		}
		// factorial recursion
		else {
			System.out.println(n + "! = "  + n + " * " + (n-1) + "!");
			return n * factorial(n-1);
		}
	}
}
