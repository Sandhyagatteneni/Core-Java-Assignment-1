package com.assignmentone;

public class Calculator {
	 
	 public void add(int a, int b) {
		 System.out.println("Addition of int and int = "+ (a+b));
	 }
	 public void add(double a, double b) {
		 System.out.println("Addition of double and double = "+ (a+b));
	 }
	 public void add(int a, double b) {
		 System.out.println("Addition of int and double = "+ (a+b));
	 }
	 public void add(double a, int b) {
		 System.out.println("Addition of double and int = "+ (a+b));
	 }
	 public void diff(int a, int b) {
		 System.out.println("Difference of int and int = "+ (a-b));
	 }
	 public void diff(double a, double b) {
		 System.out.println("Difference of double and double = "+ (a-b));
	 }
	 public void diff(int a, double c) {
		 System.out.println("Difference of int and double = "+ (a-c));
	 }
	 public void diff(double d, int b) {
		 System.out.println("Difference of double and int = "+ (d-b));
	 }
	 public void mul(int a, int b) {
		 System.out.println("Multiplication of int and int = "+(a*b));
	 }
	 public void mul(double c, double d) {
		 System.out.println("Multiplication of double and double = "+(c*d));
	 }
	 public void mul(int a, double c) {
		 System.out.println("Multiplication of int and double = "+(a*c));
	 }
	 public void mul(double d, int b) {
		 System.out.println("Multiplication of double and int = "+(d*b));
	 }
	 public void div(int a, int b) {
		 System.out.println("Division of int and int = "+(a/b));
	 }
	 public void div(double c, double d) {
		 System.out.println("Division of double and double = "+(c/d));
	 }
	 public void div(int a, double c) {
		 System.out.println("Division of int and double = "+(a/c));
	 }
	 public void div(double d, int b) {
		 System.out.println("Division of double and int = "+(d/b));
	 }
	 
}