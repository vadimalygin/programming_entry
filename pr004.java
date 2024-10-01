class auto{
	int pass_num; //number of passengers
	int tank;//fuel tank's volume
	double fuel_usage;// gas usage (liters per 100 kilometer)
			  //
	
}


class pr004 {
	public static void main(String args[]){
		//Creating an object
		//
		auto lada = new auto();
		double milage;

		//setting values for objects variables
		//
		lada.pass_num = 4;
		lada.tank = 40;
		lada.fuel_usage = 9.5;

		//calculation of milage for lada then fuel tank is full
		milage = lada.tank / lada.fuel_usage *100;
		System.out.println("Lada will pass out after " + milage + " kilometers");
	}
}
