class auto{
	String type;
	private int pass_num; //number of passengers
	private int tank;//fuel tank's volume
	private double fuel_usage;// gas usage (liters per 100 kilometer)
			  //
	void milage(){
		System.out.println(type + " will pass out after " + milage_num() + " kilometers");	
	}

	int milage_num() {
		return (int)(tank / fuel_usage * 100);
	}

	double fuel_needed (int kilometers){
		return (double)(kilometers * 0.01 * fuel_usage);
	}

	auto(String name, int seats, int tnk, double fl_u){
		type = name;
		pass_num = seats;
		tank = tnk;
		fuel_usage = fl_u;
	}

	int getPass_num(){return pass_num;}
	int getTank(){return tank;}
	double getFuel_usage(){return fuel_usage;}

	void setPass_num(int x){pass_num = x;}
	void setTank(int x){tank = x;}
	void setFuel_usage(double x){fuel_usage = x;}
}

class Truck extends auto {
	private int cargo_cap;
	Truck(String name, int p, int t, double f, int c){
		super(name, p, t, f);
		cargo_cap = c;
	}

	int getCargo() {return cargo_cap;}
	void setCargo(int c){cargo_cap = c;}
}

class pr004 {
	public static void main(String args[]){
		//Creating an object
		//
		auto lada = new auto("Lada", 4, 40, 5.5) , porsche = new auto("Porsche", 1, 100, 14.0);
		Truck gazel = new Truck("Gazel", 2, 100, 25.5, 3500), ural = new Truck("Ural", 3, 200, 35.1, 5000);
		double milage;

		//setting values for objects variables
		/*
		lada.type = "Lada";
		lada.pass_num = 4;
		lada.tank = 40;
		lada.fuel_usage = 5.5;
		System.out.println("Lada needs " + lada.fuel_needed(10) + " for 10 kilometers");
		*/  // Not needed because initialisation method has been created 

		milage = 10;
		System.out.println("Lada needs " + lada.fuel_needed((int)(milage)) + " for 10 kilometers");

		/*
		porsche.type = "Porsche";
		porsche.pass_num = 1;
		porsche.tank = 100;
		porsche.fuel_usage = 14.0;
		*/

		System.out.println("Porsche needs " + porsche.fuel_needed(10) + " for 10 kilometers");
		System.out.println("Gazel needs " + gazel.fuel_needed(10) + " for 10 kilometers");
		System.out.println("Ural needs " + ural.fuel_needed(10) + " for 10 kilometers");


		//lada = porsche;

		//calculation of milage for lada then fuel tank is full
		//
		/*
		milage = lada.tank / lada.fuel_usage *100;
		System.out.println("Lada will pass out after " + (int)(milage) + " kilometers");
		milage = porsche.tank / porsche.fuel_usage *100;
		System.out.println("Porsche will pass out after " + (int)(milage) + " kilometers");
		*/

		lada.milage();
		milage = lada.milage_num();
		System.out.println("Called milage_num for lada: " + milage);

		porsche.milage();
		milage = porsche.milage_num();
		System.out.println("Called milage_num for porsche: " + milage);
		
		gazel.milage();
                milage = gazel.milage_num();
                System.out.println("Called milage_num for gazel: " + milage);
		
		ural.milage();
                milage = ural.milage_num();
                System.out.println("Called milage_num for ural: " + milage);

		System.out.println("Gazel can carry " + gazel.getCargo() + " kilos of cargo");
		System.out.println("Ural can carry " + ural.getCargo() + " kilos of cargo");
	}
}
