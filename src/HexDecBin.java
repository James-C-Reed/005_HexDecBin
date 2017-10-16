import java.util.Scanner;

public class HexDecBin {
	
	/*
	 * Scanner for float is now working
	 */
	
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String number = "";
	String lang = "";
	String to = "";
	int num;
	
	public HexDecBin() {
		
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Welcome to my Hexadecimal, Decimal or "
				+ "Binary conversion program " + name + "!");
		System.out.println("What is your starting language? Hex, Dec, or Bin?");
		lang = kbd.nextLine();
		
		System.out.println("\nEnter your number: ");
		number = kbd.nextLine();
		
		if (lang.equalsIgnoreCase("Hex")) {
			
			System.out.println("You have entered Hexidecimal: " + number );
			
		}else if (lang.equalsIgnoreCase("Dec")) {
			
			System.out.println("You have entered Decimal: " + number );
			
		}else if (lang.equalsIgnoreCase("Bin")) {
			
			System.out.println("You have entered Binary: " + number );
			
		}else {
			
			System.out.println("You have entered a forein entity cannot continue, Sorry!");
			
		}

		System.out.println("What language are you wanting to convert to? Hex, Dec, or Bin?");
		to = kbd.nextLine();
		
	}

		public void setHexNumber() {
			
			num = Integer.parseInt(lang, 16);
			System.out.println("Decimal value is: " + num + "(Remember 0-" + num 
					+ " has " + (num + 1) + " values)");
			
		}
		void convert() {
				
			String Binary = Integer.toBinaryString(num);
				
			System.out.println("Binary value is: " + Binary);
			System.out.println("Number of bits is: " + Binary.length());
			System.out.println("The number of whole nibbles (4 bits) is " + (Binary.length()/4));
			System.out.println("Number of whole bytes (8 bits) is " + Binary.length() / 8
					+ " with " + Binary.length() % 8 + " bits remaining");
			
		}
	
}
