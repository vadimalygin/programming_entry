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
	}

}
