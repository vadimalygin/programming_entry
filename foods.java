class Food {
        String name;
        int date_of_production;
        int spoil_time;

        Food(){
                name = "Yummy";
                spoil_time = 0;
                date_of_production = 0;
        }

        Food(String n, int s, int d){
                name = n;
                spoil_time = s;
                date_of_production = d;
        }

        Food(Food ob){
                name = ob.name;
                spoil_time = ob.spoil_time;
                date_of_production = ob.date_of_production;
        }

        boolean isSpoiled(int current_date){
                if (dateCompare(current_date) >= spoil_time){
                        return true;
                }
                return false;
        }

        int dateCompare(int current_date){
                return current_date - date_of_production;
        }
}

class Dairy extends Food {
        int percentage;

        Dairy(){
                super();
                percentage = 0;
        }

        Dairy(String n, int s, int d, int p){
                super(n, s, d);
                percentage = p;
        }

        Dairy(int s, int p, int d){
                super("dairy", s, d);
                percentage = p;
        }

        Dairy(Dairy ob){
                super(ob);
                percentage = ob.pecentage;
        }

        boolean isSpoiled(int current_date){
                if(dateCompare(current_date) * (pecentage+100) / 100 >= spoil_time){
                        return true;
                }
                return false;
        }
}

class foods {
        public static void main(String args[]){

        }
}

