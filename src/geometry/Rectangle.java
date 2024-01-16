package geometry;

public class Rectangle extends Body {
	
	private double length;
	private double width;
	
	public Rectangle(double x, double y, double length, double width) {
		this.setxCoordinate(x);
		this.setyCoordinate(y);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double circumference() {
		return (2*this.length + (2*this.width));
	}

	@Override
	public double area() {
		return this.length * this.width;
	}

}
