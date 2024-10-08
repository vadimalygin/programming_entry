// Массивы и строки
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

		
	}
} 
