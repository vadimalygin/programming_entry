class pr001 {
	public static void main(String args[]){
		System.out.println("Первая программа на Java"); //Выводим строку на консоль
		int var1 = 1024;
		int var2;
		//System.out.println(var2); ошибка: переменной не присвоенно значение
		var2 = 411;
		System.out.println(var1/2);
		System.out.println("Результат целочисленного деления: " + var2/2);
		double var3;
		System.out.println("Результат дробного деления: " + (double)var2/2);
		System.out.println();

		//Пример использования оператора if
		/*if(var1 = 0){
			System.out.println("Условие вар1=0 выполнено");
		} небулевый результат присвоения*/
		if(var1/2 == 512){
                        System.out.println("Условие \"var1/2=512\" выполнено");
                }
		if(true){
                        System.out.println("\tУсловие true \n\tвыполнено");
                }
		System.out.println("Строка проверки");
		System.out.println();
		
		//Циклы
		for (int i = 0; i<10; i++){
			System.out.println("Строка № " + i);
		}
		//i = 10 Переменная i локальная и существует только во время выполнения цикла
		System.out.println();
		int j;
		for (j = 0; j<10; j++){
                        System.out.print(j + " ");
                }
		System.out.println();
	}
}
