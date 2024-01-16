package geometry;

public class Triangle extends Body {
	
	private double siteA;
	private double siteB;
	private double siteC;
	private double height;
	
	public Triangle(double x, double y, double a, double b, double c, double h) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
		this.siteA = a;
		this.siteB = b;
		this.siteC = c;
		this.height = h;
	}
	
	@Override
	public double circumference() {
		return (this.siteA + this.siteB + this.siteC);
	}

	@Override
	public double area() {
		return ((this.siteA / 2) * this.height);
	}
	
	public String toString() {
		return "Triangle:\n\t" + "Length of site a: " + this.siteA + 
				"\n\tLength of site b: " + this.siteB + 
				"\n\tLength of site c: " + this.siteC + 
				"\n\tHeigth: " + this.height;
	}

}
