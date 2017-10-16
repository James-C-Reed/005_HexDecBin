
public class RunHere {
	
	public static void main(String[] args) {
		
		//Added hex to bin functionality (just for practice)
		BinPower binpower = new BinPower();
		binpower.setBianary();
		
		HexDecBin baseConverter = new HexDecBin();
		
		baseConverter.setHexNumber();
		baseConverter.convert();
		
	}

}
