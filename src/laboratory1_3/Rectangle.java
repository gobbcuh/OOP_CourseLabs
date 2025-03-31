package laboratory1_3;

public class Rectangle 
{
	private double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double setLength(double length) {
		this.length = length;
		return length;
	}
	
	double setWidth(double width) {
		this.width = width;
		return width;
	}
	
	double getLength() {
		System.out.print("Length: ");
		return length;
	}
	
	double getWidth() {
		System.out.print("Width: ");
		return width;
	}
}
