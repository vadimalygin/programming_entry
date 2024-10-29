class ShowB {
	private int numbits;

	ShowB (int n){numbits = n;}
	
	void show(long val){
		long mask = 1;
		//Leftshift value 1
		mask <<=numbits-1;

		int spacer = 0;
		for(;mask != 0; mask >>>= 1){
			if ((val & mask) != 0) 	{System.out.print("1");}
			else 			{System.out.print("0");}
			spacer++;
			if ((spacer%8) == 0)	{System.out.print(" "); spacer = 0;}
		}	
	}	
}

class ShowBits {
	public static void main(String[] args){
		ShowB b = new ShowB(8);
		ShowB i = new ShowB(32);
		ShowB li = new ShowB(64);

		System.out.println("\nBinary representation of number 123: ");
		b.show(123);
		System.out.println("\nBinary representation of number 10203: ");
                i.show(10203);
		System.out.println("\nFirst 8 bits in a binary representation of number 10203: ");
                b.show(10203);
		System.out.println("\nBinary representation of number 5389612349: ");
                li.show(5389612349L);

		System.out.println("\n\nByte representation of IP adress 172.16.7.85: ");
		b.show(172);
		b.show(16);
		b.show(7);
		b.show(85);
	}
}
