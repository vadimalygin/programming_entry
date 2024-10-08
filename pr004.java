class auto{
	String type;
	int pass_num; //number of passengers
	int tank;//fuel tank's volume
	double fuel_usage;// gas usage (liters per 100 kilometer)
			  //
	void milage(){
		System.out.println(type + " will pass out after " + (int)(tank / fuel_usage *100) + " kilometers");	
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
}


class pr004 {
	public static void main(String args[]){
		//Creating an object
		//
		auto lada = new auto("Lada", 4, 40, 5.5) , porsche = new auto("Porsche", 1, 100, 14.0);
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

		porsche.type = "Porsche";
		porsche.pass_num = 1;
		porsche.tank = 100;
		porsche.fuel_usage = 14.0;
		System.out.println("Porsche needs " + porsche.fuel_needed(10) + " for 10 kilometers");


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
		


	}
}
