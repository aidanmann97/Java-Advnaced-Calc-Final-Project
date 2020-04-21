import java.util.Scanner;

public class Log {

	private static Scanner input;
	private static String confirm;
	private static double log;
	
	public double logX(double x, double base) {
		
		input = new Scanner(System.in);
		
		// determines if user is using change of base or base 10
		System.out.println("Are you using log base 10?\nYES / NO");
		confirm = input.nextLine();
		
		// finds log base 10
		if(confirm.equals("YES")) {
			System.out.println("Enter the number you want to find the log of: ");
			x = input.nextDouble();
			log = Math.log10(x);
		} else
		// finds change of base log
		{
			System.out.println("Enter the number you want to find the log of: ");
			x = input.nextDouble();
			System.out.println("Enter the base number: ");
			base = input.nextDouble();
			log = ((Math.log(x)) / (Math.log(base)));
		}
		
		return log;
	}
}
