package com.assignmentone;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e = new Employee("sandhya", 212, 21, "Junior Associate", "Bengaluru", 0);
		System.out.println("Employee Name = "+e.getEmpName());
		System.out.println("Employee ID = "+e.getEmpId());
		System.out.println("Employee Age = "+e.getEmpAge());
		System.out.println("Employye Designation = "+e.getEmpdesgn());
		System.out.println("Employee Location = "+e.getEmpLocation());
		System.out.println("Employee Experience = "+e.getEmpExpInYrs());
		System.out.println("--------------------------------------------------------");
		Employee e1 = new Employee("sandhya");
		System.out.println("Employee Name = "+e.getEmpName());
		System.out.println("--------------------------------------------------------");
		Employee e2 = new Employee("sandhya", 212);
		System.out.println("Employee Name = "+e.getEmpName());
		System.out.println("Employee ID = "+e.getEmpId());
		System.out.println("--------------------------------------------------------");
		Employee e3 = new Employee("sandhya", 212, 21);
		System.out.println("Employee Name = "+e.getEmpName());
		System.out.println("Employee ID = "+e.getEmpId());
		System.out.println("Employee Age = "+e.getEmpAge());
		System.out.println("--------------------------------------------------------");
		Employee e4 = new Employee("sandhya", 212, 21, 0);
		System.out.println("Employee Name = "+e.getEmpName());
		System.out.println("Employee ID = "+e.getEmpId());
		System.out.println("Employee Age = "+e.getEmpAge());
		System.out.println("Employee Experience = "+e.getEmpExpInYrs());
		System.out.println("--------------------------------------------------------");
		Employee e5 = new Employee("sandhya", 212, 21, "Junior Associate");
		System.out.println("Employee Name = "+e.getEmpName());
		System.out.println("Employee ID = "+e.getEmpId());
		System.out.println("Employee Age = "+e.getEmpAge());
		System.out.println("Employye Designation = "+e.getEmpdesgn());
	}
}
