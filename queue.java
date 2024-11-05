class queue {
	private char[] q;
	private int getloc, putloc; //pointers for elements of a queue
	
	public queue (int size){
		q = new char[size];
		putloc = getloc = 0;
	}

	public queue (queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		for (int i = getloc; i < putloc; i++) {
			q[i] = ob.q[i];
		}
	}

	public queue (char[] arr){
		putloc = 0;
		getloc = 0;
		q = new char[arr.length];

		for(int i = 0; i < arr.length; i++) {
			put(arr[i]);
		}
	}

	//Method for putting an element in a queue
	public void put(char ch){
		if (putloc == q.length){
			System.out.println("Queue overflow. Can't put an element");
			return;
		}
		q[putloc++] = ch;
	}

	//Method for getting an element from queue
	public char get(){
		if(getloc == putloc){
			System.out.println("Empty queue. Can't get an element");
			return ((char) 0) ;
		}

		return q[getloc++];
	}
}

class QueueMain {
	public static void main (String[] args){
		queue big = new queue(100);
		queue small = new queue(4);
		char ch;

		int i;
		

		System.out.println("\nUsing 'big' for saving symbols");
		for(i = 0; i < 26; i++){
			big.put((char)('A' + i));
		}

		System.out.println("\nContainments of 'big': ");
		for(i = 0; i < 26; i++){
                        ch = big.get();
			if (ch != ((char) 0)){
				System.out.print(ch + " ");
			}else{
				break;
			}
                }


		System.out.println("\nUsing 'small' and trying to overflow: ");
		for(i = 0; i < 5; i++){
			System.out.print("Try #" + i + " ");
                        small.put((char)('A' + i));
                }

		System.out.println("\nContainments of 'small'");
		for(i = 0;; i++){
                        ch = small.get();
                        if (ch != ((char) 0)){
                                System.out.print(ch + " ");
                        }else{
                                break;
                        }
                }
		
		//big.q[3] = 'e';	//would not compile in this version due to privacy
		//big.putloc = 50; 	//would not compile in this version due to privacy
	
		System.out.println("\n\n Using cnstructor overload");
		
		queue q1 = new queue(10);
		queue q2 = new queue(new char[] {'I', 'v', 'a', 'n'});
		for (i = 0; i < 10; i++) {
			q1.put((char)('A' + i));
		}
		queue q3 = new queue(q1);


		System.out.println("\n\tq1:");
		for (i = 0; i < 10; i++) {
                        System.out.print(q1.get() + " ");
                }
		System.out.println("\n\tq2:");
                for (i = 0; i < 4; i++) {
                        System.out.print(q2.get() + " ");
                }
		System.out.println("\n\tq3:");
                for (i = 0; i < 10; i++) {
                        System.out.print(q3.get() + " ");
                }

		System.out.println("\n");


	}
}
