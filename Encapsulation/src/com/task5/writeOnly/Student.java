/*
 If we do not define the getter method in the class then fields can be made write-only.
 We will not define getter method and constructor because we can 
 send direct values of the parameter using constructor.
 */
package com.task5.writeOnly;

public class Student {
	private String name;
	private int roll_num;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setRollNum(int roll_num) {
		this.roll_num=roll_num;
	}
	public void show() {
		System.out.println(name);
		System.out.println(roll_num);
	}

}
