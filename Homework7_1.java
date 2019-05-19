/*
Ermiyas Liyeh
30711570
Lab Section - MW 2:00PM to 3:15PM 
I did not collaborate with anyone on this assignment.
*/

public class Homework7_1 {
	public static void main(String [] args) {
		rectangle shape1 = new rectangle();
		square shape2 = new square(shape1.height);
		Ellipse shape3 = new Ellipse();
		circle shape4 = new circle(shape3.semiMajorAxis);
		
		shape1.height = 40.0;                  shape2.height = shape1.height;
		shape1.width = 20.0;
		shape3.semiMajorAxis = 15.5;           shape4.semiMajorAxis = shape3.semiMajorAxis;
		shape3.semiMinorAxis = 10.0;
		
		//shape1.setcolor("White");
		//shape2.setfilled(true);
		
		System.out.println("The Area of the rectangle is: " + shape1.getArea());
		System.out.println("The Area of the square is: " + shape2.getArea());
		System.out.println("The Area of the Ellipse is: " + shape3.getArea());
		System.out.println("The Area of the circle is: " + shape4.getArea());
	}
}

abstract class Shape{
	protected String color;
	protected boolean filled;
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public boolean isfilled() {
		return filled;
	}
	public void setfilled(boolean filled) {
		this.filled = filled;
	}
	
}


abstract class Shape2D extends Shape{
	
	abstract public double getArea();

}

class rectangle extends Shape2D{
	protected double height;
	protected double width;
	
	@Override
	public double getArea() {
		return height*width;
	}	
	
}

class square extends rectangle{
	
	public square(double height) {
		this.height = height;
	}
	
	public void setArea(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return height*height;
	}
}

class Ellipse extends Shape2D{
	protected double semiMajorAxis;
	protected double semiMinorAxis;
	
	@Override
	public double getArea(){
		return Math.PI*semiMajorAxis*semiMinorAxis;
	}
}

class circle extends Ellipse{
	
	public circle(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}
	
	public void setArea(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(semiMajorAxis, 2);
	}
}

/*
1. Define the following class hierarchy for shapes:
(a) Define an abstract class Shape. Shapes have a color (which can be a string for
now) and a boolean indicating whether or not they are filled. These should be
properly encapsulated.

(b) Define an abstract class Shape2D that extends Shape. This class should define
the abstract method getArea() that returns the area of a a Shape2D.

(c) Define a class Rectangle that extends Shape2D. A rectangle has a height and
a width. Implement the getArea() method appropriately. Use the @Override
annotation.

(d) Define a class Square that extends Rectangle. The class should have an appropriate constructor and also override setter methods as approrpiate to preserve
“squareness.”

(e) Define a class Ellipse that extends Shape2D. An ellipse has a semi-major axis
a and a semi-minor axis b (look it up if needed). The area of an ellipse is A = πab.

(f) Define a class Circle that extends Ellipse. You need appropriate contructor(s) and setter(s) for the class.
Illustrate all of these with a main method in a separate test class.

*/