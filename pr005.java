// Массивы и строки
// 
//
class arrays {
	public static void main(String args[]){
		int[] sample = new int[10];
		int sample1[] = new int[10];
		int i;

		for(i = 0; i<10; i++){
			sample[i] = 2*i;
		}

		 for(i = 0; i<10; i++){
                       System.out.println("Элемент массива sample с индексом " + i + " :" + sample[i]);
                }
		
		sample1[0] = 99;
		sample1[1] = 20;
		sample1[2] = 90;
		sample1[3] = -242;
		sample1[4] = -20;
		sample1[5] = 3;
		sample1[6] = 53;
		sample1[7] = 51;
		sample1[8] = -67;
		sample1[9] = 22;

		int max, min;
		min = max = sample1[0];

		for (i = 1; i < 10; i++){
			if (sample1[i] < min) min = sample1[i];
			if (sample1[i] > max) max = sample1[i];
		}
		System.out.println("min = " + min + " max = " + max);

		//Инициализация массива 
		//
		int[] sample2 = {87, 100, -42, 34, 25, -25, -424, 62, 74, 8};

                min = max = sample2[0];

                for (i = 1; i < 10; i++){
                        if (sample2[i] < min) min = sample2[i];
                        if (sample2[i] > max) max = sample2[i];
                }

                System.out.println("min = " + min + " max = " + max);
		//Пузырьковая сортировка
		
		int size = sample2.length;
		int a, b, t;

		//Исходный массив
		System.out.print("Unsorted array: ");
		for(i = 0; i<size ; i++){
			System.out.print(sample2[i] + " ");
		} 
		System.out.println();

		//Sorting
		//
		for(a = 1; a < size; a++){
			for(b = size - 1; b >= a; b--){
				if(sample2[b-1]>sample2[b]){
					t = sample2[b-1];
					sample2[b-1] = sample2[b];
					sample2[b] = t;
				}
			}
		}

		//Sorted array
                System.out.print("Sorted array: ");
                for(i = 0; i<size ; i++){
                        System.out.print(sample2[i] + " ");
                }
                System.out.println();
		System.out.println();

		//2D arraays
		//
		int[][] arr2d = new int [10][20];
		int row, col;

		for (row = 0; row < 10; row++){
			for (col = 0; col < 20; col++){
				arr2d[row][col] = row * 100 + col + 1;
				System.out.print(arr2d[row][col] + " ");
				if(row == 0){
					if(arr2d[row][col]<10){
						System.out.print(" ");
					}
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("\nNumber of passengers per weekday in time:");

		int[][] arrivals = new int[7][];
		arrivals[0] = new int[10];
		arrivals[1] = new int[10];
		arrivals[2] = new int[10];
		arrivals[3] = new int[10];
		arrivals[4] = new int[10];
		arrivals[5] = new int[2];
		arrivals[6] = new int[2];
		
		int weekday, time;	
		for(weekday = 0; weekday < 7; weekday++){
			if(weekday<5){
				System.out.print("On working days: ");
			}else{
				System.out.print("On weekend days: ");
			}
			for(time = 0; time < arrivals[weekday].length; time++){
				arrivals[weekday][time] = weekday + time + 10;
				System.out.print(arrivals[weekday][time] + " ");
			}
			System.out.println();
		}

		System.out.println("\nPointers to arrays:");
		for(i = 0; i < 10; i++){
			sample[i] = i;
			sample1[i] = -i;
			System.out.println(sample[i] + " " + sample1[i]);
		}
		System.out.println("sample = " + sample + " sample1 = " + sample1);
		//sample1 = sample;
		System.out.println("sample = " + sample + " sample1 = " + sample1 + '\n');

		System.out.println("\nCopying of arrays:");
		if(sample1.length >= sample.length){
			for(i = 0; i < sample.length; i++){
                        	System.out.print("Before copying: sample1[" + i + "] = " + sample1[i] + " sample2[" + i + "] = " + sample[i]);
                       		sample[i] = sample1[i];
                        	System.out.println(" After copying:  sample1[" + i + "] = " + sample1[i] + " sample2[" + i + "] = " +sample[i]);

	                }

		}

	}
} 
