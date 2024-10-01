class auto{
	String type;
	int pass_num; //number of passengers
	int tank;//fuel tank's volume
	double fuel_usage;// gas usage (liters per 100 kilometer)
			  //
	void milage(){
		System.out.println(type + " will pass out after " + (int)(tank / fuel_usage *100) + " kilometers");	
	}
}


class pr004 {
	public static void main(String args[]){
		//Creating an object
		//
		auto lada = new auto() , porsche = new auto();
		double milage;

		//setting values for objects variables
		//
		lada.type = "Lada";
		lada.pass_num = 4;
		lada.tank = 40;
		lada.fuel_usage = 5.5;

		porsche.type = "Porsche";
		porsche.pass_num = 1;
		porsche.tank = 100;
		porsche.fuel_usage = 14.0;

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
		porsche.milage();
	}
}
