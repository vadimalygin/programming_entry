class Mod {
	private int alpha;   
        public int beta;
        int gamma;

        void setAlpha(int a){
                alpha = a;
 	}
        int getAlpha(){
                        return alpha;
	}

}

class Block{
	int a, b, c, V;

	Block(int i, int j, int k){
		a = i; b = j; c = k;
		V = a*b*c;
	}

	boolean sameBlock(Block ob){
		if ((a == ob.a)&(b == ob.b)&(c == ob.c))
			return true;
		return false;
	}

	boolean sameV(Block ob){
                if (V == ob.V)
                        return true;
                return false;
        }

}

class FailSoftArray {
	private int a[], errval;
	public int length;

	public FailSoftArray(int size, int errv){
		a = new int[size];
		errval = errv;
		length = size;
	}

	public int get(int index){
		if (indexOk(index)){return a[index];}
		return errval;
	}

	private boolean indexOk(int index){
		if(index>=0 & index < length){return true;}
		return false;
	}

	public boolean put(int val, int index){
		if(indexOk(index)){
			a[index] = val;
			return true;
		}
		return false;
	}
}

class CallByValue {
	void noChange(int i, int j){
		i += j;
		j = -j;      	
	}
}

class CallByRef {
	int a, b;

	CallByRef (int i, int j){
		a = i; b = j;
	}
	void isChanged (CallByRef ob){
		a += ob.a;
		b = -ob.b;
	}
}

class ErrorMsg {
	String msg[] = {
		"Output error",
		"Input error",
		"Disk overflow",
		"Index out of range"
	};

	String getErrorMsg (int err_num){
		if(err_num >= 0 & err_num < msg.length) 
			return msg[err_num];
		return "Error code missing";
	}
}

class Err {
	String msg;	//Error message
	int severity;	//Level of error's badness
	
	Err (String m, int s){
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	String msg[] = {
                "Output error",
                "Input error",
                "Disk overflow",
                "Index out of range"
        };

	int howBad[] = {3, 3, 2, 4};

	Err getErrorInfo (int err_code) {
		if (err_code >= 0 & err_code < msg.length)
			return new Err(msg[err_code], howBad[err_code]);
		return new Err("Error code missing", 0);
	}
}

public class pr007 {
	public static void main(String args[]){
		Mod ob = new Mod();
		ob.setAlpha(77);
		System.out.println("" + ob.getAlpha());
		//ob.alpha = 100; //would not compile due to privated access of alpha
		
		ob.beta = 242;
		ob.gamma = 34;

		System.out.println("\nExample of fail-proofed array");

		FailSoftArray fs = new FailSoftArray(5, -999);
		int x;

		System.out.println("Errors hidden from a user");
		for(int i = 0; i < (fs.length * 2); i++){
                        fs.put(i*10, i);
                }
		
		for(int i = 0; i < (fs.length * 2); i++){
			x = fs.get(i);
			if(x != -999) System.out.print(x + " ");
		}

		System.out.println("\nExample with errors shown to user");
		for(int i = 0; i < (fs.length * 2); i++){
                        if(fs.put(i*10, i)){System.out.println("Index (" + i + ") out of range");}
                }
		System.out.println("printing...");
                for(int i = 0; i < (fs.length * 2); i++){
                        x = fs.get(i);
                        if(x != -999) System.out.print(x + " ");
			else System.out.println("Index (" + i + ") out of range");
                }

		System.out.println("\n\nExample of messing around with public length");
		fs.length = 1;
		for(int i = 0; i < (fs.length * 2); i++){
                        x = fs.get(i);
                        if(x != -999) System.out.print(x + " ");
                        else System.out.println("Index (" + i + ") out of range");
                }
		
		System.out.println("\n\nExample of using method's which accept objects of this class as input");
		Block ob1 = new Block(10,2,5);
		Block ob2 = new Block(10,2,5);
		Block ob3 = new Block(4,5,5);

		System.out.println("ob1 == ob2 by sides:  " + ob1.sameBlock(ob2));
		System.out.println("ob1 == ob3 by sides:  " + ob1.sameBlock(ob3));
		System.out.println("ob1 == ob3 by volume: " + ob1.sameV(ob3));
				
		System.out.println("\n\nExample of using method's which accept paramaters by value");
		
		CallByValue ob4 = new CallByValue();
		int a = 15, b = 20;
		
		System.out.print("Call by value: a, b = (" + a + ", " + b + ") => (");
		ob4.noChange(a, b);
		System.out.println(a + ", " + b + ")");

		System.out.println("\n\nExample of using method's which accept paramaters by referal");

		CallByRef ob5 = new CallByRef(15, 20);
		System.out.print("Call by ref  : a, b = (" + ob5.a + ", " + ob5.b + ") => (");
                ob5.isChanged(ob5);
                System.out.println(ob5.a + ", " + ob5.b + ")");

		System.out.println("\n\nExample of using a method that return a String value");
		
		ErrorMsg err = new ErrorMsg();
		System.out.println("Error message under code '2':  " + err.getErrorMsg(2));
		System.out.println("Error message under code '20': " + err.getErrorMsg(20));

		System.out.println("\n\nExample of using a method that returns an object of a class identified in the programm");
		
		ErrorInfo err2 = new ErrorInfo();
		Err e1 = err2.getErrorInfo(2), e2 = err2.getErrorInfo(20);

		System.out.println("Error message|severity  under code '2':  " + e1.msg + " | " + e1.severity);
                System.out.println("Error message|severity  under code '20': " + e2.msg + " | " + e2.severity);

	}
}
