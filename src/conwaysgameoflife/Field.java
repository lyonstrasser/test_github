package conwaysgameoflife;

public class Field {
	
	private int length;
	private int width;
	
	public Field (int length, int width) {
		this.setLength(length);;
		this.setWidth(width);
	}

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length > 0) {
			this.length = length;
		}
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width > 0) {
			this.width = width;
		}
	}
	
	
	
}
