//byte operations:   & | ^ >> >>> << ~
//
class pr006{
	public static void main(String[] args){
		char ch;
		int i;
		
		System.out.println("\nReseting sixth bit in an ASCII code of a symbol(with 'and' '&')");
		for(i = 0; i < 26; i++){
			ch = (char)('a' + i);
			System.out.print(ch);
			
			ch = (char)((int) ch & 65503);
			System.out.print(ch + " ");
		}
		System.out.println();
		
		System.out.println("\nBit representation of a 'byte' type");
		byte val = 100;

		for(i = 128; i > 0; i /= 2){
			if((val&i) != 0){
				System.out.print("1");
			}else {System.out.print("0");}
		}
		System.out.println();

		System.out.println("\nSetting sixth bit in an ASCII code of a symbol(with 'or' '|')");
		for(i = 0; i < 26; i++){
                        ch = (char)('A' + i);
                        System.out.print(ch);

                        ch = (char)((int) ch | 32);
                        System.out.print(ch + " ");
                }
                System.out.println();

		System.out.println("\nPrimitive encryption(with 'xor' '^')");
		String msg = "starting testing string";
		String encr_msg = "";
		String decr_msg = "";
		int key = 88;

		System.out.println("Unencrypted message: " + msg);
		System.out.println("Encrypting...");

		for(i = 0; i < msg.length(); i++){
			encr_msg += (char)(msg.charAt(i)^key); 
		}
		System.out.println("Encrypted message: " + encr_msg);
		
		for(i = 0; i < encr_msg.length(); i++){
                        decr_msg += (char)(encr_msg.charAt(i)^key);
                }
                System.out.println("Decrypted message: " + decr_msg);

		System.out.println("\nBitwise negation (with 'not' '~')");
		val = -34;
		for (i = 128; i > 0; i/=2){
			if((val & i) != 0) {System.out.print('1');}
			else {System.out.print('0');}
		}
		System.out.println();
		val = (byte) ~val;
                for (i = 128; i > 0; i/=2){
                        if((val & i) != 0) {System.out.print('1');}
                        else {System.out.print('0');}
                }
                System.out.println();

		System.out.println("\n\nBit shifting");
		System.out.println("\nBit shifting");

		int v = 1;
		for (int j = 0; j < 8; j++){
			for (i = 128; i > 0; i/=2){
                        	if((v & i) != 0) {System.out.print('1');}
                        	else {System.out.print('0');}
                	}
                	System.out.println(" " + v);
			v = v << 1;
		}

		v = 128;
		for (int j = 0; j < 8; j++){
                        for (i = 128; i > 0; i/=2){
                                if((v & i) != 0) {System.out.print('1');}
                                else {System.out.print('0');}
                        }
                        System.out.println(" " + v);
                        v = v >> 1;
                }

		System.out.println("\n\n? operand");
		// bool ? [commands1] : [commands2]
		int a = -25, b = a < 0 ? -a : a; //abs
		
		int result; 
		for (i = -5; i < 6; i++){
			result = i != 0 ? 100/i : 0; //eliminating zero-division error
			if (i != 0) 	{System.out.println("100 / " + i + " equals " + result);}
		}
	}
}
