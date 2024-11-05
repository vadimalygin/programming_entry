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

class Overload {
	void method() {
		System.out.println("No parameters");
	}

	void method(int a) {
		System.out.println("One integer parameter: " + a);
	}

	int method(int a, int b){
		System.out.println("Two integer parameters: (" + a + ", " + b + ")");
		return a + b;
	}

	double method(double a, double b){
		System.out.println("Two floating point parameters: (" + a + ", " + b + ")");
		return a - b;
	}
}

class Overload_2_Empire_Strikes_Back {
	void f(int x){
		System.out.println("f(int): " + x);
	}

	void f(double x){
                System.out.println("f(double): " + x);
        }

	void f(byte x){
                System.out.println("f(byte): " + x);
        }
}

class Overload_3_Return_of_the_Jedi {
	int x;

	Overload_3_Return_of_the_Jedi(){
		System.out.println("No parameters");
		x = 0;
	}

	Overload_3_Return_of_the_Jedi(int a){
                 System.out.println("One integer parameter");
                 x = a;
        }

	Overload_3_Return_of_the_Jedi(double d){
                 System.out.println("One double parameter");
                 x = (int)(d);
	}

	Overload_3_Return_of_the_Jedi(int a, int b){
		System.out.println("Two integer parameters");
                x = a*b;
        }
}

class Summation {
	int sum;

	Summation (int num) {
		sum = 0;
		for(int i = 1; i<= num; i++)
			sum += i;
	}

	Summation (Summation ob) {
		sum = ob.sum;
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

		System.out.println("\n\nExample of using method overload");

		Overload ob6 = new Overload();

		ob6.method();
		ob6.method(2);
		int resI = ob6.method(4, 6); System.out.println("Integer result: " + resI);
		double resD = ob6.method(5.1, 3.5); System.out.println("Double result:  " + resD);

		System.out.println("\n\nExample of type conversion affecting method overload");
		
		Overload_2_Empire_Strikes_Back ob7 = new Overload_2_Empire_Strikes_Back();
		int valI = 10;
		double valD = 11.0;
		byte valB = 12;
		short valS = 13;
		float valF = 14.0F;

		System.out.println("\nTrying int: ");
		ob7.f(valI);
		System.out.println("\nTrying double: ");
		ob7.f(valD);
		System.out.println("\nTrying byte: ");
		ob7.f(valB);
		System.out.println("\nTrying short: ");
		ob7.f(valS);
		System.out.println("\nTrying float: ");
		ob7.f(valF);
		
		System.out.println("\n\nExample of using object creating method overload");

		Overload_3_Return_of_the_Jedi t1 = new Overload_3_Return_of_the_Jedi();
		Overload_3_Return_of_the_Jedi t2 = new Overload_3_Return_of_the_Jedi(11);
		Overload_3_Return_of_the_Jedi t3 = new Overload_3_Return_of_the_Jedi(12.0);
		Overload_3_Return_of_the_Jedi t4 = new Overload_3_Return_of_the_Jedi(13, 14);

		System.out.println("t1.x = " + t1.x);
		System.out.println("t2.x = " + t2.x);
		System.out.println("t3.x = " + t3.x);
		System.out.println("t4.x = " + t4.x);

		System.out.println("\n\nExample of creating class object with another object of same class");
		
		Summation s1 = new Summation(5);
		Summation s2 = new Summation(s1);
		
		System.out.println("s1.sum = " + s1.sum);
		System.out.println("s2.sum = " + s2.sum);
	
	}
}
