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
	}
}
