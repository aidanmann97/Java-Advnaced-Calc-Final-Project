
public class Factorial {
	
	public int factorial(int n) {
			
		if(n == 1) {
			System.out.println(n + "! = 1");
			return 1;
		} else {
			System.out.println(n + "! = "  + n + " * " + (n-1) + "!");
			return n * factorial(n-1);
		}
	}
}
