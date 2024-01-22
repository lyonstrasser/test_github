package geometry;

public class Test {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(3, 4, 5, 2);
		Rectangle r2 = new Rectangle(1, 2, 3, 4);
		
		Group group = new Group();
		
		group.addBody(r);
		group.addBody(r2);
		group.printBodies();
		group.overallArea();
		group.biggestBody();
		
	}

}
