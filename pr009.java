// class relationships

class _2dShape {
	double width, height;
	void showDim() {
		System.out.println("Width & height = " + width + " & " + height);
	}
}

class Triangle extends _2dShape {
	String style;

	double area(){
		return width * height / 2;
	}

	void showStyle() {
		System.out.println("Style: " + style);
	}
}

class pr009 {
	public static void main(String args[]){
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();

		t1.height = t1.width = 4.0;
		t1.style = "filled";

		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "bordered";

		System.out.println("\nt1 info:\nArea: " + t1.area());
		t1.showDim();
		t1.showStyle();

		System.out.println("\nt2 info:\nArea: " + t2.area());
                t2.showDim();
                t2.showStyle();
	}
}
