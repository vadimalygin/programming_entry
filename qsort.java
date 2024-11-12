class QuickSort {
	static void qsort(char[] items){
		qs(items, 0, items.length - 1);
	}

	private static void qs(char[] items, int left, int right){
		int i = left, j = right;
		char x = items[(left + right)/2], y;

		do {
			while((items[i] < x) && (i < right)) i++;
			while((x < items[j]) && (j > left)) j--;

			if(i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;

				i++; j--;
			}
		} while(i <= j);

		if(left < j) qs(items, left, j);
		if(i < right) qs(items, i, right);
	}
}

class qmain {
	public static void main(String args[]){
		char[] a = {'d','e','a','f','c','b','h','g'};
		int i;
		
		System.out.println("\n Starting array");
		for (i = 0; i< a.length; i++){
			System.out.print(a[i]+" ");
		}
		
		QuickSort.qsort(a);

		System.out.println("\n Sorted array");
                for (i = 0; i< a.length; i++){
                        System.out.print(a[i]+" ");
                }
	}
}
