public class Rectangle {
	double length;
	double width;
		 
	public Rectangle() {
		length = 5;
		width = 6;
			
		}
	public Rectangle(double initLength, double initWidth){
		length = initLength;
		width = initWidth;
	}
	public double getArea() {
		return length * width;
		} 
	public double getPerimeter() {
		return 2*length + 2*width;
		} 
}
