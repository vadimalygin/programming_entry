class Factorial {
	int factR(int n){
		int result;

		if(n==1) return 1;
		result = factR(n-1) * n;
		return result;
	}

	int factI(int n){
		int t, result = 1;

		for(t = 1; t <= n; t++){
			result *= t;
		}
		return result;
	}
}

class StaticVar {
	int x;
	static int y;

	int sum(){
		return x+y;
	}
}

class StaticBlock{
	static double root2;
	static double root3;
	static {
		System.out.println("Inside of static block");
		root2 = Math.sqrt(2.0);
		root3 = Math.sqrt(3.0);
	}

	StaticBlock (String msg){
		System.out.println(msg);
	}
}

class Outer {
	int[] nums;
	Outer(int[] n){
		nums = n;
	}

	void analyze() {
		Inner inOb = new Inner();
		System.out.println("Minimum: " + inOb.min());
		System.out.println("Maximum: " + inOb.max());
		System.out.println("Mean:    " + inOb.mean());
	}

	class Inner {
		int min() {
			int m = nums[0];
			for (int i = 1; i< nums.length; i++){
				if(nums[i] < m) m = nums[i];
			}
			return m;
		}

		int max() {
                        int m = nums[0];
                        for (int i = 1; i< nums.length; i++){
                                if(nums[i] > m) m = nums[i];
                        }
                        return m;
                }

		int mean() {
			int summ = 0;
			for (int i = 0; i< nums.length; i++){
				summ += nums[i]; 
			}
			return summ / nums.length;
		}
	}
}

class VarArgs{
	static void vaTest (int ... v) {
		System.out.println("Number of arguments: " + v.length);
		System.out.println("Containtments of an array: ");

		for (int i = 0; i < v.length; i++){
			System.out.println("Argument #"+ i + ": "+ v[i]);
		}
	}

	static void vaTest2 (String msg, int ... v) {
		System.out.println("Received message: " + msg);
                System.out.println("Number of arguments: " + v.length);
                System.out.println("Containtments of an array: ");

                for (int i = 0; i < v.length; i++){
                        System.out.println("Argument #"+ i + ": "+ v[i]);
                }
        }

	static void vaTest3 (int ... v) {
                System.out.println("\nvaTest3 method type: int");
		System.out.println("Number of arguments: " + v.length);
                System.out.println("Containtments of an array: ");

                for (int i = 0; i < v.length; i++){
                        System.out.println("Argument #"+ i + ": "+ v[i]);
                }
        }

	static void vaTest3 (boolean ... v) {
		System.out.println("\nvaTest3 method type: boolean");
                System.out.println("Number of arguments: " + v.length);
                System.out.println("Containtments of an array: ");

                for (int i = 0; i < v.length; i++){
                        System.out.println("Argument #"+ i + ": "+ v[i]);
                }
        }

	static void vaTest3 (String ... v) {
                System.out.println("\nvaTest3 method type: String");
                System.out.println("Number of arguments: " + v.length);
                System.out.println("Containtments of an array: ");

                for (int i = 0; i < v.length; i++){
                        System.out.println("Argument #"+ i + ": "+ v[i]);
                }
        }
}

class pr008{
	public static void main(String args[]){
		Factorial f = new Factorial();

		System.out.println("\nEvaluating factorial using recursion:");
		System.out.println("3! = " + f.factR(3));
		System.out.println("4! = " + f.factR(4));
		System.out.println("5! = " + f.factR(5));

		System.out.println("\nEvaluating factorial using iteration:");
                System.out.println("3! = " + f.factI(3));
                System.out.println("4! = " + f.factI(4));
                System.out.println("5! = " + f.factI(5));
	
		System.out.println("\nExample of static variable usage");

		StaticVar ob1 = new StaticVar();
		StaticVar ob2 = new StaticVar();

		ob1.x = 10;
		ob2.x = 20;
		System.out.println("x variables are independent in different class instances");
		System.out.println("ob1.x = " +  ob1.x + " ob2.x = " + ob2.x);

		StaticVar.y = 19;
		System.out.println("y variable is shared in different class instances");
                System.out.println("ob1.y = " +  ob1.y + " ob2.y = " + ob2.y);

		System.out.println("\nFor y = 19");
		System.out.println("ob1.sum() = " +  ob1.sum() + " ob2.sum = " + ob2.sum());
		StaticVar.y = 100;
		System.out.println("\nFor y = 100");
                System.out.println("ob1.sum() = " +  ob1.sum() + " ob2.sum = " + ob2.sum());
		
		System.out.println("\nExample of static class initializing");

		StaticBlock ob3 = new StaticBlock("New instance of 'StaticBlock'");
		System.out.println("Square root of 2: " + StaticBlock.root2 + "\nSquare root of 3: " + StaticBlock.root3);
		
		System.out.println("\nExample of class nesting");
		int[] arr = {5, 6, -9, 10, 50, -67};
		Outer ob4 = new Outer(arr);
		System.out.println("Outer ob4.analyze:"); 
		ob4.analyze();
		System.out.println("\nExample of class creation inside main program");
		////////////////////////
		class ShowBt {
        		private int numbits;

        		ShowBt (int n){numbits = n;}

        		void show(long val){
                		long mask = 1;
                		//Leftshift value 1
                		mask <<=numbits-1;

                		int spacer = 0;
                		for(;mask != 0; mask >>>= 1){
                        		if ((val & mask) != 0)  {System.out.print("1");}
                        		else                    {System.out.print("0");}
                        		spacer++;
                        		if ((spacer%8) == 0)    {System.out.print(" "); spacer = 0;}
                		}
        		}
		}
		///////////////////
	
		for (byte b = 0; b < 10; b++){
			ShowBt byteval = new ShowBt(8);
			System.out.print("\n" + b + " in binary equals: ");
			byteval.show(b);

		}

		System.out.println("\nExample of class method using various argument nuber:");

		VarArgs.vaTest();
		VarArgs.vaTest(10);
		VarArgs.vaTest(11, 12, 13, 14);

		System.out.println("\nExample of class method using various argument nuber along with regular arguments:");

                VarArgs.vaTest2("test");
                VarArgs.vaTest2("test", 10);
                VarArgs.vaTest2("test", 11, 12, 13, 14);

		System.out.println("\nExample of using overload on class method using various argument nuber:");

                //VarArgs.vaTest3(); //does not compile due to ambiguos expression
                VarArgs.vaTest3(11, 12, 13);
                VarArgs.vaTest3(true, false, false);
		VarArgs.vaTest3("msg1","msg2","msg3");

	}
	
}
