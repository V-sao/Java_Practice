/*
 Write a Java program to create a class called BankAccount with private instance variables 
 accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
 */
package com.task2;

public class BankAccount {

	private int accountNumber;
    private double balance;
    
    public double getAccnum() {
    	return accountNumber;
    }
    public void setAccum(int accountNumber) {
    	this.accountNumber=accountNumber;
    }
    public double getBalance() {
    	return balance;
    }
    public void setBalance(int balance) {
    	this.balance=balance;
    }
    
}
