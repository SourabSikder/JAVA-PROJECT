package LabTest2;
//implements the interface Shape in class Area
public class Area implements Shape {
	
	//Declare the Static variable PI
	static double PI=3.14;
	//Declare instance variables
	int length;
	int breadth;
	int side;
	int radius;
	//Default Constructor
	Area()
	{
		super();	
	}
	//Parameterized Constructor
	public Area(int length, int breadth, int side, int radius) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.side = side;
		this.radius = radius;
	}

//Override the abstract method
@Override
public void rectangleArea() {
	System.out.println("Area of Rectangle:"+(length*breadth));
}
//Override the abstract method
@Override
public void squareArea() {
	
	System.out.println("Area of Square:"+(side*side));
}
//Override the abstract method
@Override
public void circleArea() {
	System.out.println("Area of Rectangle:"+(PI*radius*radius));
	
}
//Getter and Setter method
public static double getPI() {
	return PI;
}
public static void setPI(double pI) {
	PI = pI;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
public int getSide() {
	return side;
}
public void setSide(int side) {
	this.side = side;
}
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}

}
