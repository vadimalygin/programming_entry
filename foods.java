class Food {
        private String name;
        private int date_of_production;
        protected int spoil_time;

        Food(){
                name = "Yummy";
                spoil_time = 0;
                date_of_production = 0;
        }

        Food(String n, int d, int s){
                name = n;
                spoil_time = s;
                date_of_production = d;
        }

        Food(Food ob){
                name = ob.name;
                spoil_time = ob.spoil_time;
                date_of_production = ob.date_of_production;
        }

	String getName(){
		return name;
	}

        boolean isSpoiled(int current_date){
                if (dateCompare(current_date) >= spoil_time){
                        return true;
                }
                return false;
        }

        protected int dateCompare(int current_date){
                return current_date - date_of_production;
        }
}

class Dairy extends Food {
        int percentage;

        Dairy(){
                super();
                percentage = 0;
        }

        Dairy(String n, int d, int s, int p){
                super(n, d, s);
                percentage = p;
        }

        Dairy(int d, int s, int p){
                super("dairy", d, s);
                percentage = p;
        }

        Dairy(Dairy ob){
                super(ob);
                percentage = ob.percentage;
        }

        boolean isSpoiled(int current_date){
                if(dateCompare(current_date) * (percentage+100) / 100 >= spoil_time){
                        return true;
                }
                return false;
        }
}

class Vegetable extends Food {
        char ripeness; // 'r' -  ripe, 'y' - riping, 'g' - green

        Vegetable(){
                super();
                ripeness = 0;
        }

        Vegetable(String n, int d, int s, char r){
                super(n, d, s);
                ripeness = r;
        }

        Vegetable(int d, int s, char r){
                super("vegetable", d, s);
                ripeness = r;
        }

        Vegetable(Vegetable ob){
                super(ob);
                ripeness = ob.ripeness;
        }

        boolean isSpoiled(int current_date){
                int percentage = 0;
		switch(ripeness){
			case 'r':
				percentage = 30;
				break;
			case 'y':
				percentage = 20;
				break;
			case 'g':
				percentage = 10;
				break;
			default:
				System.out.println("Your ripeness value is not of form ('r', 'y', 'g')\nPerhaps you used Vegetable() constructor");
				return false;
		}
		if(dateCompare(current_date) * (percentage+100) / 100 >= spoil_time){
                        return true;
                }
                return false;
        }
}

class foods {
        public static void main(String args[]){
		//Array of foods creation
		Food[] foods = new Food[5];
		
		foods[0] = new Food("apple", 3, 10);
		foods[1] = new Dairy("milk", 4, 5, 32);
		foods[2] = new Vegetable("bell pepper", 2, 12, 'r');
		foods[3] = new Dairy(5, 7, 25);
		foods[4] = new Vegetable(1, 9, 'g');

		//Methods in action
		int current_date = 10;

		if (args.length != 0) {
			current_date = Integer.parseInt(args[0]);
		}

		for (int i = 0; i < foods.length; i++) {
			System.out.println(foods[i].getName() + " is spoiled: " + foods[i].isSpoiled(current_date));	
		}
        }
}

