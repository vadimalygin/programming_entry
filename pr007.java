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

	}
}
