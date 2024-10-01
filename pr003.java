class  pr003 {
	public static void main(String args[]) throws java.io.IOException {
		char ch, ignore;
		System.out.print("нажмите любую клавишу на клавиатуре и нажмите ENTER ");
		ch = (char) System.in.read();
		System.out.println("Вы нажали: " + ch);
		
		//Угадывание буквы
                //Пример использования проверки условия
                char answer = 'r';
                if (ch == answer)
                        System.out.println("Буква указана верно");
                else
                        System.out.println("Буква указана неверно");

                //Работа с вложенными операторами if
                System.out.println("\n");
                int i=9, k=110, j=10, a = 5, b = 15, c = 25, d = 35;

                if(i==10) {
                        if(j<20)
                                a = b;
                        if(k>100)
                                c = d;
                        else a = c;
                }
                else a=d;

		System.out.println("a = " + a + " c = " + c + " d = " + d);

		 //Цепочка if-else-if

                System.out.println("\n");

                int x;

                for (x=0; x<6; x++) {
                        if (x==1)
                                System.out.println("Значение x равно 1");
                        else if (x==2)
                                System.out.println("Значение x равно 2");
                        else if (x==3)
                                System.out.println("Значение x равно 3");
                        else if (x==4)
                                System.out.println("Значение x равно 4");
                        else
                                System.out.println("Значение х не находится между 1 и 4");
		}

		

		 //оператор switch

                System.out.println("\n");

                int ii;
                for (ii=0; ii<10; ii++)
                        switch(ii) {
                                case 0:
                                        System.out.println("ii равно 0");
                                        break;
                                case 1:
                                        System.out.println("ii равно 1");
                                        break;
                                case 2:
                                        System.out.println("ii равно 2");
                                        break;
                                case 3:
                                        System.out.println("ii равно 3");
                                        break;
                                case 4:
                                        System.out.println("ii равно 4");
                                        break;
                                default:
                                        System.out.println("ii больше или равно 5");
                }

		//Пример вложенного switch
                System.out.println("\n");
                char ch1 = 'q', ch2 = 'h';
                switch(ch1) {
                        case 'q':
                                System.out.println("Внешний switch");
                                switch(ch2) {
                                        case 'q':
                                                System.out.println("Внешний switch");
                                                break;
                                        case 'h':
                                                System.out.println("Внутренний  switch");
                                                break;
                                }
                                break;
                        case 'h':
                                System.out.println("Не выведется");
                                break;
                }
		
		//Оператор цикла

		System.out.println("\n");

		double num, sroot, rerr;

		for(num = 1; num < 100; num++){
			sroot = Math.sqrt(num);
			System.out.println("Квадратный корень числа " + num + " равен " + sroot);
			//Вычисление погрешности
			rerr = Math.abs(num - sroot * sroot);
			System.out.println("Ошибка округления составляет: " + rerr);
		}
		System.out.println("\n");
		int x1;
		
		for(x1 = 100; x1>-100; x1-=5){
			System.out.print(" "+ x1);
		}
		System.out.println("\n");
		int o7, j7;
		for (o7 = 0, j7 = 10; o7<j7; o7++,j7--){
			System.out.println("o7 = " + o7 + " j7 = " + j7);
		}

		int i8;
		System.out.println("Для остановки цикла нажмите клавишу 'S' ");
		for(i8=0;(char)System.in.read()!='S';i++){
			do{
                                ignore = (char)System.in.read();
                        }while(ignore!= '\n' );
		}
		

		for(i8 = 0; i8 < 10;){
			System.out.println("Иттерация № " + i8);
			i8++;
		}

		for(; i8 < 20;){
                        System.out.println("Иттерация № " + i8);
                        i8++;
                }
		
		//Бесконечный цикл
		for(;;){
			ch = (char)System.in.read();
			if (ch == 'q') break;
		}
		
		int sum = 0;
		for(i8 = 1; i8 <= 5;sum+=i8++);
		System.out.println("Сумма чисел равна: " + sum);

		//while
		
		ch = 'а';
		while(ch<='я'){
			System.out.print(ch);
			ch++;
		}
		System.out.println();

		int e, result;
		for(int i9 = 0 ; i9<10;i9++){
			result = 1;
			e = i9;
			while (e>0){
				result*=2;
				e--;
			}
			System.out.println("Два в степени " + i9 + " равно " + result);
		}

		//Цикл ду-вайл
		//
	
		do {
			System.out.print("Нажмите клавишу, затем ENTER: ");
			ch = (char)System.in.read();
			do{
				ignore = (char)System.in.read();
			}while(ignore!= '\n' );
		}while(ch!='q');

		//operator break
		//
		for(x1 = 100; x1>-100; x1-=5){
                        System.out.print(" "+ x1);
			if(x1 == 50) {
				System.out.println();
				break;
			}
                }
		
		//break c вложенными циклами
		//
		for(int i10 = 0; i10<3;i10++){
			System.out.println("Внешний цикл: " + i10);
			int t = 0;
			System.out.print(" Внутренний цикл: ");
			while(t < 100){
				if (t == 10) break;
				System.out.print(t + " ");
				t++;
			}
			System.out.println();
		}

		// Использование оператора брейк с меткой
		//

		for (int i9 = 1; i9<4; i9++){
one:			{ 
two:				{
three:					{
						System.out.println("\n i9 = " + i9);
						if(i9 == 1) break one;
						if(i9 == 2) break two;
						if(i9 == 3) break three;
						System.out.println("Окончание цикла");
					}
					System.out.println("После блока three");
				}
				System.out.println("После блока two");
			}
			System.out.println("После блока one");
		}
		System.out.println("После цикла фор с метками");

		//второй пример
		//
done:		{
			for(int i9 = 0; i9<10; i9++){
				for(int j9 = 0; j9<10; j9++){
					for(int k9 = 0; k9<10; k9++){
						System.out.println(k9 + " ");
                        			if (k9 == 5) break done;
					}
					System.out.println("После k9");
                        	}
				System.out.println("После j9");
			}
			System.out.println("После i9");
		}

		System.out.println("\n");

		//третий пример
		//
stop1:		for(int i9 = 0; i9<5; i9++){
			for(int j9 = 0; j9<5; j9++){
				if(j9 == 2) break stop1;
				System.out.println("i9 = " + i9 + " j9 = "+ j9);
			}	
		}
		System.out.println("\n");

		for(int i9 = 0; i9<5; i9++){
stop2:			for(int j9 = 0; j9<5; j9++){
                                if(j9 == 2) break stop2;
                                System.out.println("i9 = " + i9 + " j9 = "+ j9);
                        }
                }

		//continue
		//
		System.out.println("\n");
		
	}
}
