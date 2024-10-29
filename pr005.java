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
		

		System.out.println("\nCycle for-each");
		int summ = 0;
		for (i = 0 ; i < 10; i++){
			summ += sample2[i];
		}
		System.out.println(summ);
		summ = 0; 
		for (int x : sample2){
                        System.out.println("x value: " + x);
			summ += x;
                }
                System.out.println(summ + '\n');

		System.out.println("\nCycle for-each for 2d-arrays");
		summ = 0;
		int val = 22;
		boolean found = false;
		for(int[] x : arrivals){
			System.out.println("\nNew row");
			for (int y : x){
				if (y == val){
					found = true;
					break;
				}
				System.out.println("y value: " + y);
				summ += y;
			}
		}
		System.out.println("\nSumm: " + summ);
		if(found) System.out.println("val = " + val + " was found");

		System.out.println("\nWorking with strings");

                String str1 = new String("string12");
                String str2 = "string  ";
                String str3 = new String(str2);
                String str4 = new String(str2);
                
		System.out.println("\nExperementing with strings as pointers");
                str3 = str2;
                System.out.println(str3 + " " + str2);
		if (str3 == str2){
			System.out.println("Pointers point to same object");
		}
                str2 = "New string 2, string instead of str2";
		if (str3 == str2){
                        System.out.println("Pointers point to same object");
                }else {
			System.out.println("Pointers do not point to same object");
		}
                System.out.println(str3 + " " + str2);

                System.out.println("\nMethods of 'String' class\nComparing strings");

                if (str1.equals(str2))
                        System.out.println("Strings str1 and str2 are equal\n");
                else
                        System.out.println("Strings str1 and str2 are not equal\n");
  
                if (str3.equals(str4))
                        System.out.println("Strings str3 and str4 are equal\n");
                else
                        System.out.println("Strings str3 and str4 are not equal\n");
		if (str1 == str2) System.out.println("Strings str1 and str2 are equal by adress ('==')\n");
		else System.out.println("Strings str1 and str2 are not equal by adress ('==')\n");

                int result;
                result = str1.compareTo(str3);
                System.out.println("Result of comparing strings\nstr1 = " + str1 + "\nstr3 = " + str3 + "\nstr1.compareTo(str3) = " + result);
		
		//System.out.println("abc".compareTo("abb"));
		//System.out.println((int)('1' - ' '));	
		
		System.out.println("\nEvaluating string's length");
		System.out.println("\nstr1.length() = " + str1.length());
		System.out.println("\n\nReturning a symbol by index:");
		System.out.println("\nstr1.charAt(0) = " + str1.charAt(0) + '\n' + (int)(str1.charAt(1)));

		char ch;
		for (i = 0; i<str1.length(); i++){
			System.out.print(str1.charAt(i));
		}
		
		System.out.println("\n\nReturning substring's starting index");	
                System.out.println("First entrance of substring 'ring' in str2: " + str2.indexOf("ring"));
		System.out.println("Last entrance of substring 'ring' in str2: " + str2.lastIndexOf("ring"));

		System.out.println("\nString arrays");
		String[] strs = {"Elements" ,"of" ,"string" ,"array" ,"example"} ;
		System.out.println("Starting array: ");
		for(String s : strs){
			System.out.print(s + ' ');
		}
		System.out.println('\n');

		strs[2] = "changed string";
		strs[4] = "for another example";

		System.out.println("Resulting array: ");
                for(String s : strs){
                        System.out.print(s + " ");
                }
                System.out.println('\n');

		System.out.println("\nUsing substrings");
		str2 = "";
		str2 = strs[0] + " " + strs[1] + " " + strs[2] + " " + strs[3] + " " + strs[4];
		System.out.println("String str2: " + str2);
		String subs = str2.substring(9, 32);
		System.out.println("String str2 = " + str2 + "\nSubstring subs = " + subs);
	
		System.out.println("\nSwitch using strings");

		String command = "disconnect";
		switch (command) {
			case "connect":
				System.out.println("Connecting...");
				break;
			case "cancel":
				System.out.println("Cancelling...");
				break;
			case "disconnect":
                                System.out.println("Disconnecting...");
                                break;
			default:
                                System.out.println("Invalid command");
                                break;
		}
		
		System.out.println("\nText blocks");
		String str5 = 
			"""
			Just text 

			Sticking out your gyatt for the rizzler
			You're so skibidi
			You're so fanum tax
			I just wanna be your sigma

			""";
		System.out.println("Text block str5: " + str5);

		System.out.println("\ncmd Arguments");
		System.out.println("Programme sent " + args.length + " arguments\nArguments list");
		for (String s : args){
			System.out.println(s);
		}

		System.out.println("\nSearching for string in a list");
		String[][] nums = {
			{"Hospital", "269-55-55"},
			{"Power supply", "285-13-07"},
			{"Household maintenance", "206-57-93"},
			{"Energetics company", "313-13-13"}
		};

		if (args.length != 1){
			System.out.println("\n Too many arguments. Expected 1");
		}else {
			for (i = 0; i < nums.length; i++){
				if (nums[i][0].equals(args[0])){
					System.out.println(nums[i][0] + ": " + nums[i][1]);
					break;
				}
			}
		     	if (i == nums.length){
		       		System.out.println("String not found");		
		      	}	
		}
		

	}
} 
