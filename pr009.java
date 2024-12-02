// class relationships

class _2dShape {
	private double width, height;
	int common;
	
	_2dShape(){
		width = height = 0;
	}

	_2dShape(double p){
                width = height = p;
        }


	_2dShape (double w, double h){
		width = w;
		height = h;
	}

	double getWidth(){
		return width;
	}

	double getHeight(){
                return height;
        }

	void setWidth(double w){
                if (w > 200.0) width = 200.0;
		else width = w;
	}

	void setHeight(double h){
                if (h > 290.0) height = 290.0;
                else height = h;
        }

	void showDim() {
		System.out.println("Width & height = " + width + " & " + height);
	}
}

class Triangle extends _2dShape {
	String style;
	int common;

	Triangle() {
                super();
                style = "none";
        }

	Triangle(int a, int b){
		super.common = a;
		common = b;
		System.out.println("super.common = " + super.common + "\ncommon inside class = " + common);
	}

	Triangle(double p) {
                super(p);
                style = "filled";
        }
	
	Triangle(double w, double h, String s) {
		super(w, h);
		style = s;
	}

	double area(){
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Style: " + style);
	}
}

class Rectangle extends _2dShape {
	String outline;
	int common;

	Rectangle () {
                super();
                outline = "none";
        }

	Rectangle(int a, int b){
                super.common = a;
                common = b;
		System.out.println("super.common = " + super.common + "\ncommon inside class = " + common);
        }

	Rectangle (double p) {
                super(p);
                outline = "solid";
        }

	Rectangle (double w, double h, String o) {
		super(w, h);
                outline = o;
        }

	double area() {
		return getWidth() * getHeight();
	}

	void showOutline() {
                System.out.println("Outline: " + outline);
        }

	boolean isSquare() {
		if(getWidth() == getHeight()) return true;
		return false;
	}
}

public class pr009 {
	public static void main(String args[]){
		Triangle t1 = new Triangle(4.0);
		Triangle t2 = new Triangle(8.0, 12.0, "bordered");
		Triangle t3 = new Triangle();
		Triangle t4 = new Triangle(5, 10);
		
		t3 = t2; //pseudoname for t2 is t3

		System.out.println("\nt1 info:\nArea: " + t1.area());
		t1.showDim();
		t1.showStyle();

		System.out.println("\nt2 info:\nArea: " + t2.area());
                t2.showDim();
                t2.showStyle();

		System.out.println("\nt3 info:\nArea: " + t3.area());
                t3.showDim();
                t3.showStyle();

		Rectangle r1 = new Rectangle(4.0);
		Rectangle r2 = new Rectangle(8.0, 12.0, "dash");
		Rectangle r3 = new Rectangle();

		System.out.println("\nr1 info:\nArea: " + r1.area() + "\nIs a square: " + r1.isSquare());
                r1.showDim();
                r1.showOutline();


                System.out.println("\nr2 info:\nArea: " + r2.area() + "\nIs a square: " + r2.isSquare());
                r2.showDim();
                r2.showOutline();

		System.out.println("\nr3 info:\nArea: " + r3.area() + "\nIs a square: " + r3.isSquare());
                r3.showDim();
                r3.showOutline();
	}
}
