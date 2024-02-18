/*
 Write a Java program to create a class called Circle with a private instance variable radius.
  Provide public getter and setter methods to access and modify the radius variable.
   However, provide two methods called calculateArea() and calculatePerimeter() that return 
   the calculated area and perameter based on the current radius value.
 */
package com.task3;

public class Circle {

	private double radius;
	double pie = 3.14;
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double area() {
		return pie*radius*radius;
	}
	public double circum() {
		return 2*pie*radius;
	}
}
