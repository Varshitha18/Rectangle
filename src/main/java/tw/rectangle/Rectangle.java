package tw.rectangle;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int area() {
		if(length < 0 || breadth < 0)
			throw new IllegalArgumentException("Area for negative sides cannot be calculated");
		return length*breadth;
	}

	public int perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+breadth);
	}
}
