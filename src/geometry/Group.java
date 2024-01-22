package geometry;

import java.util.ArrayList;

public class Group {
	
	ArrayList<Body> bodies = new ArrayList<Body>();
	
	/**
	 * Adds a body to the list of all bodies
	 * @param body
	 */
	public void addBody(Body body) {
		this.bodies.add(body);
	}
	
	/**
	 * Removes a body from the list of all bodies
	 * @param body
	 */
	public void removeBody(Body body) {
		this.bodies.remove(body);
	}
	
	/**
	 * Calculates the whole circumference of all bodies 
	 * @return
	 */
	public double overallCircumference() {
		double circumference = 0;
		for(Body b : this.bodies) {
			circumference += b.circumference();
		}
		return circumference;
	}
	
	/**
	 * Calculates the whole area of all bodies
	 * @return
	 */
	public double overallArea() {
		double area = 0;
		for(Body b : this.bodies) {
			area += b.area();
		}
		System.out.println(area);
		return area;
	}
	
	/**
	 * Prints out all the bodies from the list on the console
	 */
	public void printBodies() {
		for(Body b : this.bodies) {
			System.out.println(b);
		}
	}
	
}
