package com.assignmentone;

public class CalculatorMain {
	public static void main(String[] args) {
	Calculator c = new Calculator();
	c.add(4, 6);
	c.add(4.2, 6);
	c.add(4, 5.6);
	c.add(6.4, 5);
	c.diff(4, 5);
	c.diff(5.6, 7.8);
	c.diff(3, 2.4);
	c.diff(7.6, 8.6);
	c.mul(4, 5);
	c.mul(8.9, 5.1);
	c.mul(7, 4.5);
	c.mul(6.7, 9);
	c.div(15, 6);
	c.div(46, 8);
	c.div(9, 3.2);
	c.div(7.1, 1);
	}
}