class pr002 {
	public static void main(String args[]){
		byte b, bb, bbb; //8-битная переменная
		short s, ss, sss; //16-битная переменная
		int i, ii, I;//32-битная переменная
		long l, ll, L;//64-битная переменная
		
		b = 127;
		bb = (byte)128;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;

		//bbb = sss; Автопреопразование типов запрещено, так как может привести к искажению значений
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);

		// Пример использования различныхцелых типов данных
		ii = 700000; //Сторона куба в мм
		int v = ii*ii*ii; // Объём куба в мм3
		System.out.println("Объём куба " + v);

		long vv = (long)ii*ii*ii; // Объём куба в мм3
                System.out.println("Объём куба " + vv);

		double d, dd;
		d = b/2;
		System.out.println("d = " + d);
		dd = (double)b/2;
                System.out.println("dd = " + dd);

		
	}
}
