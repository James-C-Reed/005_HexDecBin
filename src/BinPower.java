import java.util.Scanner;

public class BinPower {
	//Fixed Scanner bug for float inputs
	
	Scanner input = new Scanner(System.in);
	
	public BinPower() {	
		
	}
	
	public void setBianary() {
		
		//pow requires double to work
		double exp;
		double base;
		double answer;
		int ans = 0;
		
		System.out.println("Hello most amasing Java student! What is your name?");
		String name = input.nextLine();
		System.out.println("Thanks for using my most awsome program " + name + "!");
		
		System.out.println(name + " what base do you want?");
		base = input.nextDouble();
		System.out.println(name + " you have entered: " + base);
		
		System.out.println(name + " what bianary exponent do you want?");
		exp = input.nextDouble();
		System.out.println(name + " you have entered: " + exp);
		
		// (int) type casting
		answer = Math.pow(base,exp);
		System.out.println("Answer is: " + answer);
		
	}
	
}
