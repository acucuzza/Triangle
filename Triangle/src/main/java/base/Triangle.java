package base;

import java.lang.Math;
import base.GeometricObject;

public class Triangle extends GeometricObject {
	//default
	double s1 = 1.0;
	double s2 = 1.0;
	double s3 = 1.0;
	//no arg constructor
	public Triangle()
	{
		
	}
	//triangle Constructor
	public Triangle(double s1, double s2, double s3) 
	{
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	//getters
	public double getS1() 
	{
		return s1;
	}
	public double getS2() 
	{
		return s2;
	}
	public double getS3()
	{
		return s3;
	}
	
	//calculate area
	public double getArea() 
	{
		double perimeter = getPerimeter() * .5;
		double area = Math.sqrt(perimeter*(perimeter-s1)*(perimeter-s2)*(perimeter-s3));
		return area;
	}
	//calculate perimeter
	public double getPerimeter() 
	{
		double perimeter = s1 + s2 + s3;
		return perimeter;
	}
	//description
	public String toString()
	{
		return "Side 1 is" + s1 +"\n" + "Side 2 is " + s2 + "\n" + "Side 3 is" + s3 + "\n"  + "The perimeter is " + getPerimeter() + "\n" + "The area is " + getArea(); 
	}
}